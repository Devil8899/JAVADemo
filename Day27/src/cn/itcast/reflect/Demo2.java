package cn.itcast.reflect;

import java.lang.reflect.Constructor;

/*
 ���ͨ��Class�����ȡ���췽����
 */
public class Demo2 {
	
	public static void main(String[] args) throws Exception {
		//1.��ȡ����Ӧ��Class����  class����ָ�����person��
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		
		//2.ͨ��Class�����ȡ��Ӧ�Ĺ������췽�� �������η�public        getConstructors
		/*Constructor[] constructors = clazz.getConstructors();  // getConstructors()��ȡһ��������й����Ĺ��췽��
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		//��ȡperson�����й��췽�� ����private                                                                                   getDeclaredConstructors
		Constructor[] constructors =  clazz.getDeclaredConstructors(); //��ȡ��һ��������й��췽��������˽�е����� ��
		for(Constructor constructor : constructors){
			System.out.println(constructor);
		}
		*/
		
		 // getConstructor ��ȡ����ָ���Ĺ��췽��  ������public��
		/*Constructor constructor = clazz.getConstructor(int.class,String.class); 
	    // newInstance()����һ������
		Person p  = (Person) constructor.newInstance(999,"С��"); 
		System.out.println(p);*/
		
		System.out.println("___________�����Ƿ���д��_____________");
		
		//��ȡ˽�еĹ��캯��  ��һ��������  ����Ϊ��������
		Constructor constructor =  clazz.getDeclaredConstructor(int.class);
		//��������
		constructor.setAccessible(true);
		Person p  =(Person) constructor.newInstance(99); // newInstance()����һ������ ͬʱ������
		System.out.println(p);
		
		//��ȡ˽�й������ �޲ε�
		Constructor constructorl =  clazz.getDeclaredConstructor(null);
		//��������   ���Ƽ�ʹ��  �п��ܻ�������ݶ�ʧ�ȵȡ�
		constructorl.setAccessible(true);
		Person p1  =(Person) constructorl.newInstance(null);
		System.out.println(p1);
		
		
	}

}
