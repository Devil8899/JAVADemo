package cn.itcast.reflect;

import java.lang.reflect.Field;
/*
 ͨ�������ȡ��Ӧ�ĳ�Ա����
 
 �ڷ��似����ʹ����Field�������˳�Ա�����ġ�
 
 */

public class Demo4 {

	public static void main(String[] args) throws Exception {
		//��ȡ����Ӧ��Class����
		Class clazz = Class.forName("cn.itcast.reflect.Person");
		//��ȡ �����еĳ�Ա����  ����˽�е�
	/*	Field[] fields = clazz.getDeclaredFields();
		for(Field field  : fields){
			System.out.println(field);
		}*/
		
		//1.��ȡ˽�е��ֶη���
		Person p = new Person();
		Field field = clazz.getDeclaredField("home");  //��ȡ˽���ֶ� �����ֶ���
		//2.���÷���Ȩ�޿��Է���
		field.setAccessible(true);
		//3.�����ֶ�ֵ
		field.set(p, "110"); //��һ�������� ���ø����� �ĳ�Ա������ �ڶ�������������ֵ��
		System.out.println(p);
	}
	
	
}
