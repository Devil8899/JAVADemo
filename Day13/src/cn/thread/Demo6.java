package cn.thread;


/*  自定义线程实现方式二
  方式二：
	1. 自定义一个类实现Runnable接口。
	2. 实现Runnable接口 的run方法，把自定义线程的任务定义在run方法上。
	3. 创建Runnable实现类对象。
	4. 创建Thread类 的对象，并且把Runnable实现类的对象作为实参传递。
	5. 调用Thread对象 的start方法开启一个线程。


问题1： 请问Runnable实现类的对象是线程对象吗？
	Runnable实现类的对象并 不是一个线程对象，只不过是实现了Runnable接口 的对象而已。
	只有是Thread或者是Thread的子类才是线程 对象。

问题2： 为什么要把Runnable实现类的对象作为实参传递给Thread对象呢？作用是什么？
	作用就是把Runnable实现类的对象的run方法作为了线程的任务代码去执行了。

推荐使用： 第二种。 实现Runable接口的。 
原因： 因为java单继承 ,多实现的。

 * */
public class Demo6 {

	public static void main(String[] args) {
	    //实现Runnable接口 的run方法，把自定义线程的任务定义在run方法上。
		RunC c=new RunC();
		//创建Thread类 的对象，并且把Runnable实现类的对象作为实参传递。
        Thread thread=new Thread(c,"jerry");
        //调用Thread对象 的start方法开启一个线程。
        thread.start();
	}
}


//实现接口 Runnable
class RunC implements Runnable{

	
	//重写run 方法
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30; i++) {
			System.out.println(Thread.currentThread().getName()+"打印消息"+i);
		}
	}
	/*
	  Thread类 的run方法
	  
	 *  @Override
	    public void run() {
	        if (target != null) {
	            target.run();  //就相当于Runnable实现类的对象的run方法作为了Thread对象的任务代码了。
	        }
	    }
	*/
	
}


