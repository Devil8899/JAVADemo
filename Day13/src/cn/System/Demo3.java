package cn.System;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 
������ Date 
Date ���װ����ϵͳ�ĵ�ǰʱ��.������Date�Ѿ���ʱ�ˣ�sun�Ƽ�ʹ��Calendar�ࡣ
Calendar: ������һ���������࣬��װ��������ʱ����ʱ����
�����ࣺCalendar
���ڸ�ʽ����    SimpleDateFormat

		// ��ʾ ��ǰϵͳʱ��: 2014��12��26��  xxʱxx��xx��   
		
		 *  ���ڸ�ʽ����    SimpleDateFormat  2�����õķ���
		 *  		����1�� ���԰�����ת��תָ����ʽ���ַ���     format()
		 *  		����2�� ���԰�һ�� �ַ�ת���ɶ�Ӧ�����ڡ�    parse()  
		 *  	
		 */

public class Demo3 {

	 public static void main(String[] args) throws  ParseException {
		// TODO Auto-generated method stub
		Date date = new Date(); // ��ȡ��ǰ��ϵͳʱ��
//		System.out.println("�Ϸ���+��ݣ�"+ date.getYear());
	    System.out.println("___________________________________________");
		Calendar calendar = Calendar.getInstance(); //��ȡ��ǰ��ϵͳʱ�䡣
		System.out.println("�꣺"+ calendar.get(Calendar.YEAR));
		System.out.println("�£�"+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+ calendar.get(Calendar.DATE));
		
		System.out.println("ʱ��"+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+ calendar.get(Calendar.MINUTE));
		System.out.println("�룺"+ calendar.get(Calendar.SECOND));
		
		/*//���ڸ�ʽ��
		Date date2 = new Date(); //��ȡ��ǰ��ϵͳʱ�䡣
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss") ; //ʹ����Ĭ�ϵĸ�ʽ������һ�����ڸ�ʽ������
		String time = dateFormat.format(date2);  //���԰�����ת��תָ����ʽ���ַ���
		System.out.println("��ǰ��ϵͳʱ�䣺"+ time);
		
		//�ַ���ת����  �ַ�����ʽ �������ʽ��ʱ��һ�£� 
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy@MM@dd��   HH+mm+ss") ; //ʹ����Ĭ�ϵĸ�ʽ������һ�����ڸ�ʽ������
		String Da="2017@08@16��   19+30+123";
		
		Date date3=dateFormat2.parse(Da);  //�˷������ܻ����쳣  ���Է�����Ҫ��ǰ����throws 
		System.out.println(date3);*/
		
	}

}
