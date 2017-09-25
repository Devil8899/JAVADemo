package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/*
 
 需求： 把一首mp3先切割成n份，然后再把这些文件合并起来。
 
 */

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Cutfile();
		addFile();
	}

	//切割文件
	public static void Cutfile() throws IOException{
		File file=new File("D:\\liuz\\JAVADemo\\Day22\\src\\cn\\gril.mp3");
		//目标文件夹
		File dir = new File("D:\\liuz\\JAVADemo\\music");
		//读取文件
		FileInputStream finput=new FileInputStream(file);
		byte[] buf=new byte[1024*1024]; //每次读取1M  1kb*1024
		int length=0;
		for (int i = 0; (length=finput.read(buf))!=-1; i++) {   //length是每次读取到的字节  1048576字节 =1MB
		 FileOutputStream fout=	new FileOutputStream(new File(dir,i+".mp3"));
		 fout.write(buf,0,length);
		 fout.close();
		}
		finput.close();
	}
	
	//合并文件
	
	public static <T> void addFile() throws IOException{
		// 目标文件夹
		File dir1 = new File("D:\\liuz\\JAVADemo\\music");
		// 通过目标文件夹找到所有的MP3文件，然后把所有的MP3文件添加到vector中。
		File[] files = dir1.listFiles();
	    //排序  小到大
	    for (int i = 0;i < files.length;i++){
	        for(int j = i+1;j < files.length;j++){
	            if (Integer.parseInt(files[i].getName().replace(".mp3",""))> Integer.parseInt(files[j].getName().replace(".mp3",""))){
	                File temp = files[i];
	                files[i] = files[j];
	                files[j] = temp;
	            }
	        }
	    }
		
		
		Vector<FileInputStream> ve = new Vector<FileInputStream>();
//		for (File file : files) { // for循环增强
//			if (file.getName().endsWith(".mp3")) { // 判断文件名
//				ve.add(new FileInputStream(file));
//			}
//		}
		
		for (int i = 0; i < files.length; i++) {
			ve.add(new FileInputStream(files[i]));
		}
		
		
		
	
		// 通过Vector获取迭代器 循环集合
		Enumeration<FileInputStream> e = ve.elements();
		// 创建序列流
		SequenceInputStream inputStream = new SequenceInputStream(e);
		// 建立文件的输出通道
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\liuz\\JAVADemo\\all.mp3");
		byte[] by=new byte[1024*1024];
		int context=0;
         while ((context=inputStream.read(by))!=-1) {
		         fileOutputStream.write(by,0,context);
		       
		}
       //关闭资源
 		fileOutputStream.close();
 		inputStream.close();
	}

}
