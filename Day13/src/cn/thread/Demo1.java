package cn.thread;
/*
需求： 模拟QQ视频与聊天同时在执行。
*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TalkThread ta=new TalkThread();
		 VideoThread vt=new VideoThread();
       
			ta.start();  //开始两个线程  同时调用会看到切换效果
			vt.start();  
		
	}

}

class TalkThread extends Thread{
	
	public void run(){
		super.run();   //调用父类的 同名方法
		 for (int i = 0; i < 50; i++) {
			 System.out.println("这是在聊天");
		}
	}
}

class VideoThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	 for (int i = 0; i < 50; i++) {
		 System.out.println("这是在视频");
	}
		
	}
	
	
}
