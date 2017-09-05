package cn.thread;


/*  �Զ����߳�ʵ�ַ�ʽ��
  ��ʽ����
	1. �Զ���һ����ʵ��Runnable�ӿڡ�
	2. ʵ��Runnable�ӿ� ��run���������Զ����̵߳���������run�����ϡ�
	3. ����Runnableʵ�������
	4. ����Thread�� �Ķ��󣬲��Ұ�Runnableʵ����Ķ�����Ϊʵ�δ��ݡ�
	5. ����Thread���� ��start��������һ���̡߳�


����1�� ����Runnableʵ����Ķ������̶߳�����
	Runnableʵ����Ķ��� ����һ���̶߳���ֻ������ʵ����Runnable�ӿ� �Ķ�����ѡ�
	ֻ����Thread������Thread����������߳� ����

����2�� ΪʲôҪ��Runnableʵ����Ķ�����Ϊʵ�δ��ݸ�Thread�����أ�������ʲô��
	���þ��ǰ�Runnableʵ����Ķ����run������Ϊ���̵߳��������ȥִ���ˡ�

�Ƽ�ʹ�ã� �ڶ��֡� ʵ��Runable�ӿڵġ� 
ԭ�� ��Ϊjava���̳� ,��ʵ�ֵġ�

 * */
public class Demo6 {

	public static void main(String[] args) {
	    //ʵ��Runnable�ӿ� ��run���������Զ����̵߳���������run�����ϡ�
		RunC c=new RunC();
		//����Thread�� �Ķ��󣬲��Ұ�Runnableʵ����Ķ�����Ϊʵ�δ��ݡ�
        Thread thread=new Thread(c,"jerry");
        //����Thread���� ��start��������һ���̡߳�
        thread.start();
	}
}


//ʵ�ֽӿ� Runnable
class RunC implements Runnable{

	
	//��дrun ����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName()+"��ӡ��Ϣ"+i);
		}
	}
	/*
	  Thread�� ��run����
	  
	 *  @Override
	    public void run() {
	        if (target != null) {
	            target.run();  //���൱��Runnableʵ����Ķ����run������Ϊ��Thread�������������ˡ�
	        }
	    }
	*/
	
}


