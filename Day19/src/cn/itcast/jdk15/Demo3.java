package cn.itcast.jdk15;
/*
自定义类 实现Iterable 接口
因为只有实现了Iterable接口 才能使用增强for循环。
//自定一个类使用增强for循环

1.实现Iterable 接口
2.重写iterator方法 此方法返回一个迭代器
3.在方法内部写一个内部匿名类对象   实现Iterator接口 
重写接口相关方法。





 * */

import java.util.Iterator;
//实现接口                重写iterator() 方法
class person implements Iterable<String>{
	
	Object[] obj=new Object[10];
	int index=0;
	
	public void add(Object o){
	   obj[index++]=o;	
	}
    
	//重写方法
	@Override
	public Iterator<String> iterator() {
		
		//返回一个迭代器  匿名内部类实现一个迭代器接口
		return  new Iterator<String>(){
            //匿名内部类重写方法
			int cursor  = 0;

			@Override
			public boolean hasNext() {
				return cursor<index;
			}

			@Override
			public String next() {
				return (String)obj[cursor++];
			}

			@Override
			public void remove() {
				
			}
			
		};
	}
	
	
}


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person list =new person();
		list.add("jerry");
		list.add("eason");
		list.add("tom");
		
		for(String item : list){
			System.out.println(item);
		}
	}

}
