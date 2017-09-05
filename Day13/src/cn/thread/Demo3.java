package cn.thread;

/*
�̳߳��õķ�����
 	 Thread(String name)     ��ʼ���̵߳�����  ����ʵ��������һ��Ĭ������ ������һ���������췽�� �����߳�����
	 setName(String name)    �����̶߳�����
	 getName()               �����̵߳�����
	 
	  
	 sleep()                      �߳�˯��ָ���ĺ������� ��̬�ķ����� �Ǹ��߳�ִ����sleep����������ô�����Ǹ��߳�˯�ߡ�
	 
	 currentThread()              ���ص�ǰ���̶߳��󣬸÷�����һ����̬�ķ����� ע�⣺ �Ǹ��߳�ִ����currentThread()����ͷ����Ǹ��߳� �Ķ���
	 
	 getPriority()                ���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 setPriority(int newPriority) �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����

 * */
public class Demo3 extends Thread {
	// ���ø����вι��캯��
	public Demo3(String name) {
		super(name);

	}

	// �޲ι��캯��
	public Demo3() {
	}

	//ʵ���߳�   ��дrun����
	@Override
	public void run() {
		System.out.println("this:" + this);
		System.out.println("��ǰ�̶߳���" + Thread.currentThread());
		/* ��֤�ǲ���һ������ */
		if (this == Thread.currentThread()) {
			System.out.println("��һ������");
		} else {
			System.out.println("����һ������");
		}
        System.out.println("�߳���"+this.getName());
        System.out.println("_____________________________");
		for (int i = 0; i < 10; i++) {
			System.out.println("�߳���: " + this.getName() + i);

			/*
			 * try { // this.sleep(1000); //�˷������ܻ����쳣�׳� //Ϊʲô�����ﲻ���׳��쳣��ֻ�ܲ��񣿣�
			 * Thread���run����û���׳��쳣���ͣ��������಻���׳��쳣���͡� } catch (InterruptedException
			 * e) { e.printStackTrace(); }
			 */
		}
	}

	// main���߳�
	public static void main(String[] args) throws InterruptedException {
		// Demo3 D=new Demo3("����һ���µ�����Jerry"); //�����߳���
		// D.setName("Tom"); //�����߳���
		// // D.sleep(1000); ������Main�߳�ִ����sleep���� ���ܵ�����˭
		// System.out.println(D.getName()); //��ȡ�߳���
		// D.start(); //�����߳�

		
		// Thread.currentThread() ���ص�ǰ���̶߳��� [��ǰ���е��߳�,�������ȼ�,���߳�]
		String Name = Thread.currentThread().getName(); // ��ȡ�߳���
		System.out.println(Name);

		Demo3 De = new Demo3();
		De.start();
		//��ȡ�߳����ȼ�  getPriority()     
		System.out.println("__________________________________________");
		System.out.println("�Զ����̵߳����ȼ�"+De.getPriority());
		System.out.print("���̵߳����ȼ�"+Thread.currentThread().getPriority()+"\r\n");
		//�����߳����ȼ� ���10
		De.setPriority(10);
		
    
	}

}
