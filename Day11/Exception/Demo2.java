/*
自定义异常类练习



*/
class myNoMoneyException extends Exception
{

   public myNoMoneyException(String Msg){
     super(Msg);
   }

}



class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		try{
				PrintNoMoney(90);

		}catch(myNoMoneyException e){
			e.printStackTrace();   //调用继承的printStackTrace();方法   //打印异常栈信息打印异常栈信息
		  System.out.println("异常了 钱没带");
		
		}
	}

	public static  void PrintNoMoney(int i)throws myNoMoneyException{
	   if(i<100){
	    throw new myNoMoneyException("Money不够");
	   }
	   else System.out.println("可以吃美食");
	   
	
	}
}
