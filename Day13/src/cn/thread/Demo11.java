package cn.thread;
///join() ����
//���롣 һ���߳����ִ��join��䣬��ô�����µ��̼߳��룬ִ�и������̱߳���Ҫ�ò����¼�����߳����������Ȼ����ܼ���ִ�С�
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mather m=new mather();
		son s=new son();
		m.start();
		s.start();
	}

}

//����
class mather extends Thread{

	son s=new son();
	
	@Override
	public void run() {
		System.out.println("ĸ��׼������");
		System.out.println("����û����");
		System.out.println("����ȥ����");
		try {
			s.join();  // һ���߳����ִ��join��䣬��ô�����µ��̼߳��룬ִ�и������̱߳���Ҫ�ò����¼�����߳����������Ȼ����ܼ���ִ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��������");
	}
	
	
	
}

//����
class son extends Thread{

	@Override
	public void run() {
	System.out.println("�������ͻ�����");
	}
	
	
}