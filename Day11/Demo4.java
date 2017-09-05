package ddl;
import  dd.Demo2;     //导入包
import Dt.*;
class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Dt.Demo3 de=new Dt.Demo3();   //通过完整类名调用
		de.print(); 

        test.Demo1 D=new test.Demo1();  //通过完整类名调用
		String[] arr={"1","2"};
		D.main(arr);
        System.out.println("_____________________________________");
		//导入包后   调用时不需要使用完整类名
		Demo2 D2=new Demo2();
		D2.PrintNew();

		System.out.println("______________________________________*导入包");
		Dtli dt3=new Dtli();
		dt3.print();
	}
}
