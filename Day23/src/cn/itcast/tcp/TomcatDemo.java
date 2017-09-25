package cn.itcast.tcp;

import java.net.*;
import java.io.*;

//ģ��Tomcat������
public class TomcatDemo extends Thread {

	Socket socket;

	public TomcatDemo(Socket socket){
		this.socket = socket;
	}


	public void run() {
		try {
			//��ȡsocket�����������
			OutputStream outputStream = socket.getOutputStream();
			//������д���������
			outputStream.write("<html><head><title>aaa</title></head><body>��ð������</body></html>".getBytes());
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//ʹ�ö��߳�    ������ÿ���û�����һ���߳�����
	public static void main(String[] args) throws IOException {
		//		Onpr();
		//����tcp�ķ����  ����9090�˿�
		ServerSocket serverSocket = new ServerSocket(9090);
		//���ϵĽ��ܿͻ��˵�����
		while(true){
			Socket socket = serverSocket.accept();
			new TomcatDemo(socket).start();   //�����߳�
		}
	}


	public static void Onpr(){
		try {
			ServerSocket sro=new ServerSocket(9010);
			Socket socket=sro.accept();
			//��ȡsocket�����������
			OutputStream outputStream = socket.getOutputStream();
			outputStream.write("<html><head><title>aaa</title></head><body>hi�����</body></html>".getBytes());
			socket.close();		
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
