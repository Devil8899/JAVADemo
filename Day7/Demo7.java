/*
����ģʽ

���һ�������ڴ���ֻ����һ��������Ҫ��֤�����Ψһ��

�������ģʽ�Ĳ��裺	


�����������ģʽ
	1. ˽�л����캯����
	2. ����������������ͱ���������ʹ�øñ���ָ�������
	3. �ṩһ��������̬�ķ�����ȡ����Ķ���

�����������ģʽ��
	1. ˽�л����캯����
	2. ����������������ͱ��������ǲ�Ҫ��������
	3. �ṩ������̬ �ķ�����ȡ���� �Ķ��󣬻�ȡ֮ǰ���ж��Ƿ��Ѿ������˱��� ����
	������Ѿ������ˣ���ôֱ�ӷ��ض��󼴿ɣ������û�д�������ô�ȴ�������Ķ���
	Ȼ���ٷ��ء�


�Ƽ�ʹ�ã� �����������ģʽ��  ��Ϊ�����������ģʽ������̰߳�ȫ���⣬Ŀǰ�����ܱ�֤һ�����ڴ���ֻ��һ������



*/


class Demo7 
{
	public static void main(String[] args) 
	{
		car c=car.getStance();
		c.name="jerry";
        System.out.println(c.name);  //jerry
        car c1=car.getStance();
		System.out.println(c1.name);//jerry  ��Ϊ�����ڴ��еĵ�ַָ��Ķ���һ��

	}
}


//����
class car
{
    /*1.˽�� ���캯��  �����Ͳ���ʵ��������*/
	private car(){
	
	}
	String name;

   /*�����͵ľ�̬��Ա*/
   private static car Ca=new car();
   
   //�ṩһ��������̬�ķ�����ȡ����Ķ���
   public static car getStance(){
     
   return Ca;
   }
}


class Single2 {
	private static Single2 s = null; // ����

	private Single2() {

	}

	public static Single2 getInstance() {
		if (s == null) {
			s = new Single2();
		}
		return s;
	}
}

