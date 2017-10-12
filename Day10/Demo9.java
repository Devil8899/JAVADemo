class Demo9 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
			Outer.method().show();
	/*
		Outer.method():意思是：Outer中有一个名称为method的方法，而且这个方法是静态的。
		Outer.method().show():当Outer类调用静态的method方法运算结束后的结果又调用了show方法，意味着：method()方法运算完一个是对象，而且这个对象是Inter类型的。
	*/

	}
}

class InnerClassDemo6 {
	static class Inner{
		void show(){}
	}
	public void method(){
		this.new Inner().show();//可以
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
		Inner in = new Inner();//创建内部类的对象。
		in.show();//调用内部类的方法。 
	}
}
