package cn.thread;

import java.util.Iterator;

/*
 * �ػ��̣߳�
 * 
 *  �ػ��̣߳���̨�̣߳�:��һ�����������ֻʣ�� ���ػ��̣߳���ô�ػ��߳�Ҳ��������
 
            ���� ģ��QQ���ظ��°���
 
           һ���߳�Ĭ�϶������ػ��̡߳�
            //setDaemon()         �����߳��Ƿ�Ϊ�ػ��̣߳�trueΪ�ػ��̣߳� falseΪ���ػ��̡߳�
		    //isDaemon());        �ж��߳��Ƿ�Ϊ�ػ��̡߳�
            





 * 
 * 
 * */
public class Demo10  extends Thread {
    
	
	public static void main(String[] args) {
	 
		
		Fa f=new Fa();
		f.setDaemon(true);   //����Ϊ�ػ��߳�  ���� ���߳̽���  �ػ��߳�Ҳ������ ���Զ���������
		f.start();
	
		for (int i = 0; i < 10; i++) {
			System.out.println("���߳�"+i);
		}
	}

}


//�Լ�д���߳���
class Fa extends Thread{

	//��дrun����
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("ϵͳ����"+i+"%");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   
		}	
		 //System.out.println("�Ƿ�Ϊ�ػ��߳�"+this.isDaemon());	//�����������̵߳Ľ�����ֹͣ����	
	       
	}
	
	
	
	
	
}

