package cn.itcast.reflect;

import java.lang.reflect.Field;
/*
 通过反射获取对应的成员变量
 
 在反射技术中使用了Field类描述了成员变量的。
 
 */

public class Demo4 {

	public static void main(String[] args) throws Exception {
		//获取到对应的Class对象
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		//获取 到所有的成员变量  包括私有的
	/*	Field[] fields = clazz.getDeclaredFields();
		for(Field field  : fields){
			System.out.println(field);
		}*/
		
		//1.获取私有的字段方法
		Person p = new Person();
		Field field = clazz.getDeclaredField("home");  //获取私有字段 并传字段名
		//2.设置访问权限可以访问
		field.setAccessible(true);
		//3.设置字段值
		field.set(p, "110"); //第一个参数： 设置该数据 的成员变量， 第二个参数：属性值。
		System.out.println(p);
	}
	
	
}
