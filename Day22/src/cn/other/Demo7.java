package cn.other;

import java.util.Arrays;

/*
��������� 
 
 ���룺 �ѿ��ö����ַ���ɿ�������ֵ����������ǳ���Ϊ���롣
 
���룺 ����ֵ���Ҷ�Ӧ���ַ������ǰ�������̳���Ϊ���롣

ע�⣺ �Ժ���������һ�����Ƕ�ʹ��ͳһ���������ǳ����׳����롣

 */
public class Demo7 {

	public static void main(String[] args) {
		/*
		String str = "�й�";
		byte[] buf = str.getBytes("utf-8");// ƽ̨Ĭ�ϵı������gbk�����  ����
		System.out.println("�����Ԫ�أ�"+Arrays.toString(buf)); //
		
		str = new String(buf,"utf-8");  //Ĭ��ʹ����gbk���ȥ���롣 
		System.out.println("�������ַ�����"+ str);		
		*/
		
		
		/*String str = "a�й�"; // -2,-1,0, 97, 78, 45, 86, -3   //-2 ,-1 ��һ����־  ������Ӣ�� ����ռ��2���ֽ�
		byte[] buf = str.getBytes("unicode");  //����������ʱ��ָ�� �������unicodeʵ���Ͼ�������utf-16.��ָ��utf-16��һ���ġ�
		System.out.println("��������ݣ�"+ Arrays.toString(buf));
		*/
		
		
		String str = "��Һ�";
		byte[] buf = str.getBytes(); //ʹ��gbk���б���
		System.out.println("�ֽ����飺"+ Arrays.toString(buf));  // -76, -13, -68, -46, -70, -61
		
//		str = new String(buf,"iso8859-1"); //����ʹ�ò�ͬ�����
//		// ��������֮�󶼿��Ա���ԭ��   ��һ�� ��Ϊ��ͨ����Ӧ�ı�ʾ��ͨ
//		
//		byte[] buf2 = str.getBytes("iso8859-1"); //����
//		str = new String(buf2,"gbk");   //����

//		System.out.println(str);
		
		
		
		
	}

	}


