/**
super�ؼ��ִ����˸���ռ�����á�

super�ؼ��ֵ� ���ã�
	1. �Ӹ��������ͬ���ĳ�Աʱ����������Ĭ���Ƿ�������ĳ�Ա������ͨ��super�ؼ���ָ�����ʸ���ĳ�Ա��
	2. �����������ʱ��Ĭ�ϻ��ȵ��ø����޲εĹ��췽��������ͨ��super�ؼ���ָ�����ø���Ĺ��췽����

super�ؼ��ֵ��ø��๹�췽��Ҫע������
	1. ���������Ĺ��췽����û��ָ�����ø���Ĺ��췽������ôjava��������������Ĺ��췽���������super()��䡣
	2. super�ؼ��ֵ��ø���Ĺ��캯��ʱ����������Ҫ�����๹�캯���еĵ�һ����䡣
	3. super��this�ؼ��ֲ���ͬʱ������ͬһ�����캯���е��������Ĺ��캯������Ϊ������䶼��Ҫ��һ����䡣


super�ؼ�����this�ؼ��ֵ�����
	1. ��������ﲻһ�¡�
			1. super�ؼ��ִ�����Ǹ���ռ�����á�	
			2. this�ؼ��ִ���������������ĵ����߶���
	2. ʹ��ǰ�᲻һ�¡�
			1. super�ؼ��ֱ���Ҫ�м̳й�ϵ����ʹ�á�
			2. this�ؼ��ֲ���Ҫ���ڼ̳й�ϵҲ��ʹ�á�
	3. ���ù��캯��������
			1. super�ؼ����ǵ��ø���Ĺ��캯����
			2. this�ؼ����ǵ��ñ���Ĺ��캯����

*/
class Demo8 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        student stu=new student();
		//stu.name="zhangsan";
		stu.address="shanghai";
		stu.age=25;
        stu.Study();
        stu.Working();
	}
}


class person
{
  String name;
  String address;  //priavte �ĳ�Ա���� ���ܱ��̳С�
  public void  Working(){
    System.out.println("���ڹ���"+name);
  
  }
   person(){
   
   }
  person(String name){
   this.name=name;
  }
}

//����̳��븸��  �������Զ��ܱ��̳С�
class student extends person
{
   int age;
   public void Study(){
    System.out.println("ѧ����ѧϰ,ѧ��������"+name+"ѧ��������"+age+"��ַ"+address);
   
   }

  

   student(){
	   super();
        //super("jerry");  //�ڹ��캯���� ���ø��๹�캯�� Ϊ�����Ա������ֵ��
   
   }

}
