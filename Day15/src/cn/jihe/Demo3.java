package cn.jihe;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Work w=working();	
		w.atwork();
		
	}
	
	//定义一个方法 实现多态  返回实际是一个接口的实现类
	//因为实现关系 所以返回类型可以是接口的实现类对象  不冲突
	public static Work working(){
		return new driver();	
	}
	

}
//定义接口
interface Work{
	 public void atwork();
	
}
class driver implements Work{

	//实现接口的方法
	@Override
	public void atwork() {
		// TODO Auto-generated method stub
		System.out.println("司机在工作");
	}
}
