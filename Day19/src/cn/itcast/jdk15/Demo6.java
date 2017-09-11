package cn.itcast.jdk15;
/*
jdk1.5新特性之-----枚举

问题：某些方法所接收的数据必须是在固定范围之内的， 

解决方案1： 这时候我们的解决方案就是自定义一个类,然后是私有化构造函数，在自定义类中创建本类的对象对外使用。

jdk1.5对以上问题提出了新的解决方案： 就是使用枚举类解决。

一些方法在运行时，它需要的数据不能是任意的，而必须是一定范围内的值，Java5以后可以直接使用枚举予以解决。
	比如： 方向 , 性别 、 季节 、 星期......


*/

/*
//自定义一个性别类
class Gender{
	
	String value;
	
	public static final Gender man = new Gender("男");
	
	public static final Gender woman = new Gender("女");
	

	private Gender(String value) {
		this.value = value;
	}
}
*/
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonL per = new PersonL("tom", Gender.man);
//		per.setName("jerry");
//		per.setGender("男");
		System.out.println(per.getGender().sex);  //这种方式
	}

}

class PersonL {
	private String Name;
	private Gender GenderN;
    //封装字段
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Gender getGender() {
		return GenderN;
	}

	public void setGender(Gender gender) {
		GenderN = gender;
	}
	// 构造函数
	public PersonL(String name, Gender gender) {
		super();
	this.Name = name;
	this.GenderN = gender;
	}
}

//构造函数私有化
class Gender{
	String sex;
	public static Gender man=new Gender("男");
	public static Gender woman=new Gender("女"); 
	private Gender(String value) {
		this.sex = value;
	}
}
