/*接口


接口：拓展功能的。  usb接口.。。


接口的定义格式：
	
	interface 接口名{
	
	}

接口要注意的事项 ：
	1. 接口是一个特殊的类。
	2. 接口的成员变量默认的修饰符为： public static final 。那么也就是说接口中的成员变量都是常量。必须声明时就赋值。
	3. 接口中 的方法都是抽象的方法，默认的修饰符为： public abstract。
	4. 接口不能创建对象。
	5. 接口是没有构造方法的。
	6. 接口是给类去实现使用的，非抽象类实现一个接口的时候，必须要把接口中所有方法全部实现。

接口的作用：
	1. 程序的解耦。  （低耦合）
	2. 定义约束规范。
	3. 拓展功能。

实现接口的格式：

	class  类名 implements 接口名{
	
	}


类与接口之间关系： 实现关系。

类与接口要注意的事项：
	1. 非抽象类实现一个接口时，必须要把接口中所有方法全部实现。
	2. 抽象类实现一个接口时，可以实现也可以不实现接口中的 方法。
	3. 一个类可以实现多个接口 。
		
		疑问： java为什么不支持多继承，而支持了多实现呢？
			class A{
				
				public void print(){
					System.out.println("AAAAAA");
				}
			}

			class B{

				public void print(){
					System.out.println("BBBBBB");
				}
			}


			class C extends A ,B{
			
			}
			
			new C().print();
	
接口与接口之间关系： 继承关系。

接口与接口之间要注意事项：
	1. 一个接口是可以继承多个接口的。



*/

//定义接口
interface book
{
   String name="岛上书店";
   void books();

}

interface book2
{
 void  read();
}

//接口与接口之间是继承关系
interface student
{
   void print();
}
interface person extends student
{

}


//继承接口
class test implements book,book2  //继承多个接口
{
   public void books(){   //实现接口的方法
    System.out.println("读书是一件有意义的事情");
   }
   public void read(){
       System.out.println("wo正在读书");
   }
}

//继承接口
class test2 implements person
{
   public void print(){   //由于是继承  方法的访问权限不能低于父类方法的访问权限
	 System.out.println("打印一个方法"); 
	}

}

//抽象类 与接口的继承关系
abstract class test3 implements person
{
   //可以实现print方法  子类继承抽象类可以直接调用  或者不实现
   public void print(){
    	 System.out.println("抽象类实现一个 接口的 打印方法"); 

   }
}
//子类继承抽象类
class children extends test3
{
   public   void  print(){
	   super.print();   //调用父类的打印方法
	  // System.out.println("重写了父类的一个打印方法");
	}
}


class Demo3 
{
	public static void main(String[] args) 
	{
	      new test().books();
		  new test().read();
		  new test2().print();
		  //test3.print();   抽象类调用实现的接口方法有问题 不能是静态调用
		  new children().print();
	} 
}
