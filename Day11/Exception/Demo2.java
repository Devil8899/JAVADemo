/*
�Զ����쳣����ϰ



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
			e.printStackTrace();   //���ü̳е�printStackTrace();����   //��ӡ�쳣ջ��Ϣ��ӡ�쳣ջ��Ϣ
		  System.out.println("�쳣�� Ǯû��");
		
		}
	}

	public static  void PrintNoMoney(int i)throws myNoMoneyException{
	   if(i<100){
	    throw new myNoMoneyException("Money����");
	   }
	   else System.out.println("���Գ���ʳ");
	   
	
	}
}
