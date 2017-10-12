package cn.itcast.reflect;

import java.lang.reflect.Constructor;

/*
 如何通过Class对象获取构造方法。
 */
public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		//1.获取到对应的Class对象  class对象指向的是person类
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		
		//2.通过Class对象获取对应的公共构造方法 访问修饰符public        getConstructors
		/*Constructor[] constructors = clazz.getConstructors();  // getConstructors()获取一个类的所有公共的构造方法
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		//获取person的所有构造方法 包括private                                                                                   getDeclaredConstructors
		Constructor[] constructors =  clazz.getDeclaredConstructors(); //获取到一个类的所有构造方法，包括私有的在内 。
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		*/
		
		 // getConstructor 获取单个指定的构造方法  必须是public。
		/*Constructor constructor = clazz.getConstructor(int.class,String.class); 
	    // newInstance()创建一个对象
		Person p  = (Person) constructor.newInstance(999,"小城"); 
		System.out.println(p);*/
		
		System.out.println("___________以上是繁琐写法_____________");
		
		//获取私有的构造函数  传一个参数的  传参为参数类型
		Constructor constructor =  clazz.getDeclaredConstructor(int.class);
		//暴力反射
		constructor.setAccessible(true);
		Person p  =(Person) constructor.newInstance(99); // newInstance()创建一个对象 同时传参数
		System.out.println(p);
		
		//获取私有构造参数 无参的
		Constructor constructorl =  clazz.getDeclaredConstructor(null);
		//暴力反射   不推荐使用  有可能会造成数据丢失等等。
		constructorl.setAccessible(true);
		Person p1  =(Person) constructorl.newInstance(null);
		System.out.println(p1);
		
		
	}

}
