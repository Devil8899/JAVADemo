package cn.thread;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������һ��Runnableʵ����Ķ���
		SaleT saleTicket = new SaleT();
				//���������̶߳���ģ����������
				Thread thread1 = new Thread(saleTicket,"����1");
				Thread thread2 = new Thread(saleTicket,"����2");
				Thread thread3 = new Thread(saleTicket,"����3");
				//�����߳���Ʊ
				thread1.start();
				thread2.start();
				thread3.start();
	}

}
//ʵ�ֽӿ�   ��дrun����
class SaleT implements Runnable{
	
	int  num = 50; // Ʊ��
	
	@Override
	public void run() {
		while(true){
			synchronized ("��") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"�۳��˵�"+ num+"��Ʊ");
					num--;
				}else{
					System.out.println("������..");
					break;
				}	
			}
		}		
	}
}
