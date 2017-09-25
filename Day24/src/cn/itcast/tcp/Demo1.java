package cn.itcast.tcp;
import java.io.*;


public class Demo1 {

	public static void main(String[] args) throws IOException {
        File file =new File("D:\\aa.txt");    
	    FileInputStream inputStream=new FileInputStream(file);
	    byte[] buf=new byte[1024];
	    int length=0;   //length代表了所有的读取字符个数
//	    while((length=inputStream.read())!=-1)  //如果使用read方法没有传入缓冲数组，那么返回值是读取到的内容。
//	    {
//	    	 System.out.print((char)length);   	
//	    }
//	    
//	    while((length=inputStream.read(buf))!=-1)
//	    {
//	    	 System.out.print(new String(buf,0,length)+"\r\n");   	
//	         System.out.println("length:"+length);	 
//	    }
	    
	    //字符流 可以直接读取中文  字节流因为中文有可能2个汉字一个字节所以 如果缓冲数组没有足够空间就会造成读取失败
		FileReader reader=new FileReader(file);
	    System.out.println((char)reader.read());
	}

}
