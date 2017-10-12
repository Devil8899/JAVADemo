/*多态

多态：一个对象具备多种形态。(父类的引用类型变量指向了子类的对象)

或者是接口 的引用类型变量指向了接口实现类的对象)

多态的前提：必须存在继承或者实现 关系。

    动物  a  = new   狗();

多态要注意 的细节：
	1.  多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量。  无论成员变量是不是静态
	2.  多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数。
	3.  多态情况下，子父类存在同名的静态的成员函数时，访问的是父类的成员函数。
	4.  多态情况下，不能访问子类特有的成员。
总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员，除了在同名非静态函数时才是访问子类的。

编译看左边，运行不一定看右边。

编译看左边：java编译器在编译的时候，会检查引用类型变量所属的类是否具备指定的成员，如果不具备马上编译报错。


多态的应用：
  1. 多态用于形参类型的时候，可以接收更多类型的数据 。
  2. 多态用于返回值类型的时候，可以返回更多类型的数据。




*/

class father
{
   String name="tom";
   void eat(){
     System.out.println("father在吃饭");
   }
   void study(){
          System.out.println("father在读书");
   }
   static void work(){
        System.out.println("father在工作");
   }

}

class son1 extends father
{
  String name="jerry";
  int age=20;
  void eat(){
     System.out.println("son1在吃饭,我是他的第一个儿子");
   }
   void study(){
    System.out.println("son1在学习");
   }
   static void work(){
        System.out.println("son1在工作");
   }
}
class son2 extends father
{
   String name="jack";
   void eat(){
     System.out.println("son2在吃饭，我是他的第二个儿子");
   }
   void study(){
    System.out.println("son2在学习");
   }
   static void work(){
        System.out.println("son2在工作");
   }
}


class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
       father fa=new son1();           //父类的引用类型变量指向了子类的对象
	   System.out.println(fa.name);   // 子父类存在同名的成员变量时，访问的是父类的成员变量。  无论成员变量是不是静态
       fa.eat();  //子父类存在同名的非静态的成员函数时，访问的是子类的成员函数。 
       fa.work();  //子父类存在同名的静态的成员函数时，访问的是父类的成员函数。
	  // System.out.println(fa.age);  //不能访问子类特有成员。
      
	   //第一种应用
	   son1 s1=	new son1();
       getValue(s1);
       getValue(new son2());
     

       System.out.println("_______________________________");
	    //第二种应用 
	   father f1= getWhoStudy(1);   //调用了使用多态的方法，定义的变量类型要与返回值类型一致。
       f1.study();

	}


    
	
	//第一种应用    形参类型的时候，可以接收更多类型的数据 。
	public static void getValue(father fa){   // father fa=new son1();
	 System.out.println("_______________________________");
	 fa.eat();
	}  


 
	//第二种应用    用于返回值类型的时候，可以返回更多类型的数据。
    public static father getWhoStudy (int i){
	      if(i==1){
		   return	   new son1();
		  }
	       else if(i==2){
			 return  new son2();
		   }
		 else return new father();
	   }
	
	


}
