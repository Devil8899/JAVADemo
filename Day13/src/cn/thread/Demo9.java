package cn.thread;
/*
�̵߳�ֹͣ��
	1. ֹͣһ���߳� ����һ�㶼��ͨ��һ������ȥ���Ƶġ� ����ͨ��һ�����������п��Ƶ�
	2. �����Ҫֹͣһ�����ڵȴ�״̬�µ��̣߳���ô������Ҫͨ���������notify��������interrupt()��ʹ�á�
	//interrupt ����������Ǹı��߳�״̬ ���������ǵȴ� ���Ժ�ֱ�Ӽ���
*/
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowLog show=new ShowLog();
		show.setName("Tom");
		show.start();  //�����߳�
		for (int i = 0; i < 20; i++) {
			System.out.println("��ǰ�߳�"+Thread.currentThread().getName()+ i);
			if(i==10){
				
			   show.State=false;
				//show.stop();  //�ر��߳�  ���Ƿ����ǹ�ʱ��
			}
		}
	}

}

//�Զ����߳���
class ShowLog extends Thread{
    
	
	//��дrun����
	int i=0;
	//ͨ������ �����߳�
	boolean State=true;
	@Override
	public void run() {
		//���ֹͣһ���߳��أ�
		while(State){
			 System.out.println("��ǰ�߳�"+Thread.currentThread().getName()+i);
		     i++;	
		}
	}

	
	
	
	
}