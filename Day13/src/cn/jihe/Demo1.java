package cn.jihe;
/*

数组： 存储同一种数据类型的集合容器.

数组的特点：
	1. 只能存储同一种数据类型的数据。
	2. 一旦初始化，长度固定。 
	3. 数组中的元素与元素之间的内存地址是连续的。
	
注意： Object类型的数组可以存储任意类型的数据。 
 
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
		char[] buf = str1.toCharArray();  //把字符串转换字符数组
		System.out.println(new String(buf));//字符数组转字符串
		
	}

}
