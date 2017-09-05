package cn.thread;

/*
线程常用的方法：
 	 Thread(String name)     初始化线程的名字  正常实例化会有一个默认名字 但类有一个参数构造方法 设置线程名字
	 setName(String name)    设置线程对象名
	 getName()               返回线程的名字
	 
	  
	 sleep()                      线程睡眠指定的毫秒数。 静态的方法， 那个线程执行了sleep方法代码那么就是那个线程睡眠。
	 
	 currentThread()              返回当前的线程对象，该方法是一个静态的方法， 注意： 那个线程执行了currentThread()代码就返回那个线程 的对象。
	 
	 getPriority()                返回当前线程对象的优先级   默认线程的优先级是5
	 setPriority(int newPriority) 设置线程的优先级    虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现（最大的优先级是10 ，最小的1 ， 默认是5）。

 * */
public class Demo3 extends Thread {
	// 调用父类有参构造函数
	public Demo3(String name) {
		super(name);

	}

	// 无参构造函数
	public Demo3() {
	}

	//实现线程   重写run方法
	@Override
	public void run() {
		System.out.println("this:" + this);
		System.out.println("当前线程对象：" + Thread.currentThread());
		/* 验证是不是一个对象 */
		if (this == Thread.currentThread()) {
			System.out.println("是一个对象");
		} else {
			System.out.println("不是一个对象");
		}
        System.out.println("线程名"+this.getName());
        System.out.println("_____________________________");
		for (int i = 0; i < 10; i++) {
			System.out.println("线程名: " + this.getName() + i);

			/*
			 * try { // this.sleep(1000); //此方法可能会有异常抛出 //为什么在这里不能抛出异常，只能捕获？？
			 * Thread类的run方法没有抛出异常类型，所以子类不能抛出异常类型。 } catch (InterruptedException
			 * e) { e.printStackTrace(); }
			 */
		}
	}

	// main主线程
	public static void main(String[] args) throws InterruptedException {
		// Demo3 D=new Demo3("设置一个新的名字Jerry"); //设置线程名
		// D.setName("Tom"); //设置线程名
		// // D.sleep(1000); 这里是Main线程执行了sleep方法 不管调用是谁
		// System.out.println(D.getName()); //获取线程名
		// D.start(); //开启线程

		
		// Thread.currentThread() 返回当前的线程对象 [当前运行的线程,运行优先级,主线程]
		String Name = Thread.currentThread().getName(); // 获取线程名
		System.out.println(Name);

		Demo3 De = new Demo3();
		De.start();
		//获取线程优先级  getPriority()     
		System.out.println("__________________________________________");
		System.out.println("自定义线程的优先级"+De.getPriority());
		System.out.print("主线程的优先级"+Thread.currentThread().getPriority()+"\r\n");
		//设置线程优先级 最大10
		De.setPriority(10);
		
    
	}

}
