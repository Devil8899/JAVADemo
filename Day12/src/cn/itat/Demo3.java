package cn.itat;
/*
  java是面向对象的语言，核心思想：找适合 的对象做适合 的事情：
	
	方式一：自定义类，然后通过自定义的类创建对象。
	
	方式二：sun提供了很多的类给我使用，我们只需要认识这些类，我们就可以通过这些类创建对象了。
	
Object类是所有类的终极父类。 任何一个类都继承了Object类。


Object类：


Object类常用的方法：
	toString();     返回该对象的字符串表示。 返回一个字符串用于描述该对象的。
疑问： toString() 有何作用？	  重写toString之后，我们直接输出一个对象的时候，就会输出符合我们所需求的格式数据。
	
	equals(Object obj)   用于比较两个对象的内存地址，判断两个对象是否为同一个对象。
	
	hashCode()   返回该对象的哈希码值(大家可以把哈希码就 理解成是对象的内存地址)/


java中的规范：一般我们重写了一个类的equals方法，我们都会重写它的hashCode方法。



java是开源....源代码公开...

查看源代码的方式：
	方式一： 按住ctrl键，单击你需要看的源代码.
	
	方式二：把光标移动到你需要查看代码处按下F3.
	

为什么我们要查看源代码：
	1，查看源代码可以了解别人是如何写出这个技术的，让我们了解的更加的深入。
	2. 吸收大牛的思想。

看源代码最忌讳的一点： 不要每行代码都弄懂是什么意思，能看个大概 猜出他意思就足矣。

 * */
public class Demo3 {
	public static void main(String[] args) {
		//Object 常用方法 
		Object o = new Object();
		System.out.println(o.toString());  
		// java.lang.Object@18b3364    返回的字符串表示： 完整类名+@+ 对象的哈希码
		System.out.println(o);  
		// 通过查看源代码得知，直接输出一个对象 的时候，实际上在println方法内部会调用这个 调用的toString方法，把把toString方法返回的内容输出。
		//疑问： 为什么直接输出一个对象的时候和输出对象的toString方法返回的字符串结果是一样的呢？
		
		
		//重写Object 方法
		car c=new car("宝马",100000);
		System.out.println(c);   //println会自动调用toString方法；
		//重写equals 方法 
		car c2=new car("宝马",200000);
		System.out.println(c2.equals(c));   
	    //重写hashCode
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("_____________________________");
		
		
		 father fa=new car("",1);  //多态练习
		 //子父类存在同名非静态方法 默认调用子类的同名方法
		 fa.print();
	}
	
	//判断继承类方法
	public void printMsg(){
	   if (new Demo3() instanceof Object){   //Object 包名 java.lang
		   System.out.println("Demo3 继承与Object类");
	   }else{
		   System.out.println("Demo3 不继承与Object类");
	   }
	}
	
	
	
}
//定义类
class car extends father {
	String name;
	int Money;
	//构造方法;
	public car(String name, int Money){
		this.name=name;
		this.Money=Money;	
	}
	//重写toString方法
	public String  toString(){
	 //return super.toString();    //调用父类的toString()方法;
	return "当前的汽车品牌是："+this.name+" 价格是"+this.Money;	
	 
	}
	
	//重写equals 方法   默认方法是比较对象内存中的地址。
	public boolean  equals(Object obj){
		car c1=(car) obj;  //强制类型转换  调用子类的成员
		if(this.name ==c1.name){
			return true;
		}else return false;	
	}
	//重写hashCode方法
	public int  hashCode(){
		return this.Money;	
	}
	
	//子类的命名打印方法
	public void print(){
		System.out.println("子类的打印方法");
		//super.print();
	}
	
}
class father{
	String Di="test1";
	public void print(){
		System.out.print("父类的打印方法");
		
	}
	
}
