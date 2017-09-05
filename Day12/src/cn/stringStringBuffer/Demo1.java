package cn.stringStringBuffer;
/*
字符串特点：字符串是常量；它们的值在创建之后不能更改.

字符串的内容一旦发生了变化，那么马上会创建一个新 的对象。

注意： 字符串的内容不适宜频繁修改，因为一旦修改马上就会创建一个新的对象。

如果需要频繁修改字符串 的内容，建议使用字符串缓冲 类（StringBuffer）。


StringBuffer 其实就是一个存储字符 的容器。
笔试题目：使用Stringbuffer无 参的构造函数创建 一个对象时，默认的初始容量是多少？ 如果长度不够使用了，自动增长多少倍？
	StringBuffer 底层是依赖了一个字符数组才能存储字符数据 的，该字符串数组默认 的初始容量是16， 如果字符数组的长度不够使用 死，自动增长1倍。


容器的具备 的行为
	增加	
	删除
	修改
	查看
	判断 
*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先使用StringBuffer无参的构造函数创建一个字符串缓冲类。
				StringBuffer sb = new StringBuffer(); 
				sb.append("java");
				sb.append("java");
				sb.append("java");
				sb.append("java");
				sb.append("java");
				
				System.out.println(sb);
				
	}

}
