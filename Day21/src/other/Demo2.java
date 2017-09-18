package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
装饰者设计模式：增强一个类的功能，而且还可以让这些装饰类互相装饰。

装饰者设计模式的步骤：
	1. 在装饰类的内部维护一个被装饰类的引用。
	2. 让装饰类有一个共同的父类或者是父接口。    都共同继承有一个父类对象。
	继承实现的增强类和修饰模式实现的增强类有何区别？

	继承实现的增强类：
		优点：代码结构清晰，而且实现简单. 
		缺点：对于每一个的需要增强的类都要创建具体的子类来帮助其增强，这样会导致继承体系过于庞大。

修饰模式实现的增强类：
		优点：内部可以通过多态技术对多个需要增强的类进行增强， 可以是这些装饰类达到互相装饰的效果。使用比较灵活。
		
		缺点：需要内部通过多态技术维护需要被增强的类的实例。进而使得代码稍微复杂。

	
	
	*/
public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		FileReader fileReader = new FileReader(file);
		//建立缓冲输入字符流
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//建立带行号的缓冲输入字符流  传一个缓冲输入字符流 实际上是传一个父类对象
		BufferedLineNum2 bufferedLineNum = new BufferedLineNum2(bufferedReader);
		
		//带分号的缓冲输入字符流
		BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum);   //多态技术实现 传入子类的对象。
		
		//带双引号的缓冲输入字符流
		BufferedQuto2 bufferedQuto2 = new  BufferedQuto2(bufferedReader);
		String line = null;
		while((line = bufferedQuto2.readLine())!=null){
			System.out.println(line);
		}
	}

}
//带行号的缓冲输入字符流
class BufferedLineNum2 extends BufferedReader{
	//在内部维护一个被装饰类的引用。
		BufferedReader bufferedReader;
		int count = 1;
		public BufferedLineNum2(BufferedReader bufferedReader){
			super(bufferedReader);// 注意： 该语句没有任何的作用，只不过是为了让代码不报错。
			this.bufferedReader = bufferedReader;			
		}
	
		public String readLine() throws IOException{
			String line = bufferedReader.readLine();
			if(line==null){
				return null;
			}
			line = count+" "+line;
			count++;
			return line;
		}	
}

//带分号缓冲输入字符流
class BufferedSemi2 extends BufferedReader{  //为什么要继承?  是为了让这些装饰类的对象可以作为参数进行传递，达到互相装饰 的效果。

	//1.在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;	
	public BufferedSemi2(BufferedReader bufferedReader){ // new BuffereLineNum();
		super(bufferedReader);// 注意： 该语句没有任何的作用，只不过是为了让代码不报错。
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if(line==null){
			return null;
		}
		line = line +";";
		return line;
	}
}
//缓冲类带双引号
class BufferedQuto2 extends BufferedReader{
	
	//在内部维护一个被装饰的类
	BufferedReader bufferedReader;
	
	public BufferedQuto2(BufferedReader bufferedReader){  //new  BufferedSemi2();
		super(bufferedReader) ; //只是为了让代码不报错..
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if(line==null){
			return null;
		}
		line = "\""+line +"\"";
		return line;
	}
}
	
