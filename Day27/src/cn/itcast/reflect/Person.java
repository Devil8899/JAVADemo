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
		System.out.println(name+"��"+num+"�ٷ�");
	}
	
	private static void sleep(int num){
		System.out.println("ÿ��˯��"+num+"Сʱ");
	}
	
	
	public static void  sum(int[] arr){
		System.out.println("�����ǣ�"+ arr.length);
	}
	
	
	@Override
	public String toString() {
		return " ��ţ�"+ this.id +" ������"+ this.name+"��ͥ:" +this.home;
	}
	
}
