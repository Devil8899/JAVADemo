/*
final(���ա����η�)  
	
final�ؼ��ֵ��÷���
	1. final�ؼ�������һ���������͵ı���ʱ���ñ����������¸�ֵ����һ�ε�ֵΪ���յġ�
	2. fianl�ؼ�������һ���������ͱ���ʱ��  �ñ�����������ָ���µĶ���
	3. final�ؼ�������һ��������ʱ�򣬸ú������ܱ���д��
	4. final�ؼ�������һ�����ʱ��  ���಻�ܱ��̳С�


���� �����η�һ��Ϊ�� public static final 

*/
class car
{

	//1.��һ���÷�
   final String name="��˹��";   //һ�θ�ֵ �������ٴθı�ֵ
   double Money;
   
   void Driver(){
     System.out.println("����Ʒ��"+this.name+"�۸�"+this.Money);
   }

  car(String name,double Money){
    // this.name=name;    //��Ϊ��Ա���� �Ǳ�final �ؼ���������  �����ٴθ�ֵ
	 this.Money=Money;

  }
 car(){
 
 };
 
}




class Demo
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

       // car c=new car("����",50000000);
        //c.Driver();
 
       final car c=new car();  //�����������ͱ���  �ñ�����������ָ���µĶ���
		c.Money=12345;
		c.Driver();
       
	   /*  ����  c ��������
	   c=new car();  //c����ָ���µĶ���
	   c.Money=999999;
	   c.Driver();
	   */
	   printMsg(c);  //���ַ�ʽ�����µĵ�ַ  �β��ڷ����ڲ����ھֲ�����  ����֮�� �ľֲ�����û���κι�ϵ

	   //final���εĺ������ܱ���д
     /* son S=new son();
	  S.work(); 
	  */
	}

	public static void printMsg(car c){
	   c=new car();
	   c.Money=5555666;
	   c.Driver();
	}
}



 class fu
{
	final void work(){
	  System.out.println("�����ڹ���!");
	}
}
class son extends fu
{

	//��д���ຯ�� ����
	void work(){
	  //super.work();
	  System.out.println("�����ڹ���!");

	}
}