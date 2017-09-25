package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 对象的输入输出流 : 对象的输入输出流 主要的作用是用于写对象的信息与读取对象的信息。 对象信息一旦写到文件上那么对象的信息就可以做到持久化了
 
 对象的输出流： ObjectOutputStream 类
 
对象的输入流: ObjectInputStream 类
 
 
 ObjectOutputStream的使用步骤：
 	
 
 对象输入输出流要注意的细节：
 	1. 如果对象需要被写出到文件上，那么对象所属的类必须要实现Serializable接口。 Serializable接口没有任何的方法，是一个标识接口而已。
 	2. 对象的反序列化创建对象的时候并不会调用到构造方法的、
 	3. serialVersionUID 是用于记录class文件的版本信息的，serialVersionUID这个数字是通过一个类的类名、成员、包名、工程名算出的一个数字。
 	4. 使用ObjectInputStream反序列化的时候，ObjeectInputStream会先读取文件中的serialVersionUID，然后与本地的class文件的serialVersionUID
 	进行对比，如果这两个id不一致，那么反序列化就失败了。
 	5. 如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类指定一个serialVersionUID，如果一类已经指定的serialVersionUID，然后
 	在序列化与反序列化的时候，jvm都不会再自己算这个 class的serialVersionUID了。
 	6. 如果一个对象某个数据不想被序列化到硬盘上，可以使用关键字transient修饰。
 	7. 如果一个类维护了另外一个类的引用，那么另外一个类也需要实现Serializable接口。
 	8.集合类都实现了Serializable接口
 */
public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		//WriteObj();
		ReadObj();
	}

	// 对象的输出流
	public static void WriteObj() throws IOException,FileNotFoundException{
		File file=new File("D:\\liuz\\JAVADemo\\obj.txt");
		//建立数据输出流对象
		FileOutputStream fout=new FileOutputStream(file);	
		//建立对象的输出流对象
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Home home=new Home(1, "beijing");
		user u=new user("zhangsan","asdqwe",home);
		//输出对象
		objout.writeObject(u);
		objout.close();	
	}
	
	//对象输入流
	public static void ReadObj() throws IOException, ClassNotFoundException{
		File file=new File("D:\\liuz\\JAVADemo\\obj.txt");
		//建立数据输入流对象
		FileInputStream fint=new FileInputStream(file);	
		//建立对象的输入流对象
		ObjectInputStream objout=new ObjectInputStream(fint);
		//读取对象
		user u=(user)objout.readObject();  ////创建对象肯定要依赖对象所属 的class文件。
		objout.close();
		System.out.println("打印"+u);
	}


}

//被序列化对象  必须实现这个接口Serializable  这个接口没有任何方法  并且所有的集合类都实现了这个接口    标识接口
class user implements Serializable{
	/**
	指定serialVersionUID是因为 对象输出流后 修改对象成员  这时如果读取对象输入流 会报错
	但是指定serialVersionUID后 不会报错了  jvm都不会再自己算这个 class的serialVersionUID了。
	 */
	
	private static final long serialVersionUID = 126302467574898885L;  //指定serialVersionUID
	String name;
	String passwrod;
	int age;
	transient String mobile;  //透明  序列化时不会写入到硬盘
	Home  home;           //在类中维护另一个类对象
	
	
	public user(String name,String password,Home home){
		this.name=name;
		this.passwrod=password;	
		this.home=home;
		System.out.println("调用构造方法");
	}


	@Override
	public String toString() {
		return "用户名"+this.name+"密码"+this.passwrod+"年龄"+this.age;
	}	
}
//同样需要实现Serializable 接口
class Home implements Serializable {
	int id;
	String city;
	public Home(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	
	
}










