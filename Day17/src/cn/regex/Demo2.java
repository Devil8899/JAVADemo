package cn.regex;

import java.util.Arrays;

/*正则表达式主要用于操作字符串的规则  正则表达式对字符串的操作有以下几方面
    
    匹配  matches();
    
    切割  split()   使用指定格式切割 返回数组 
 
    替换  replaceAll(String regex, String replacement)   
 
    查找
 
*/
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathesPhone("13819255633");
		MathTelNum("0516-1123456");
		Spspad("1 2 3 4 5");
		MathQQ("js@qq.com");
		StrRepl();
		Replace1();
	}

	// 匹配手机号 1开头 第二位是3，4，5，7，8 其中一个 长度11位
	public static void MathesPhone(String str) {
		String RegPhone = "1[34578]\\d{9}"; // 长度11位 第一位是1 第二位是
		System.out.println(str.matches(RegPhone) ? "合法手机号" : "非法手机号");
	}

	// 匹配固定电话 格式： 区号-主机号 区号：首位是0 长度3-4 主机号：首位不能是0 长度7-8位
	public static void MathTelNum(String str) {
		String Regtel = "0\\d{2,3}-[^0]\\d{6,7}";
		System.out.println(str.matches(Regtel) ? "合法固定电话" : "不合法固定电话");
	}

	// QQ邮箱匹配
	public static void MathQQ(String str) {
		String Regqq = "(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w{2,3}){1,3})";
		// 1个或多个字符加.加多个字符
		System.out.println(str.matches(Regqq) ? "合法邮箱" : "邮箱匹配失败");
	}

	/**
	 * 正则表达式：验证邮箱
	 */
	public static final String REGEX_EMAIL = 
	"^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

	// 字符串 切割split
	public static void Spspad(String str) {
		String[] str2 = str.split(" "); // 使用空格切割返回 数组。
		System.out.println(Arrays.toString(str2));
	}
	
	//replaceAll
	public static void StrRepl(){
		//需求：把手机号替换成“*”号。
		String str1 = "联系我：13567012119联系我：13567012119联系我：13567012119联系我：13567012119联系我：13567012119联系我：13567012119";
				String reg= "1[34578]\\d{9}";   //选中了所有的手机号
				str1 =	str1.replaceAll(reg,"******");  //将所有的手机号替换成了********
				System.out.println("替换后的帖子："+ str1);
	}
	
	//使用正则表达式 替换掉重复的字符
	public static void Replace1(){
		String name="jjeeeeeeerrrrrrryyyyy";
		String Newname=name.replaceAll("(.)\\1+","$1");
		System.out.println(Newname);
		
	} 
}
