package Day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		writeTest();
		readrTest();
	}


	//1.使用字节流写中文。   字节流之所以能够写中文是因为借助了字符串的getBytes方法对字符串进行了编码（字符---->数字）。 
	public static void writeTest() throws IOException{
	   File fi=new File("D:\\liuz\\JAVADemo\\a.txt");  //找到目标文件
	   FileOutputStream str=new FileOutputStream(fi);    //建立数据的输出通道
	   String Data="大家好";
	   byte[] by=Data.getBytes(); //需要将字符串转成字节数组
	   System.out.println("输出的内容："+ Arrays.toString(by));   //输出的数字 
	 //  字节流之所以能够写中文是因为借助了字符串的getBytes方法对字符串进行了编码（将字符编码成---->数字）。 
	   str.write(by);//默认write不能写中文 是因为转成了字节流  记事本本身具有解码的功能 所以打开是中文
	   str.close(); //关闭资源
	}
	
	
	//2.使用字节流读取中文
	public static void readrTest() throws IOException{
		
		 File file=new File("D:\\liuz\\JAVADemo\\a.txt");  //找到目标文件
		 FileInputStream InputStream=new FileInputStream(file);    //建立数据的输出通道
		 int content=0;
		 byte[] byt=new byte[2];
//		 while((content = InputStream.read(byt))!=-1){ 
//		  //出现乱码的原因： 一个中文在gbk码表中默认是占两个字节，
//		   // 目前你只读取了一个字节而已，所以不是一个完整的中文。
//              System.out.print(new String(byt));
//            }
//		 
		for (int i = 0; i <= byt.length; i++) {
		    InputStream.read(byt);  //每次读取2字节  1个汉字占2个字节 这样读取就可以了
		    System.out.print(new String(byt));
		}
		
		InputStream.close();		
	}
}
