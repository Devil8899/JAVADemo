/*

静态函数要注意的事项：
	1. 静态函数是可以调用类名或者对象进行调用的，而非静态函数只能使用对象进行调用。
	2. 静态的函数可以直接访问静态的成员，但是不能直接访问非静态的成员。	
		原因：静态函数是可以使用类名直接调用的，这时候可能还没有存在对象，
		而非静态的 成员数据是随着对象 的存在而存在的。

	3. 非静态的函数是可以直接访问静态与非静态的成员。
		原因：非静态函数只能由对象调用，当对象存在的时候，静态数据老早就已经存在了，而非静态
		数据也随着对象的创建而存在了。

	4. 静态函数不能出现this或者super关键字。
		原因：因为静态的函数是可以使用类名调用的，一旦使用类名调用这时候不存在对象，而this
		关键字是代表了一个函数 的调用者对象，这时候产生了冲突。

静态的数据的生命周期：静态的成员变量数据是优先于对象存在的。


static什么时候修饰一个函数？
	
	如果一个函数没有直接访问到非静态的成员时，那么就可以使用static修饰了。 一般用于工具类型的方法
	

静态函数不能访问非静态的成员？
	 静态函数只要存在有对象，那么也可以访问非 静态的数据。只是不能直接访问而已。



*/


class Demo6 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		new test().print();
		new test().pirnt2();

	}
}


class test
{
   String name;
   static String name2="jerry";
   int age;

   void print(){
     		System.out.println("Hello World!"+this.name);
   }
   //静态函数 不能调用非静态成员。 如 age  等等
   static void pirnt2(){
	   test te=new test();    
	   te.name="123";
        		System.out.println(te.name);
   
   }

}