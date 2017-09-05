package cn.thread;
/*
线程的停止：
	1. 停止一个线程 我们一般都会通过一个变量去控制的。 这里通过一个变量来进行控制的
	2. 如果需要停止一个处于等待状态下的线程，那么我们需要通过变量配合notify方法或者interrupt()来使用。
	//interrupt 这个方法就是改变线程状态 比如现在是等待 可以很直接激活
*/
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowLog show=new ShowLog();
		show.setName("Tom");
		show.start();  //开启线程
		for (int i = 0; i < 20; i++) {
			System.out.println("当前线程"+Thread.currentThread().getName()+ i);
			if(i==10){
				
			   show.State=false;
				//show.stop();  //关闭线程  但是方法是过时的
			}
		}
	}

}

//自定义线程类
class ShowLog extends Thread{
    
	
	//重写run方法
	int i=0;
	//通过变量 结束线程
	boolean State=true;
	@Override
	public void run() {
		//如何停止一个线程呢？
		while(State){
			 System.out.println("当前线程"+Thread.currentThread().getName()+i);
		     i++;	
		}
	}

	
	
	
	
}