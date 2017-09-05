package cn.string;
/*
String 的构造方法：

	String()  创建一个空内容 的字符串对象。
	String(byte[] bytes)  使用一个字节数组构建一个字符串对象
	String(byte[] bytes, int offset, int length)    //可以指定解码长度
		bytes :  要解码的数组
		offset： 指定从数组中那个索引值开始解码。
		length：　要解码多个元素。
	
	String(char[] value)  使用一个字符数组构建一个字符串。	
	String(char[] value, int offset, int count)  使用一个字符数组构建一个字符串， 指定开始的索引值，与使用字符个数。
	String(int[] codePoints,int offset,int count)
	String(String original) 

记住： 使用字节数组或者字符数组都可以构建一个字符串对象。


*/


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.构造方法
		String Str=new String("createString");
		System.out.println(Str);
	    //2.用一个字节数组构建一个字符串对象
		byte[] car= {97,98,99};   ////使用一个字节数组构建一个字符串对象
		Str=new String(car);
		System.out.println(Str);
		//3.可以指定解码长度
		Str = new String(car,1,2);   //使用一个字节数组构建一个字符串对象,指定开始解码 的索引值和解码的个数。
        System.out.println(Str);
        //4. 使用一个字符数组构建一个字符串。
        char[] cnr={66,67,68};
        Str=new String(cnr);
        System.out.println(Str);
        //5. 使用一个字符数组构建一个字符串， 指定开始的索引值，与使用字符个数。
        char[] cnr2={66,67,68};
        Str=new String(cnr2,1,2);  //从第二个开始截取
        System.out.println(Str);
        
    	String str = new String();
    	System.out.println("空字符串"+str);
	}

}
