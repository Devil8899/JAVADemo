//��
class Demo1
{
/**
  �ֲ�����  �������ڲ�    ���ڶ�   ��ʼ����Ĭ��ֵ
  ��Ա����  ���巽���ڲ�  ����ջ   ��ʼ��û��Ĭ��ֵ ��Ҫ�ֶ���ֵ  �������ʼ��ֵ��û�г�ʼֵ������ʹ��

��������
�洢λ��  ��Ա�������ڶ������洢�ڶ��ڣ����ڵ�ʵ�壬��û������ָ����ʱ���������������� �ֲ���������ջ�ڴ��У�������ʹ��ʱ�����Ͼͻᱻ�ͷš�

*/
	
	public static void main(String[] args) 
	{
	
        /*ʵ����һ���������*/
        driver Dr=new driver();
        Dr.name="jerry";   /*˾��������*/
        Dr.age=20;         /*˾��������*/
        Dr.print();
        driver Dr2=new driver();
        Dr2.name="jack";
        System.out.println();   /*����*/
        Dr2.print();   /*age Ĭ�ϸ�ֵΪ0*/
        Dr2=Dr;
        Dr2.print();  /*������Dr��print����  ��Ϊ�ڴ��еĵ�ַ�����˱仯  Dr2�ĵ�ַָ����Dr*/
	}

  

}

/*����˾����*/
class driver
{
      /*�����Ա���� �ֶ� �洢����*/
      String name;
	  int  age;
      /*���庯�� ִ����Ϊ����*/
      public void print(){
           System.out.print("�û�����"+name+",�����ǣ�"+age);
   
   }
}