/*匿名对象
  匿名对象：没有名字的实体，也就是该实体没有对应的变量名引用。

匿名对象要注意的事项：
	1. 我们一般不会给匿名对象赋予属性值，因为永远无法获取到。
	2. 两个匿名对象永远都不可能是同一个对象。
	3. 主要是应用方法的调用
*/
class  Demo2
{
	public static void main(String[] args) 
	{

         new doctor().name="zhangsan";           //为匿名对象属性赋值  这种方式不可能用到
		 System.out.println(new doctor().name);  //null
		 System.out.print(new doctor()==new doctor());  //false  因为new了2个对象  指向不同的内存地址 比较的是两个对象的地址
		 new doctor().Iswork();
		 /*匿名对象 可以将匿名对象作为实际参数，传递进去*/
        PrintMsg(new doctor().getName());


	}

	public static void PrintMsg(String name){
	  System.out.print(name+"是一个儿科医生");
	
	
	}
}

class doctor
{
     String name;
	 int   age;
     public void Iswork(){
	   System.out.print("\r\n 医生工作中 \r\n");
	 }
      
     public String getName(){
	   return "jerry";
	 }

}
