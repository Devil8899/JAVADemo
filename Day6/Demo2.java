/*��������
  ��������û�����ֵ�ʵ�壬Ҳ���Ǹ�ʵ��û�ж�Ӧ�ı��������á�

��������Ҫע������
	1. ����һ�㲻�����������������ֵ����Ϊ��Զ�޷���ȡ����
	2. ��������������Զ����������ͬһ������
	3. ��Ҫ��Ӧ�÷����ĵ���
*/
class  Demo2
{
	public static void main(String[] args) 
	{

         new doctor().name="zhangsan";           //Ϊ�����������Ը�ֵ  ���ַ�ʽ�������õ�
		 System.out.println(new doctor().name);  //null
		 System.out.print(new doctor()==new doctor());  //false  ��Ϊnew��2������  ָ��ͬ���ڴ��ַ �Ƚϵ�����������ĵ�ַ
		 new doctor().Iswork();
		 /*�������� ���Խ�����������Ϊʵ�ʲ��������ݽ�ȥ*/
        PrintMsg(new doctor().getName());


	}

	public static void PrintMsg(String name){
	  System.out.print(name+"��һ������ҽ��");
	
	
	}
}

class doctor
{
     String name;
	 int   age;
     public void Iswork(){
	   System.out.print("\r\n ҽ�������� \r\n");
	 }
      
     public String getName(){
	   return "jerry";
	 }

}
