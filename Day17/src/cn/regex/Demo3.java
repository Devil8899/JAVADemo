package cn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 查找需要使用的对象
 Pattern(正则对象);
 Matcher(匹配器对象);

匹配器要使用到的方法
1.find()   通知匹配器去匹配字符串，查找符合规则的字符串。 如果找到符合规则的字符串 返回true 否则返回false;
2.group()  获取符合规则的字符串。

注意  使用group方法的使用一定要先试用find的方法查找符合规则的字符串。否则报错。



 * */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="hi my Name is lilei";
            String reg="\\b[a-zA-Z]{2}\\b";  //匹配所有单词长度为2;  加\\b 是边界匹配器
            //先把字符串的正则编译成Pattern的对象;
            Pattern p=Pattern.compile(reg);
            //使用正则对象匹配字符串用于产生一个Matcher对象；
            Matcher m=p.matcher(str);
            //Matcher  常用方法 find()  group() 两个方法
//            System.out.println("是否匹配2个字母单词:"+  m.find());  //返回bool
//            System.out.println("查找到的单词是什么:"+  m.group());  //返回匹配的单词
            System.out.println("_____________________________________________");
            while(m.find()){
            	System.out.println(m.group());
            }
            System.out.println("_____________________________________________new");
            getEamil();
            
	}
	
   //匹配所有邮箱 查找邮箱地址
   public static void getEamil(){
	   String str="邮箱地址是 110aa23@qq.com 邮箱地址是 11023@163.com 邮箱地址是 11023@soft.com "
	   		+ "邮箱地址是 11023@biye.com.cn邮箱地址是 11023ww@126.net邮箱地址是 "
	   		+ " 11023@nba.cn邮箱地址是 1s@qq.com";
	   String reg="[a-zA-Z1-9]\\w+@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
//	   String reg="[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
	    //匹配规则
	   //第1位 a 到 z 或 A 到 Z 1-9  
	   //第2位 \w  单词字符 范围：[a-zA-Z_0-9] 
	   //第3位 +   单词字符可能出现一次或多次
	   //N位 @符号
	   //@符号后面跟着 词字符 范围：[a-zA-Z_0-9]  至少2位 如 @qq @163
	   //.实际意义的点号 匹配的是\\. 
	   //点号后面可能是net 或者 cn  或者 com  中间用|隔开 或者的意思
	   //(\\.(com|cn|net)){1,2} 意思是可能会出现1次或者2次。
	   
	   
	   //先把字符串的正则编译成Pattern正则对象;
       Pattern p=Pattern.compile(reg);
       //使用正则对象匹配字符串用于产生一个Matcher匹配器对象；
       Matcher m=p.matcher(str);
       while(m.find()){
    	   System.out.println(m.group());
       }	   
   }
	

}
