/*
Ŀǰ�����⣺����Ĺ����޷��������������

������д��ǰ�᣺ ����Ҫ���ڼ̳еĹ�ϵ��

��������д: �Ӹ������ͬ���ĺ�����������Ǿͳ���Ϊ��������д��

ʲô��ʱ��Ҫʹ�÷�������д������Ĺ����޷��������������ʱ��

������дҪע������
	1.������дʱ�� ���������β��б�����һ�¡�
	2.������дʱ�������Ȩ�����η�����Ҫ���ڻ��ߵ��ڸ����Ȩ�����η���  ******
	3.������дʱ������ķ���ֵ���ͱ���ҪС�ڻ��� ���ڸ���ķ���ֵ���͡� 
	4.������дʱ�� �����׳����쳣����ҪС�ڻ��ߵ��ڸ����׳����쳣���͡�
			Exception(�)
			RuntimeException(С��)

���������أ���һ������ ���������������� ���ϵ�ͬ������,����Ϊ�������ء�

�������ص�Ҫ��
	1. ������Ҫһ�¡�
	2. �β��б���һ�£��βεĸ������β� �����Ͳ�һ�£�
	3. �뷵��ֵ�����޹ء�

*/

class Demo9 
{
	public static void main(String[] args) 
	{
	   Son S=new Son();
	   S.playGame();
	   System.out.println(S.name);

       System.out.println(S.printmsg());   //��ӡһ���ڴ��ַ

	}
}


class father
{
   String name="tom";
   
   void playGame(){
      System.out.println("father ��playgame");  
   }
   

   //���ظ���
    test printmsg(){
   
    return new test();
   }


}

class Son extends father
{ 
  
   //String name="jerry";
   void playGame(){
	   //super.playGame();   //���ø����ͬ������
      System.out.println("Son ��playgame");  
   }

   //����ķ���ֵ���ͱ���ҪС�ڻ��� ���ڸ���ķ���ֵ���͡�
   //������д   ���ظ��� ��������������
    car printmsg(){
   
    return new car();
   }

   
}




class car
{

}

class test extends car
{
}