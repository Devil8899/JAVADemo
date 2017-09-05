package cn.thread;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建了一个Runnable实现类的对象
		SaleT saleTicket = new SaleT();
				//创建三个线程对象模拟三个窗口
				Thread thread1 = new Thread(saleTicket,"窗口1");
				Thread thread2 = new Thread(saleTicket,"窗口2");
				Thread thread3 = new Thread(saleTicket,"窗口3");
				//开启线程售票
				thread1.start();
				thread2.start();
				thread3.start();
	}

}
//实现接口   重写run方法
class SaleT implements Runnable{
	
	int  num = 50; // 票数
	
	@Override
	public void run() {
		while(true){
			synchronized ("锁") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"售出了第"+ num+"号票");
					num--;
				}else{
					System.out.println("售罄了..");
					break;
				}	
			}
		}		
	}
}
