package cn.itcast.reflect;

import java.lang.reflect.Method;

/*
 ͨ��Class�����ȡ����Ӧ�ķ�����
 
 �ڷ��似����ʹ����Method�������˷����ġ�
 1.����class����
 2.ͨ��Class�����ȡ���췽����
 3.ͨ�����췽����������
 
 */
public class Demo3 {
	
	public static void main(String[] args) throws Exception {
		//��ȡ����Ӧ��Class����
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		
		//1. ��ȡ�����й����ķ���
		/*Method[] methods = clazz.getMethods(); // getMethods() ��ȡ���� �Ĺ����������ѡ��������෽��
		Method[] methods = clazz.getDeclaredMethods(); //��ȡ�����еķ��������ǲ���������ķ�����
		for(Method method  : methods){
			System.out.println(method);
		}*/
		
		Person p = new Person(110,"jerry");
		
		//2. ��ȡ��������  getMethod  ��һ�����������������֡� �ڶ������� ��������Ҫ�Ĳ������͡�	
		/*Method m = clazz.getMethod("eat", int.class);
		m.invoke(p, 3); */
		//invoke ִ��һ�������� ��һ�������������ĵ��ö��� �ڶ������� ��������Ҫ�Ĳ�����
		
		
		//3. ��ȡ˽�еķ�����ִ��
		/*
		 Method m =clazz.getDeclaredMethod("sleep",int.class);
		//���÷���Ȩ���������
		m.setAccessible(true);
		m.invoke(null, 6);*/   //invoke  ����Ǿ�̬���� �������Ϊnull���� Ҳ���Դ�����
		
		
		//4.������Ҫ���������
		/*Method m = clazz.getMethod("sum", int[].class);
		m.invoke(p,new int[]{12,5,9});*/
		
	}
	

}
