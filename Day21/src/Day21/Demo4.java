package Day21;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流:

------| Writer 输出字符流的基类。 抽象类
-----------| FileWriter 向文件数据数据的输出字符流

FileWriter的使用步骤：
	1. 找到目标文件。
	2. 建立数据输出通道
	3. 写出数据。
	4. 关闭资源
	
FileWriter要注意的事项：
	1. 使用FileWriter写数据的时候，FileWriter内部是维护了一个1024个字符数组的，写数据的时候会先写入到它内部维护的字符数组中，如果需要
	把数据真正写到硬盘上，需要调用flush或者是close方法或者是填满了内部的字符数组。
	2. 使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件。
	3.使用FileWriter的时候， 如果目标文件已经存在了，那么默认情况会先情况文件中的数据，然后再写入数据 ， 如果需要在原来的基础上追加数据，
	需要使用“new FileWriter(File , boolean)”的构造方法，第二参数为true。
	

练习： 使用字符流拷贝一个文本文件(java文件). 
接着使用字符流拷贝一个图片（观察图片的大小变化，思考为什么会这样子??）

******************************************************************************
何时使用字符流，何时使用字节流？依据是什么？

使用字符流的应用场景： 如果是读写字符数据的时候则使用字符流。

使用字节流的应用场景： 如果读写的数据都不需要转换成字符的时候，则使用字节流。 
 
使用字符流拷贝图片会造成数据的一个丢失。

 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeTest1();
		copyFile();
	}
	
	//输出字符流   
	public static void  writeTest1() throws IOException{
	        File file=new File("D:\\liuz\\JAVADemo\\a.txt");
	        FileWriter fwrite=new FileWriter(file);
	        String str="这是要写到本地的文档中1";
	        fwrite.write(str);  // //字符流具备解码的功能。
			//刷新字符流
//			fwrite.flush();
			//关闭资源
	        fwrite.close();
	        
	        
//	        FileOutputStream outp=new FileOutputStream(file,true);
//	        outp.write(str.getBytes());
		
	}
	
	
	// 使用字符流不能拷贝图片  因为图片是以字节存储的
   public static void  copyFile() throws IOException{
	/*   File file1=new File("D:\\liuz\\JAVADemo\\a.txt");
	   File file2=new File("D:\\2.txt");
	   FileReader  fread=new FileReader(file1);
	   FileWriter  fwrite=new FileWriter(file2);
	   char[] buf=new char[1024];  //数据读取存到缓冲 字符数组
	   int context=0;
	   while((context=fread.read(buf))!=-1){  
		   fwrite.write(buf,0,context); //边读边写
	   };
	   fwrite.close();  //必须调用 close方法
	   
	   */
	   
	   
	   File file1=new File("D:\\liuz\\JAVADemo\\adb.mp4");
	   File file2=new File("D:\\liuz\\adb.mp4");
	   FileInputStream fread=new FileInputStream(file1);
	   FileOutputStream  fwrite=new FileOutputStream(file2);
	   byte[] buf=new byte[1024];  //数据读取存到缓冲 字符数组
	   int context=0;
	   while((context=fread.read(buf))!=-1){  
		   fwrite.write(buf, 0, context);
	   };
	   fwrite.close();  //必须调用 close方法
	   fread.close();
	   
	   
//	   BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Test.txt"));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Test.exe"));
//		String line=null;
//		while((line = bufferedReader.readLine())!=null){
//		bufferedWriter.write(line);
//		}
//		bufferedWriter.close();
//		bufferedReader.close();
	   
   }
	

}
