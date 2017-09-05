/*内部类
内部类：一个类定义在另外一个类的内部，那么该类就称作为内部类。

内部类的class文件名： 外部类$内部类.  好处：便于区分该class文件是属于哪个外部类的。  outer$inner.class

内部类的类别：

	1. 成员内部类:
			
			成员内部类的访问方式：
					
					方式一：在外部类提供一个方法创建内部类的对象进行访问。
					
					方式2二：在其他类直接创建内部类的对象。 格式：外部类.内部类  变量名 = new 外部类().new 内部类();
			
			注意： 如果是一个静态内部类，那么在其他类创建 的格式：
					外部类.内部类  变量名 = new 外部类.内部类();


		   内部类的应用场景： 我们在描述A事物的时候，发现描述的A事物内部还存在另外一个比较
		   复杂的事物B时候，而且这个比较复杂事物B还需要访问A事物的属性等数据，那么这时候
		   我们就可以使用内部类描述B事物。

		   比如： 人--->心脏

		   class 人{
			
			血

			氧气

			等....

			class 心脏{
			
			}		

		   }

		   内部类的好处：内部类可以直接访问外部类的所有成员。

			内部类要注意的细节：
				1. 如果外部类与内部类存在同名的成员变量时，在内部类中默认情况下是访问内部类的成员变量。
				   可以通过"外部类.this.成员变量名" 指定访问外部类的 成员。
				2. 私有的成员内部类只能在外部类提供一个方法创建内部类的对象进行访问，不能在其他类创建对象了。
				3. 成员内部类一旦出现了静态的成员，那么该类也必须 使用static修饰。


*/

//外部类
class outer
{
   
   int i=100;
   int y=500;
   void outerPrint(){
    	   System.out.println("外部类打印方法");
   }

   //内部类
   //private
  class inner
  {
   int y=50;
                                                        //如果外部类与内部类存在同名的成员变量时,在内部类中默认情况下是访问内部类的成员变量
    void innerprint(){                                 //outer.this.y  外部类.this.成员变量名  调用外部类的同名成员变量
	   System.out.println("内部类打印方法"+outer.this.y);
	}
  }
  
  //静态内部类	
  static class inner2
  {
	  static int w=19;
      void print2(){
	   System.out.println("内部类2新的方法");
	  
	  }
  }


  // 在外部类提供一个方法创建内部类的对象进行访问。
  public void printInfo(){
    inner ne=new inner();
	ne.innerprint();
  }
}


//其它类
class Demo3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
       //1.访问内部类
         outer ou=new outer();
	     ou.printInfo();
      
         System.out.println("_________________________________");
	  //2.在其他类直接创建内部类的对象
	     outer.inner iner=new outer().new inner();
	     iner.innerprint();
	 
	 //静态内部类
	    outer.inner2 ier2=new outer.inner2();
		ier2.print2();
	}
}
