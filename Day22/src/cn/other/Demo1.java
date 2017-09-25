package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/*
SequenceInputStream(序列流)
这个类有两个构造函数
1.可以将多个文件序列在一起
SequenceInputStream(Enumeration<? extends InputStream> e) 
初始化新创建的 SequenceInputStream记住的说法，它必须产生对象的运行时类型是 InputStream Enumeration。  
2.只能2个文件序列在一起
SequenceInputStream(InputStream s1, InputStream s2) 
初始化新创建的 SequenceInputStream记住两个参数，将其写入的命令，第一 s1然后 s2，提供字节是从这 SequenceInputStream读。  

  
同时具备读取的方法read() 等
 
 
 
需求：把a.txt与b.txt 文件的内容合并。

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		merge1();
//		merge2();
		merge3();
	}
	//1.需求：把a.txt与b.txt 文件的内容合并。   使用文件流实现
		public static void merge1() throws IOException{
			//找到目标文件
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File outFile = new File("D:\\liuz\\JAVADemo\\c.txt");
			//建立数据的输入输出通道
			FileOutputStream fileOutputStream = new FileOutputStream(outFile);
			FileInputStream fileInputStream1 = new FileInputStream(inFile1);
			FileInputStream fileInputStream2 = new FileInputStream(inFile2);
			
			//把输入流存储到集合中，然后再从集合中读取
			ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
			list.add(fileInputStream1);
			list.add(fileInputStream2);
			
			//准备一个缓冲数组
			byte[] buf = new byte[1024];
			int length = 0 ; 
			
			for(int i = 0 ; i< list.size() ; i++){
				FileInputStream fileInputStream = list.get(i);
				while((length = fileInputStream.read(buf))!=-1){
					fileOutputStream.write(buf,0,length);
				}
				//关闭资源
				fileInputStream.close();
			}
			fileOutputStream.close();	
		}
		//2. SequenceInputStream实现  构造函数1
		
		public static void merge2() throws IOException{
			//找到目标文件
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File outFile = new File("D:\\liuz\\JAVADemo\\d.txt");
			//建立对应 的输入输出流对象
			FileInputStream f1=new FileInputStream(inFile1);
			FileInputStream f2=new FileInputStream(inFile2);
			FileOutputStream f3=new FileOutputStream(outFile);
			//创建序列流对象
			SequenceInputStream seq =new SequenceInputStream(f1, f2);
			
			byte[] by=new byte[1024];  //每次读取1024个字节
			int length=0;              //读取到的所有字节长度
			//读取文件数据
			while((length=seq.read(by))!=-1){ //每次读取到的内容存入到字节数组中 一个容器
				f3.write(by, 0, length);			
			}
			//不需要调用FileInputStream 的close方法
			//关闭资源
			seq.close();
			f3.close();
			
		}
		//3.	//把三个文件合并成一个文件  必须要使用序列流的另一个构造函数
		public static void merge3() throws IOException{
		   
			//找到目标文件
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File inFile3 = new File("D:\\liuz\\JAVADemo\\d.txt");
			
			File outFile = new File("D:\\liuz\\JAVADemo\\f.txt");
			//建立对应 的输入输出流对象
			FileInputStream f1=new FileInputStream(inFile1);
			FileInputStream f2=new FileInputStream(inFile2);
			FileInputStream f3=new FileInputStream(inFile3);
			
			FileOutputStream f4=new FileOutputStream(outFile,true);
			
			Vector<FileInputStream> vc=new Vector<FileInputStream>();
			vc.add(f1);
			vc.add(f2);
			vc.add(f3);
			//创建一个迭代器  循环集合使用
			Enumeration<FileInputStream> e = vc.elements();
			
			//创建序列流对象  一个接一个读取
			SequenceInputStream seq =new SequenceInputStream(e);

			//读取文件数据
			byte[] buf = new byte[1024];
			int length = 0; 
			
			while((length = seq.read(buf))!=-1){
				f4.write(buf,0,length);
			}		
			//关闭资源
			seq.close();
			f4.close();	
		}
}
