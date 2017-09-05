/*
构造代码块：

构造代码块的作用：给对象进行统一的初始化。

构造函数的作用： 给对应的对象进行初始化。

构造代码块的格式：
	
	{
		构造代码块
	}

注意： 构造代码块的大括号必须位于成员 位置上。


代码块的类别：
	1. 构造代码块。
	2. 局部代码块.   大括号位于方法之内。  作用：缩短局部 变量 的生命周期，节省一点点内存。
	3. 静态代码块    static 

*/


class Demo2 
{
	


	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new driver();
		/*局部代码块*/
		{
		   driver D=new driver();
		   System.out.print("这是局部代码块,方法内部使用后 自动在内存空间中回收");
		}
	}
}


class driver
{
	/*构造代码块*/
    {
	  System.out.print("我是构造代码块~");
	}
    
    String name;

    /*构造函数*/
	driver(){
		  System.out.print("\r\n 我是无参构造函数");	
	}
}

