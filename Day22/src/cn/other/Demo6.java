package cn.other;
/*
打印流（printStream）  打印流可以打印任意类型的数据，而且打印数据之前都会先把数据转换成字符串再进行打印。
包括打印对象等等都是




*/
import java.io.*;

public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根

		/*FileOutputStream fileOutputStream = new FileOutputStream("F:\\a.txt");
		fileOutputStream.write("97".getBytes());   //如果不转为string  97 会使用char 存储  文件中是a
		fileOutputStream.close();*/
		
		
		//1. 打印流可以打印任何类型的数据，而且打印数据之前都会先把数据转换成字符串再进行打印。
		File file = new  File("D:\\a.txt");
		//创建一个打印流
		PrintStream printStream = new PrintStream(file);
		/*
		printStream.println(97);
		printStream.println(3.14);
		printStream.println('a');
		printStream.println(true);
		Animal a = new Animal("老鼠", "黑色");
		printStream.println(a);
		
		
		//2. 默认标准的输出流就是向控制台输出的 可以重新设置了标准的输出流对象 将对象输出到了文件中
		System.setOut(printStream); //重新设置了标准的输出流对象
		System.out.println("哈哈，猜猜我在哪里！！");
		*/
		
		//3.收集异常的日志信息。
		File logFile = new File("D:\\2015年1月8日.log");
		PrintStream logPrintStream = new PrintStream( new FileOutputStream(logFile,true) );  //追加内容 不会覆盖掉文件
		try{
			int c = 4/0;
			System.out.println("c="+c);
			int[] arr = null;
			System.out.println(arr.length);
			
		}catch(Exception e){
			e.printStackTrace(logPrintStream);
			
		}
		
		
		
	}

}
