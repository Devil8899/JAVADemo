package cn.thread;
///join() 方法
//加入。 一个线程如果执行join语句，那么就有新的线程加入，执行该语句的线程必须要让步给新加入的线程先完成任务，然后才能继续执行。
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mather m=new mather();
		son s=new son();
		m.start();
		s.start();
	}

}

//父类
class mather extends Thread{

	son s=new son();
	
	@Override
	public void run() {
		System.out.println("母亲准备开车");
		System.out.println("发现没有油");
		System.out.println("儿子去买油");
		try {
			s.join();  // 一个线程如果执行join语句，那么就有新的线程加入，执行该语句的线程必须要让步给新加入的线程先完成任务，然后才能继续执行
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("继续开车");
	}
	
	
	
}

//子类
class son extends Thread{

	@Override
	public void run() {
	System.out.println("儿子买油回来了");
	}
	
	
}