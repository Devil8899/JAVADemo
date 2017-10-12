package cn.string;

import java.util.Arrays;

/*
2.3	判断方法
	boolean endsWith(String str) 是否以指定字符结束
	boolean isEmpty()是否长度为0 如：“” null V1.6
	boolean contains(CharSequences) 是否包含指定字符串  应用：搜索
	boolean equals(Object anObject) 是否相等
	boolean equalsIgnoreCase(String anotherString) 忽略大小写是否相等

2.4	转换方法     
char[]  toCharArray()  将字符串 转换为字符数组
byte[]	getBytes();    将字符串转换为字节数组
new String(byte[] & char[]) 将数组转换为字符串
字节数组与字符数组、字符串他们三者之间是可以互相转换。

*/
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Demo.java";
		System.out.println("是否以指定 的字符串结束:"+ str.endsWith("ja1"));  //false
		//str = "";
		System.out.println("判断字符串是否为空内容："+str.isEmpty());  //false
		System.out.println("判断字符串是否包含指定的内容："+ str.contains("Demo")); //true
		System.out.println("判断两个 字符串的内容是否一致："+ "DEMO.JAVA".equals(str)); //false
		System.out.println("判断两个字符串的内容是否一致(忽略大小写比较):"+ "DEMO.JAVA".equalsIgnoreCase(str));//true
	
		//转换的方法
				char[] buf = str.toCharArray();  //把字符串转换字符数组
				System.out.println("字符数组："+ Arrays.toString(buf));
				byte[] buf2 = str.getBytes();	//把字符串转字节数组
				System.out.println("字节数组："+ Arrays.toString(buf2));
				str=new String(buf2);  //字节数组转字符串
				System.out.println(str);
			
	
	}

}
