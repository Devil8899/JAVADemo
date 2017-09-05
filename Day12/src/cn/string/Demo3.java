package cn.string;
/*
 * String 看完了构造方法 接着看获取方法
2.2	获取方法
	int length()  获取字符串的长度
	char charAt(int index) 获取特定位置的字符 (角标越界)
	int indexOf(String str) 查找子串第一次出现的索引值,如果子串没有出现 在字符串中，那么则返回-1表示。
	int lastIndexOf(String str) 查找子串最后一次出现的索引值 , 如果子串没有出现 在字符串中，那么则返回-1表示
*/
public class Demo3 {
	public static void main(String[] args) {
	  String str="这是一个abc测试"; 
	  System.out.println(str.length());  //获取字符串长度   输出 "9"
	  System.out.println(str.charAt(3)); //索引从0开始      输出 ”个"
	  System.out.println(str.indexOf("这")); // 查找子串第一次出现的索引值  输出 0
	  System.out.println(str.indexOf("个"));  //3
	  System.out.println(str.lastIndexOf("试"));//查找子串最后一次出现的索引值   输出"8"
	}
	
}
