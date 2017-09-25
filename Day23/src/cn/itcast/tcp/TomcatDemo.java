package cn.itcast.tcp;

import java.net.*;
import java.io.*;

//模拟Tomcat服务器
public class TomcatDemo extends Thread {

	Socket socket;

	public TomcatDemo(Socket socket){
		this.socket = socket;
	}


	public void run() {
		try {
			//获取socket的输出流对象
			OutputStream outputStream = socket.getOutputStream();
			//把数据写到浏览器上
			outputStream.write("<html><head><title>aaa</title></head><body>你好啊浏览器</body></html>".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//使用多线程    可以让每个用户开启一个线程连接
	public static void main(String[] args) throws IOException {
		//		Onpr();
		//建立tcp的服务端  开启9090端口
		ServerSocket serverSocket = new ServerSocket(9090);
		//不断的接受客户端的连接
		while(true){
			Socket socket = serverSocket.accept();
			new TomcatDemo(socket).start();   //开启线程
		}
	}


	public static void Onpr(){
		try {
			ServerSocket sro=new ServerSocket(9010);
			Socket socket=sro.accept();
			//获取socket的输出流对象
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write("<html><head><title>aaa</title></head><body>hi浏览器</body></html>".getBytes());
			socket.close();		
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
