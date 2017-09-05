/*
匿名内部类：没有类名的类就称作为匿名内部类。  一般也写在方法内部 和 局部内部类一样

匿名内部类的好处：简化书写。

匿名内部类的使用前提：必须存在继承或者实现关系才能使用。


匿名内部类一般是用于实参。

//匿名内部类 ：匿名内部类只是没有类名，其他的一概成员都是具备的。
//匿名内部类 也可以实现多态 但是不能强制转换  调用子类同名的方法;


*/

//抽象类 父类
abstract class father 
{
	public abstract  void work();


}

//其它类
 class person
{
    
	//public abstract  void driver();

	public void eat(){
	  //1. 局部类 定义在方法内部
	  class son1 extends father   //继承
	  { 
          public void work(){      //重写方法
		      System.out.println("son1 工作");
		  }   

		  //子类独有方法
		  public void play(){
		      System.out.println("son1 在玩");
		  }

	  }
	  son1 s1=new son1();   //局部类调用
	  s1.work();  
	  
	  //多态  通过强制转换 调用子类独有方法
	  father fa=new son1();
      son1 s2=(son1)fa;  //转换
	  s2.play();
	  System.out.println("____________________________________");
	   //匿名类
	   //匿名内部类 ：匿名内部类只是没有类名，其他的一概成员都是具备的。
	   //1.匿名类内部类调用
	  new father(){    
	     public void work(){      //重写方法
		      System.out.println("son2 工作 我是匿名类 我继承了father类 但是我没有类名");
		  } 
	  }.work();
     //2.也可以多态来调用  但是如果子类的方法是独有的 无法强制转换 只能通过局部类来实现
	  //这里为什么抽象类可以实例化 因为   匿名内部类与father 是继承 的关系。  目前是创建father子类的对象.  后面的new father 是子类对象
	  father ft=new father(){
	      public void work(){      //重写方法
		      System.out.println("son3 工作 我是匿名类 我继承了father类 但是我没有类名");
		  } 
	  
	  };

     //调用
	 ft.work();   //多态 子父类同名方法 非静态 调用默认是成员方法；

	}



}

//____________________________________________________________________
//接口  匿名类实现

interface I_workable
{
    void code();

}

//其它类
class keyd
{
	//实现接口
    public void printcode(){
		//创建一个匿名内部类的对象   
	   new I_workable(){     //创建一个实现类 匿名形式的 和  class myable  imperlates I_workable 一样  
	        public void code(){
			  System.out.println("这是一个匿名对象类 实现了接口");
			}
	   }.code();
	   
	
	}


}





class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		person per=new person();
		per.eat();

		keyd ke=new keyd();
		ke.printcode();

        //实参传入
         test(
		    new  I_workable(){    //将匿名对象类作为实参 传入
		    public  void code(){
			  System.out.println("匿名对象类 作为实参传入");   //将接口的方法实现了
			  
			  }
		 }
		 );

		 keyd ke1=new keyd();
		 System.out.println(ke1.toString());  
	}
     
	//匿名内部类一般是用于实参
	public static void test(I_workable  ab){   //这里相当与传进了一个实现接口的类对象 只是没有类名  I_workable wo=new 实现类();
	     ab.code();
	
	}
}
