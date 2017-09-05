package cn.System;

import java.io.IOException;

/*
 不能实例化
RunTime   该类类主要代表了应用程序运行的环境。
	
	getRuntime()          返回当前应用程序的运行环境对象。
	exec(String command)  根据指定的路径执行对应的可执行文件。
	freeMemory()          返回 Java 虚拟机中的空闲内存量。。 以字节为单位
	maxMemory()           返回 Java 虚拟机试图使用的最大内存量。
	totalMemory()         返回 Java 虚拟机中的内存总量
	
	

*/
public class Demo2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//因为此类不能实例化 单例模式 通过静态方法获取实例
		Runtime run =Runtime.getRuntime();
		//run.exec("C:\\Windows\\notepad.exe");   //开启一个进程
		Process pro=run.exec("C:\\Windows\\notepad.exe");  //此方法返回一个进程
		Thread.sleep(5000);   //当前程序停止5秒
		pro.destroy();        //destroy杀死子进程
		System.out.println(" Java虚拟机中的空闲内存量。"+run.freeMemory());
		System.out.println("Java 虚拟机试图使用的最大内存量:"+ run.maxMemory());
		System.out.println("返回 Java 虚拟机中的内存总量:"+ run.totalMemory());
	}
}
