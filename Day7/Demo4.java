/*

this关键字代表了所属函数的调用者对象。
this关键字作用：
	1. 如果存在同名成员变量与局部变量时，在方法内部默认是访问局部变量的数据，可以通过this关键字指定访问成员变量的数据。
	2. 在一个构造函数中可以调用另外一个构造函数初始化对象。


this关键字调用其他的构造函数要注意的事项：
	1. this关键字调用其他的构造函数时，this关键字必须要位于构造函数中 的第一个语句。 ****  很重要哦
	2. this关键字在构造函数中不能出现相互调用 的情况，因为是一个死循环。

this关键字要注意事项：
	1. 存在同名的成员变量与局部变量时，在方法的内部访问的是局部变量(java 采取的是“就近原则”的机制访问的。)
	2. 如果在一个方法中访问了一个变量，该变量只存在成员变量的情况下，那么java编译器会在该变量的 前面添加this关键字。


*/

class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		car C=new car("奥迪",100000);
		//使用构造函数初始化对象
		System.out.println("汽车品牌"+C.name+"汽车价格"+C.Money);     //汽车品牌null汽车价格0.0  
		C.printMsg();  //局部变量的name值  奔驰
        C.printCarName();

		Computer Comp=new Computer("Lenovo",30,40);
		System.out.println("电脑品牌"+Comp.Logo+"尺寸"+Comp.Wight+Comp.height);

	}
}



class car
{
  String name;
  double Money;

//构造函数
 car(String name,double Money){   //形参默认也是一种局部变量
   name=name;        //这里name相当于局部变量 参数name为局部变量name赋值  并不是为成员变量name赋值
   this.Money=Money; //加this 代表了为当前对象的成员变量Money 赋值 

 }


  void printMsg(){
    String name="奔驰";  //局部变量 编译器就近原则
	System.out.println(name);
  
  }

//this关键字代表了所属函数的调用者对象。
  void printCarName(){
   System.out.println(this.Money);  //不加this  编译器会默认加一个this
  }
}

//this 调用构造函数
class Computer
{
   String Logo;
   int Wight;
   int height;

   Computer(String logo,int Wight,int height){
     this(height);  //调用一个有一个参数的构造函数。
	 this.Logo=logo;
	 this.Wight=Wight;
     

   
   }

  Computer(int height){
    this.height=height;
  }

 //默认有一个无参的构造函数，如果自己写的有参数的构造函数会覆盖掉无参，所以要写一个无参的构造函数
}