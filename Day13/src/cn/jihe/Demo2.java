package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;

//集合
/*
 * 
 *  集合：集合是存储对象数据的集合容器。
 
集合比数组的优势：
	1. 集合可以存储任意类型的对象数据，数组只能存储同一种数据类型 的数据。
	2. 集合的长度是会发生变化的，数组的长度是固定的。
	
 
-------| Collection  单例集合的根接口。 
 ----------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。
 ----------| Set   如果是实现了Set接口的集合类，具备特点： 无序，不可重复。

Collection接口中的方法：
	
	增加
		add(E e)  添加成功返回true，添加 失败返回false.
		addAll(Collection c)  把一个集合 的元素添加到另外一个集合中去。
	
	删除
		clear() 
		remove(Object o) 
		
		removeAll(Collection  c) 
		retainAll(Collection  c) 
	
	查看    元素个数
		size() 

	
	判断
		isEmpty() 
		contains(Object o) 
		containsAll(Collection<?> c) 
	
	迭代
		toArray() 
		iterator() 
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		//Collection 接口 实现类 ArrayList 
		Collection co=new ArrayList();  //接口指向实现类对象  多态的一个特征
		//集合可以存储任意类型的对象数据
        co.add("jerry");
        co.add(20);  
        co.add(15.99);
     
        Collection c=new ArrayList();
        c.add("tom");   
        co.addAll(c);        //addAll(Collection c)  把一个集合 的元素添加到另外一个集合中去。
        System.out.println("添加集合返回"+c.add("eason"));
        System.out.println("打印集合"+co);
        
        System.out.println("清除元素________________________________________________");
        //创建集合
        Collection c1=new ArrayList();
        c1.add("jerry");
        c1.add("tom");
        c1.add("eason");
        //创建集合
        Collection c2=new ArrayList();
        c2.add("jack");
        c2.add("tom");
     
      //  c1.addAll(c2);
        System.out.println(c1);
	//	c.clear(); //clear()清空集合中的元素
       // c1.remove("eason");
	 //c1.removeAll(c2); //删除c集合中与c2的交集元素。
	  //	c1.retainAll(c2); //保留c集合与c2的交集元素，其他的元素一并删除。
      //  c1.removeAll(c2);
     // System.out.println("删除c1集合中与c2的交集元素"+c1);
        c1.retainAll(c2);
        System.out.println("保留c1集合中与c2的交集元素"+c1);
       System.out.println(c1.size());   //查看元素个数
	}

}
