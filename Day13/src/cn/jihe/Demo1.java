package cn.jihe;
/*

���飺 �洢ͬһ���������͵ļ�������.

������ص㣺
	1. ֻ�ܴ洢ͬһ���������͵����ݡ�
	2. һ����ʼ�������ȹ̶��� 
	3. �����е�Ԫ����Ԫ��֮����ڴ��ַ�������ġ�
	
ע�⣺ Object���͵�������Դ洢�������͵����ݡ� 
 
 	String[] arr= new String[1000];
 	
 */

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		String[] str= new String[]{"1","2"};
		System.out.println(Arrays.toString(str));
	    char[] car=new char[3]; 
		car[0]='a';
		car[1]='b';
		
		String str1="ABC";
		char[] buf = str1.toCharArray();  //���ַ���ת���ַ�����
		System.out.println(new String(buf));//�ַ�����ת�ַ���
		
	}

}
