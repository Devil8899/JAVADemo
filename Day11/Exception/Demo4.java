/*
finally 块；

finally块的 使用前提是必须要存在try块才能使用。

finally块的代码在任何情况下都会执行的，除了jvm退出的情况。

finally非常适合做资源释放的工作，这样子可以保证资源文件在任何情况下都 会被释放。



try块的三种组合方式：


第一种： 比较适用于有异常要处理，但是没有资源要释放的。
		 try{

			可能发生异常的代码
	
			}catch(捕获的异常类型 变量名){
				处理异常的代码
			}

第二种：比较适用于既有异常要处理又要释放资源的代码。
		
		try{

			可能发生异常的代码
	
			}catch(捕获的异常类型 变量名){
				处理异常的代码
			}finally{ 
				释放资源的代码;
			}

第三种： 比较适用于内部抛出的是运行时异常，并且有资源要被释放。
		   try{

			可能发生异常的代码
	
			}finally{ 
				释放资源的代码;
			}

*/
import java.io.*;
class Demo4
{
	public static void main(String[] args) 
	{
		FileReader fileReader = null;
		try{
			//找到目标文件
			File file = new File("f:\\a.txt");
			//建立程序与文件的数据通道
			fileReader = new FileReader(file);
			//读取文件
			char[] buf = new char[1024];
			int length = 0; 
			length = fileReader.read(buf);
			System.out.println("读取到的内容："+ new String(buf,0,length));
		}catch(IOException e){
			System.out.println("读取资源文件失败....");
		}finally{
			System.out.println("我都会执行");
			try{
				//关闭资源
				fileReader.close();
				System.out.println("释放资源文件成功....");
			}catch(IOException e){
				System.out.println("释放资源文件失败....");
			}
		}
	}
}
