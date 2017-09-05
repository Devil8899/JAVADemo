/*
  接口实现多态
多态： 父类的引用类型变量指向了子类的对象或者是接口类型的引用类型变量指向了接口实现类 的对象。

实现关系下的多态：
	
	接口  变量  = new  接口实现类的对象。

*/

interface I_Fable  //接口的方法全部都是非静态的方法。 所以实现接口的类调用 会直接调用子类的方法
{
  public    void addUser(); 
  public	void delUser();

}
//
class User implements I_Fable
{
  public   void addUser(){
	  System.out.println("用户添加成功");
	 }
 public	 void delUser(){
	  System.out.println("用户删除成功");
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
