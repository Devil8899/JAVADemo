package cn.regex;
//正则表达式  就是一个操作字符串的一个规则,正则表达式的规则使用特殊的符号表示


/*预定义字符类 
 String.matches() 这个方法主要是返回是否匹配指定的字符串，如果匹配则为true,否则为false;
. 	任何字符（与行结束符可能匹配也可能不匹配） 
\d 	数字：[0-9] 
\D 	非数字： [^0-9] 
\s 	空白字符：[ \t\n\x0B\f\r] 
\S 	非空白字符：[^\s] 
\w 	单词字符：[a-zA-Z_0-9] 
\W 	非单词字符：[^\w]

Greedy 数量词
X ?	X，一次或一次也没有    ？号代表一次或一次也没有
X *	X，零次或多次
X +	X，一次或多次
X {n}	X，恰好n次
X {n,}	X，至少n次
X {n,m}	X，至少n次，但是不超过m次


范围表示
[abc]	a、b 或 c（简单类） 
[^abc]	任何字符，除了 a、b、c（否定） 
[a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
[a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集） 
[a-z&&[def]]	d、e 或 f（交集） 
[a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去） 
[a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
注意
范围词内容无论有多长，没有数量词的配合都只能匹配一个字符而已

边界匹配器
\b
$
*/


public class Demo1 {

	public static void main(String[] args) {
		System.out.println("是否任意字符"+"a".matches("."));
		System.out.println("是否数字"+"1".matches("\\d"));   
		System.out.println("非数字"+"%".matches("\\D"));
		System.out.println("空白字符"+"\r".matches("\\s"));
		System.out.println("非空白字符"+"^".matches("\\S"));
		System.out.println("单词字符"+"a".matches("\\w"));
		System.out.println("非单词字符"+"%".matches("\\W"));
       System.out.println("_____________________________________________________");
		// 数量词 控制出现的次数
		System.out.println("a".matches("."));
		System.out.println("a".matches("a"));
		System.out.println("? 一次或一次也没有" + "1".matches("\\d?"));
		System.out.println("* 零次或者多次" + "2111".matches("\\d*"));
		System.out.println("+ 一次或多次" + "".matches("\\d")); // +代表匹配数字
		// 出现一次或多次出现数字 没有出现
		// 返回false													
		System.out.println("{}恰好n次" + "100".matches("\\d{3}")); // 恰好数字出现3次
		System.out.println("{n,}至少出现N次" + "12345".matches("\\d{5,}"));// 至少出现n次
		System.out.println("{n,m}至少n次，但是不超过m次" + "12".matches("\\d{1,2}"));// 至少n次，但是不超过m次
		System.out.println("范围表示_____________________________________________________");
		
		System.out.println("abc".matches("[abc]")); // 注意 只能匹配a字符 因为没有表明数量
		System.out.println("完全匹配abc3个字符" + "abc".matches("[abc]{3}"));// 完全匹配abc3个字符
		System.out.println("a".matches("[^abc]")); // 排除abc 如果是abc中一个 就是false
		System.out.println("字符出现在a-z或大写A-Z之间" + "a".matches("[a-zA-z"));// a-zA-z中间匹配一个
	     
	} 

}
