package Day21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
字节流：字节流读取的是文件中的二进制数据，读到的数据并不会帮你转换成你看得懂的字符。    
 
字符流： 字符流会把读取到的二进制的数据进行对应 的编码与解码工作。   字符流 = 字节流 + 编码(解码)
 
输入字符流：
----------| Reader 输入字符流的基类   抽象类
-------------| FileReader 读取文件的输入字符流。


FileReader的用法：
	1. 找到目标文件
	2. 建立数据的输入通道
	3. 读取数据    read() 方法  每次读取不再是字节 而是1个个字符 所以可以直接读取中文
	4. 关闭资源
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
	
//		readTest1();
		readTest2();
		
	}

	//1. 输入字符流 ————读取中文
	public static void readTest1() throws IOException{
		//1. 找到目标文件
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		//2. 建立数据的输入通道
		FileReader reader=new FileReader(file);
		//3. 读取数据    read() 方法  每次读取不再是字节 而是1个个字符 所以可以直接读取中文
		int context=0;
		while((context=reader.read())!=-1){ //每次只会读取一个字符  效率低
			//如果使用read方法没有传入缓冲数组，那么返回值是读取到的内容。
			System.out.print((char)context);
		}
		//4.关闭资源
		reader.close();	
	}
	
	//2.使用缓冲字符数组读取文件。效率高
	public static void readTest2() throws IOException{
		//1. 找到目标文件
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		//2. 建立数据的输入通道
		FileReader reader=new FileReader(file);
		//建立缓冲字符数组读取文件数据
		char[] buf = new char[1024];
		int length = 0 ;   //length代表了所有的读取字符个数
		while((length = reader.read(buf))!=-1){ //reader.read(buf) 每次读取1024个字节
			System.out.print(new String(buf,0,length));
			System.out.println("length"+length);
		}
	
		
	}
}
