package cn.other;

import java.util.Arrays;

/*
编码与解码 
 
 编码： 把看得懂的字符变成看不懂码值这个过程我们称作为编码。
 
解码： 把码值查找对应的字符，我们把这个过程称作为解码。

注意： 以后编码与解码一般我们都使用统一的码表。否则非常容易出乱码。

 */
public class Demo7 {

	public static void main(String[] args) {
		/*
		String str = "中国";
		byte[] buf = str.getBytes("utf-8");// 平台默认的编码表是gbk编码表。  编码
		System.out.println("数组的元素："+Arrays.toString(buf)); //
		
		str = new String(buf,"utf-8");  //默认使用了gbk码表去解码。 
		System.out.println("解码后的字符串："+ str);		
		*/
		
		
		/*String str = "a中国"; // -2,-1,0, 97, 78, 45, 86, -3   //-2 ,-1 是一个标志  不管中英文 都是占用2个字节
		byte[] buf = str.getBytes("unicode");  //编码与解码的时候指定 的码表是unicode实际上就是用了utf-16.和指定utf-16是一样的。
		System.out.println("数组的内容："+ Arrays.toString(buf));
		*/
		
		
		String str = "大家好";
		byte[] buf = str.getBytes(); //使用gbk进行编码
		System.out.println("字节数组："+ Arrays.toString(buf));  // -76, -13, -68, -46, -70, -61
		
//		str = new String(buf,"iso8859-1"); //解码使用不同的码表
//		// 出现乱码之后都可以被还原吗？   不一定 因为不通码表对应的表示不通
//		
//		byte[] buf2 = str.getBytes("iso8859-1"); //编码
//		str = new String(buf2,"gbk");   //解码

//		System.out.println(str);
		
		
		
		
	}

	}


