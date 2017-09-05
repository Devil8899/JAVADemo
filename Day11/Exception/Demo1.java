/*
 自定义异常类

自定义异常类的步骤：  自定义一个类继承Exception即可。
*/
//继承异常类
class NoExceptionMy extends Exception
{
    //调用父类的构造方法
   public NoExceptionMy(String Meg){
      super(Meg);
   }

}

class Demo1 
{
	public static void main(String[] args) 
	{
		//处理异常
		try{
		    Pthrow();
		}catch(Exception ex){
		  System.out.println(ex.toString());
		} 
		
	}
     
	 
	public static void Pthrow() throws Exception{
	   int i=0;
	   if(i==0){
	     throw new NoExceptionMy("这是我的异常信息");   //实例化 构造函数传参
	   }
	    
	
	}
}
