package cn.itcast.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//群聊发送端
public class GroupChatSend extends Thread {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	//实现自定义线程  必须重写 run  方法
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		// super.run();
		
		try {
			// 建立udp的服务
			DatagramSocket socket = new DatagramSocket();
			//创建一个控制台输入流
            InputStream stream=System.in;
			//输入字节流 转输入字符流   因为字符流可以一行行读取
            BufferedReader read=new BufferedReader(new InputStreamReader(stream));
            String line=null;
            DatagramPacket packet=null;
            while((line=read.readLine())!=null){
            	//把数据封装 到数据数据包中，然后发送数据。
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("my-pc"),8999);
				//把数据发送出去
				socket.send(packet);	
            }
            //关闭资源
            socket.close();

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
