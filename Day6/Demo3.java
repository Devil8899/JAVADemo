/*
 ��װ��������
Ȩ�����η���Ȩ�����η����ǿ��Ʊ����ɼ���Χ�ġ�

public :  �����ġ� public���εĳ�Ա�������߷����κ��˶�����ֱ�ӷ��ʡ�

private �� ˽�еģ� private���εĳ�Ա�������߷���ֻ���ڱ����н���ֱ�ӷ��ʡ�

��װ�Ĳ��裺
	1. ʹ��private������Ҫ����װ�����ԡ�
	2. �ṩһ�������ķ������û��߻�ȡ��˽�еĳ�Ա���ԡ�
			 �����淶��
				set������();
				get������(); 

���ʣ� ��װһ��Ҫ�ṩget����set������ ��IDE�п���ʹ�ÿ�ݼ���װ
		��һ���� ������������ġ�

�淶 �� ����ʵ������һ��ʵ��������г�Ա���ԣ���Ա��������Ҫ��װ������

ʵ���ࣺʵ���������������һ�� ����ľͳ���Ϊʵ���ࡣ


������(Arrays����Ĺ�����):


��װ�ĺô���
	1. ������ݵİ�ȫ�ԡ�
	2. �����򵥡� 
	3. ������ʵ�֡�
*/

class Demo3 
{
	public static void main(String[] args) 
	{
          person P1=new person();
		  P1.name="sandy";
		  P1.Setsex("Ů");

		System.out.println("����"+P1.name+"�Ա�"+P1.Getsex()+"����"+P1.age);
	}
}

class person
{
    public String name;
	private String Sex;   //ʵ����ʱ�޷����� ��ֵ,ȡֵ��
    public int  age;      //Ĭ��ֵ��0
	//so easy  ͨ��Set() get() ����������
    /*����ֵ����*/
	public void Setsex(String s){
	   //���ԶԸ�ֵ�����߼��ж�
	   if(s=="��" || s=="Ů"){
	     Sex=s;
	   }else Sex="��"; 
	}
   
   /*����ֵ����*/
   public String Getsex(){
      return Sex;
   }



}