package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;

/*
判断
	isEmpty()     判断为空
	contains(Object o)
	containsAll(Collection<?> c)   //集合有包含另一个集合中的所有元素吗
*/
public class Demo3 {

	public static void main(String[] args) {
     //集合1
     Collection c=new ArrayList();
     System.out.println(c.isEmpty());   //空
     c.add("123");
     c.add("test");
     //集合2
     Collection c1=new ArrayList();
     c1.add("123");
     c1.add("test");
     System.out.println("是否相等"+c.contains("123"));
     System.out.println("成员是否全部相等"+c.containsAll(c1));
     
     
     ////集合添加自定义的元素
     Collection Cn=new ArrayList();
     Collection Cn1=new ArrayList();
     Cn.add(new person("jerry",1));
     Cn1.add(new person("jerry",1));
  // 其实contains方法内部是依赖于equals方法进行比较的。
     System.out.println(Cn);   //打印c 新添加的对象会只是一个内存地址
// 	System.out.println("判断集合是否为空元素："+ c.isEmpty());
//	System.out.println("判断集合中是否存在指定的元素："+ c.contains(""));*/
     System.out.println("Cn集合有包含Cn1集合中的所有元素吗"+Cn.containsAll(Cn1));  //true 
     //判断集合中是否存在指定的元素
     System.out.println("判断集合中是否存在指定的元素"+Cn.contains(new person("jerry",1)));
     
	}
}


class person{
	String name;
	int   ID;
	public person(String name,int ID){
		this.name=name;
		this.ID=ID;
	}
	
	
	// 返回该对象的哈希码值(大家可以把哈希码就 理解成是对象的内存地址)/
	//java规范： 一般重写equlas方法我们都会重写hashCode方法的。
	@Override
	public int hashCode() {
		return this.ID;
	}

    //	  重写toString之后，我们直接输出一个对象的时候，就会输出符合我们所需求的格式数据。
	@Override
	public String toString() {
		return "{姓名"+this.name+"编号"+this.ID+"}";
	}


	//重写Equals 方法  比较ID
	@Override
	public boolean equals(Object obj) {
		person p=(person)obj;
		return this.ID==p.ID;
	}
	
	
	
	
}
