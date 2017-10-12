class Demo9 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			Outer.method().show();
	/*
		Outer.method():��˼�ǣ�Outer����һ������Ϊmethod�ķ�����������������Ǿ�̬�ġ�
		Outer.method().show():��Outer����þ�̬��method�������������Ľ���ֵ�����show��������ζ�ţ�method()����������һ���Ƕ��󣬶������������Inter���͵ġ�
	*/

	}
}

class InnerClassDemo6 {
	static class Inner{
		void show(){}
	}
	public void method(){
		this.new Inner().show();//����
	}
}


class Outer{
	int num = 4;	
	class  Inner {
		void show(){
			System.out.println("inner show run "+num);			
		}
	}
	public void method(){
		Inner in = new Inner();//�����ڲ���Ķ���
		in.show();//�����ڲ���ķ����� 
	}
}
