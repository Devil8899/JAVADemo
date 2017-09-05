//类
class Demo1
{
/**
  局部变量  定义类内部    存在堆   初始化有默认值
  成员变量  定义方法内部  存在栈   初始化没有默认值 需要手动赋值  必须给初始化值，没有初始值，不能使用

本质区别
存储位置  成员变量属于对象，它存储在堆内，堆内的实体，当没有引用指向其时，才垃圾回收清理 局部变量存在栈内存中，当不在使用时，马上就会被释放。

*/
	
	public static void main(String[] args) 
	{
	
        /*实例化一个具体的类*/
        driver Dr=new driver();
        Dr.name="jerry";   /*司机的名称*/
        Dr.age=20;         /*司机的年龄*/
        Dr.print();
        driver Dr2=new driver();
        Dr2.name="jack";
        System.out.println();   /*换行*/
        Dr2.print();   /*age 默认赋值为0*/
        Dr2=Dr;
        Dr2.print();  /*调用是Dr的print方法  因为内存中的地址发生了变化  Dr2的地址指向了Dr*/
	}

  

}

/*定义司机类*/
class driver
{
      /*定义成员变量 字段 存储属性*/
      String name;
	  int  age;
      /*定义函数 执行行为操作*/
      public void print(){
           System.out.print("用户名："+name+",年龄是："+age);
   
   }
}