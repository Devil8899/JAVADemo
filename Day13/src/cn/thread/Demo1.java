package cn.thread;
/*
���� ģ��QQ��Ƶ������ͬʱ��ִ�С�
*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TalkThread ta=new TalkThread();
		 VideoThread vt=new VideoThread();
       
			ta.start();  //��ʼ�����߳�  ͬʱ���ûῴ���л�Ч��
			vt.start();  
		
	}

}

class TalkThread extends Thread{
	
	public void run(){
		super.run();   //���ø���� ͬ������
		 for (int i = 0; i < 50; i++) {
			 System.out.println("����������");
		}
	}
}

class VideoThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	 for (int i = 0; i < 50; i++) {
		 System.out.println("��������Ƶ");
	}
		
	}
	
	
}
