/*

构造代码块 
构造函数
成员变量  之间的代码执行优先级

构造 代码块要注意的事项：
	1. java编译器编译一个java源文件的时候，会把成员变量的声明语句提前至一个类的最前端。
	2. 成员变量的初始化工作其实都在在构造函数中执行的。
	3. 一旦经过java编译器编译后，那么构造代码块的代码块就会被移动构造函数中执行，是在构造函数之前执行的，构造函数的中代码是最后执行 的。
	4. 成员变量的显示初始化与构造代码块 的代码是按照当前代码的顺序执行的。


*/


class Demo3 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		System.out.print(new Teacher().i);   //300000

		System.out.print("\r\n" + new test().i);   //1   没有构造函数按照代码顺序执行
	}
}



class Teacher
{
    int i=100000;
   
	{                         //构造代码块
	  i=200000; 
	
	}
    Teacher(){               //构造函数
	  i=300000;
	}
}


class test
{

   //成员变量的显示初始化与构造代码块 的代码是按照当前代码的顺序执行的。
	
   
	{
	  i=2; 
	}
	int i=1;
    /*test(){
	  i=300000;
	}*/
}


