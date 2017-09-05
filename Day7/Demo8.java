/**
super关键字代表了父类空间的引用。

super关键字的 作用：
	1. 子父类存在着同名的成员时，在子类中默认是访问子类的成员，可以通过super关键字指定访问父类的成员。
	2. 创建子类对象时，默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法。

super关键字调用父类构造方法要注意的事项：
	1. 如果在子类的构造方法上没有指定调用父类的构造方法，那么java编译器会在子类的构造方法上面加上super()语句。
	2. super关键字调用父类的构造函数时，该语句必须要是子类构造函数中的第一个语句。
	3. super与this关键字不能同时出现在同一个构造函数中调用其他的构造函数。因为两个语句都需要第一个语句。


super关键字与this关键字的区别：
	1. 代表的事物不一致。
			1. super关键字代表的是父类空间的引用。	
			2. this关键字代表的是所属函数的调用者对象。
	2. 使用前提不一致。
			1. super关键字必须要有继承关系才能使用。
			2. this关键字不需要存在继承关系也可使用。
	3. 调用构造函数的区别：
			1. super关键字是调用父类的构造函数。
			2. this关键字是调用本类的构造函数。

*/
class Demo8 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        student stu=new student();
		//stu.name="zhangsan";
		stu.address="shanghai";
		stu.age=25;
        stu.Study();
        stu.Working();
	}
}


class person
{
  String name;
  String address;  //priavte 的成员变量 不能被继承。
  public void  Working(){
    System.out.println("人在工作"+name);
  
  }
   person(){
   
   }
  person(String name){
   this.name=name;
  }
}

//子类继承与父类  方法属性都能被继承。
class student extends person
{
   int age;
   public void Study(){
    System.out.println("学生在学习,学生的姓名"+name+"学生的年龄"+age+"地址"+address);
   
   }

  

   student(){
	   super();
        //super("jerry");  //在构造函数中 调用父类构造函数 为父类成员变量赋值。
   
   }

}
