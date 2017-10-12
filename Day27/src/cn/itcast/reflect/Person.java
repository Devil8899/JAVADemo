package cn.itcast.reflect;

public class Person {
	
	private int id;
	
	String name;
	
	public static String home;
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	private Person(int id){
		this.id=id;
	}
	public Person(){}
	
	
	public void eat(int num){
		System.out.println(name+"吃"+num+"顿饭");
	}
	
	private static void sleep(int num){
		System.out.println("每天睡上"+num+"小时");
	}
	
	
	public static void  sum(int[] arr){
		System.out.println("长度是："+ arr.length);
	}
	
	
	@Override
	public String toString() {
		return " 编号："+ this.id +" 姓名："+ this.name+"家庭:" +this.home;
	}
	
}
