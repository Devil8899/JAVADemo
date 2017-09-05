/*
单列模式

解决一个类在内存中只存在一个对象，想要保证对象的唯一。

单例设计模式的步骤：	


饿汉单例设计模式
	1. 私有化构造函数。
	2. 声明本类的引用类型变量，并且使用该变量指向本类对象。
	3. 提供一个公共静态的方法获取本类的对象。

懒汉单例设计模式：
	1. 私有化构造函数。
	2. 声明本类的引用类型变量，但是不要创建对象，
	3. 提供公共静态 的方法获取本类 的对象，获取之前先判断是否已经创建了本类 对象
	，如果已经创建了，那么直接返回对象即可，如果还没有创建，那么先创建本类的对象，
	然后再返回。


推荐使用： 饿汉单例设计模式。  因为懒汉单例设计模式会存在线程安全问题，目前还不能保证一类在内存中只有一个对象。



*/


class Demo7 
{
	public static void main(String[] args) 
	{
		car c=car.getStance();
		c.name="jerry";
        System.out.println(c.name);  //jerry
        car c1=car.getStance();
		System.out.println(c1.name);//jerry  因为他们内存中的地址指向的都是一个

	}
}


//饿汉
class car
{
    /*1.私有 构造函数  这样就不能实例化对象*/
	private car(){
	
	}
	String name;

   /*类类型的静态成员*/
   private static car Ca=new car();
   
   //提供一个公共静态的方法获取本类的对象。
   public static car getStance(){
     
   return Ca;
   }
}


class Single2 {
	private static Single2 s = null; // 懒汉

	private Single2() {

	}

	public static Single2 getInstance() {
		if (s == null) {
			s = new Single2();
		}
		return s;
	}
}

