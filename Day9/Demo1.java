/*

抽象类的应用场景：
	我们在描述一类事物的时候，发现该种事物确实存在着某种行为，
但是这种行为目前是不具体的，那么我们可以抽取这种行为 的声明，但是
不去实现该种行为，这时候这种行为我们称作为抽象的行为，我们就需要使用抽象类。

抽象类的好处: 强制要求子类一定要实现指定的方法。


抽象类要注意的细节：
	1. 如果一个函数没有方法体，那么该函数必须要使用abstract修饰,把该函数修饰成抽象 的函数。。
	2. 如果一个类出现了抽象的函数，那么该类也必须 使用abstract修饰。
	3. 如果一个非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现。
	4. 抽象类可以存在非抽象方法，也可以存在抽象的方法.
	5. 抽象类可以不存在抽象方法的。 
	5. 抽象类是不能创建对象的。
		疑问：为什么抽象类不能创建对象呢？
		因为抽象类是存在抽象方法的，如果能让抽象类创建对象的话，那么使用抽象的对象
		调用抽象方法是没有任何意义的。
	6. 抽象类是存在构造函数的，其构造函数是提供给子类创建对象的时候初始化父类的属性的。

    7.如果想调用抽象类的静态方法如何做?  可以直接类名.方法名调用
*/


class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        
		/*
		iphone iph=new iphone();
		iph.name="iphone8";
		iph.weight=90;
		iph.call();
		*/

       //调用抽象方法
       iphone iph=new iphone();
	   iph.callSomebody();

	 //  mobile new mobile();  抽象类 不能创建对象

      linAd ad=new linAd("华为",100);
	  ad.call();  //调用非抽象方法

	  mobile.call2();
 	}

}

/*父类  抽象类 2017/7/15*/
abstract class mobile
{
    String name;
	int weight;
    //非抽象方法
    void call(){
	  		System.out.println("say  Hello World!"+this.name);
	}
   
   //抽象方法 没有方法体 靠子类去实现
   abstract void callSomebody();

   //抽象类可以有构造函数
   mobile(String name , int weight){
     this.name=name;
	 this.weight=weight;
   }

   mobile(){
  
   }
   static void call2(){
      	System.out.println("你好,这是中文电话");
   }


}


//如果一个非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现。
class iphone extends mobile
{
   void callSomebody(){
  	  		System.out.println("call kobe!");
   }

}
class linAd extends mobile
{
   void callSomebody(){
  	  		System.out.println("call jack!");
   }
   linAd(String name,int weight){
      super(name,weight);  //调用父类的构造函数。
   }

}