package cn.thread;

import java.util.Iterator;

/*
 * 守护线程：
 * 
 *  守护线程（后台线程）:在一个进程中如果只剩下 了守护线程，那么守护线程也会死亡。
 
            需求： 模拟QQ下载更新包。
 
           一个线程默认都不是守护线程。
            //setDaemon()         设置线程是否为守护线程，true为守护线程， false为非守护线程。
		    //isDaemon());        判断线程是否为守护线程。
            





 * 
 * 
 * */
public class Demo10  extends Thread {
    
	
	public static void main(String[] args) {
	 
		
		Fa f=new Fa();
		f.setDaemon(true);   //设置为守护线程  这样 主线程结束  守护线程也结束了 讲自动结束运行
		f.start();
	
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程"+i);
		}
	}

}


//自己写的线程类
class Fa extends Thread{

	//重写run方法
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("系统更新"+i+"%");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
		}	
		 //System.out.println("是否为守护线程"+this.isDaemon());	//不会随着主线程的结束而停止运行	
	       
	}
	
	
	
	
	
}

