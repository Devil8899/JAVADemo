package cn.jihe;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Work w=working();	
		w.atwork();
		
	}
	
	//����һ������ ʵ�ֶ�̬  ����ʵ����һ���ӿڵ�ʵ����
	//��Ϊʵ�ֹ�ϵ ���Է������Ϳ����ǽӿڵ�ʵ�������  ����ͻ
	public static Work working(){
		return new driver();	
	}
	

}
//����ӿ�
interface Work{
	 public void atwork();
	
}
class driver implements Work{

	//ʵ�ֽӿڵķ���
	@Override
	public void atwork() {
		// TODO Auto-generated method stub
		System.out.println("˾���ڹ���");
	}
}
