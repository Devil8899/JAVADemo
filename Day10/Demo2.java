/*
  �ӿ�ʵ�ֶ�̬
��̬�� ������������ͱ���ָ��������Ķ�������ǽӿ����͵��������ͱ���ָ���˽ӿ�ʵ���� �Ķ���

ʵ�ֹ�ϵ�µĶ�̬��
	
	�ӿ�  ����  = new  �ӿ�ʵ����Ķ���

*/

interface I_Fable  //�ӿڵķ���ȫ�����ǷǾ�̬�ķ����� ����ʵ�ֽӿڵ������ ��ֱ�ӵ�������ķ���
{
  public    void addUser(); 
  public	void delUser();

}
//
class User implements I_Fable
{
  public   void addUser(){
	  System.out.println("�û���ӳɹ�");
	 }
 public	 void delUser(){
	  System.out.println("�û�ɾ���ɹ�");
	 }

}

class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		I_Fable U=new User();
		U.addUser();
		U.delUser();
	
	}
}
