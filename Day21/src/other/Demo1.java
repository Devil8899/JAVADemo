package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
装饰者设计模式：增强一个类的功能，而且还可以让这些装饰类互相装饰。

BufferedReader是不是拓展了FileReader的功能。
BuferedWriter 也是拓展了FileWriter的功能。

需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。

 需求2：编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
 
 需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。
 
需求4： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号。
 
需求5： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号+ 双引号。

需求6： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号+ 行号。
  
需求7： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号+双引号。

----| Reader
-----------| BufferedReader
---------------| BufferedLineNum  带行号
---------------| BufferedSemi    带分号
---------------| BufferedQuto   带双引
---------------| 子类.. 
---------------|

增强一个类的功能时候我们可以选择使用继承：
	
	通过继承实现增强一个类的功能优点：   代码结构清晰，通俗易懂。
	
	缺点： 使用不灵活，会导致继承的体系过于庞大。
*/
public class Demo1 {
	public static void main(String[] args) throws IOException {
    //找到目标文件
	File file=new File("D:\\liuz\\JAVADemo\\a.txt");
	//建立连接
	FileReader freader=new FileReader(file);
	//建立缓冲输入字符流
	BufferedQuto bufferedReader = new BufferedQuto(freader);
    String line=null;
    while((line = bufferedReader.readLine())!=null){ 
    	System.out.println(line);
    }
	}
}

//带行号的缓冲输入字符流
class BufferedLineNum extends BufferedReader {
	int Num = 1;
	// 构造函数
	public BufferedLineNum(Reader in) {
		super(in); // 调用父类构造函数
	}
	//增强readLine方法返回 的字符串带有行号。
	@Override
	public String readLine() throws IOException {
        //调用父类的readLine方法
		String context = super.readLine();
		if (context == null) {
			return null;
		}
		//添加行号
		context = Num + " " + context;
		Num++;
		return context;
	}
}


//带分号的缓冲输入字符流
class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}
}


//带双引号的缓冲输入字符流
class  BufferedQuto extends BufferedReader{

	public BufferedQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line+"\"";
		return line;
	}
}
