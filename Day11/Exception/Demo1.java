/*
 �Զ����쳣��

�Զ����쳣��Ĳ��裺  �Զ���һ����̳�Exception���ɡ�
*/
//�̳��쳣��
class NoExceptionMy extends Exception
{
    //���ø���Ĺ��췽��
   public NoExceptionMy(String Meg){
      super(Meg);
   }

}

class Demo1 
{
	public static void main(String[] args) 
	{
		//�����쳣
		try{
		    Pthrow();
		}catch(Exception ex){
		  System.out.println(ex.toString());
		} 
		
	}
     
	 
	public static void Pthrow() throws Exception{
	   int i=0;
	   if(i==0){
	     throw new NoExceptionMy("�����ҵ��쳣��Ϣ");   //ʵ���� ���캯������
	   }
	    
	
	}
}
