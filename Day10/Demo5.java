/*
�����ڲ��ࣺû����������ͳ���Ϊ�����ڲ��ࡣ  һ��Ҳд�ڷ����ڲ� �� �ֲ��ڲ���һ��

�����ڲ���ĺô�������д��

�����ڲ����ʹ��ǰ�᣺������ڼ̳л���ʵ�ֹ�ϵ����ʹ�á�


�����ڲ���һ��������ʵ�Ρ�

//�����ڲ��� �������ڲ���ֻ��û��������������һ�ų�Ա���Ǿ߱��ġ�
//�����ڲ��� Ҳ����ʵ�ֶ�̬ ���ǲ���ǿ��ת��  ��������ͬ���ķ���;


*/

//������ ����
abstract class father 
{
	public abstract  void work();


}

//������
 class person
{
    
	//public abstract  void driver();

	public void eat(){
	  //1. �ֲ��� �����ڷ����ڲ�
	  class son1 extends father   //�̳�
	  { 
          public void work(){      //��д����
		      System.out.println("son1 ����");
		  }   

		  //������з���
		  public void play(){
		      System.out.println("son1 ����");
		  }

	  }
	  son1 s1=new son1();   //�ֲ������
	  s1.work();  
	  
	  //��̬  ͨ��ǿ��ת�� ����������з���
	  father fa=new son1();
      son1 s2=(son1)fa;  //ת��
	  s2.play();
	  System.out.println("____________________________________");
	   //������
	   //�����ڲ��� �������ڲ���ֻ��û��������������һ�ų�Ա���Ǿ߱��ġ�
	   //1.�������ڲ������
	  new father(){    
	     public void work(){      //��д����
		      System.out.println("son2 ���� ���������� �Ҽ̳���father�� ������û������");
		  } 
	  }.work();
     //2.Ҳ���Զ�̬������  �����������ķ����Ƕ��е� �޷�ǿ��ת�� ֻ��ͨ���ֲ�����ʵ��
	  //����Ϊʲô���������ʵ���� ��Ϊ   �����ڲ�����father �Ǽ̳� �Ĺ�ϵ��  Ŀǰ�Ǵ���father����Ķ���.  �����new father ���������
	  father ft=new father(){
	      public void work(){      //��д����
		      System.out.println("son3 ���� ���������� �Ҽ̳���father�� ������û������");
		  } 
	  
	  };

     //����
	 ft.work();   //��̬ �Ӹ���ͬ������ �Ǿ�̬ ����Ĭ���ǳ�Ա������

	}



}

//____________________________________________________________________
//�ӿ�  ������ʵ��

interface I_workable
{
    void code();

}

//������
class keyd
{
	//ʵ�ֽӿ�
    public void printcode(){
		//����һ�������ڲ���Ķ���   
	   new I_workable(){     //����һ��ʵ���� ������ʽ�� ��  class myable  imperlates I_workable һ��  
	        public void code(){
			  System.out.println("����һ������������ ʵ���˽ӿ�");
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

        //ʵ�δ���
         test(
		    new  I_workable(){    //��������������Ϊʵ�� ����
		    public  void code(){
			  System.out.println("���������� ��Ϊʵ�δ���");   //���ӿڵķ���ʵ����
			  
			  }
		 }
		 );

		 keyd ke1=new keyd();
		 System.out.println(ke1.toString());  
	}
     
	//�����ڲ���һ��������ʵ��
	public static void test(I_workable  ab){   //�����൱�봫����һ��ʵ�ֽӿڵ������ ֻ��û������  I_workable wo=new ʵ����();
	     ab.code();
	
	}
}
