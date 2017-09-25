package cn.itcast.udp;

import java.io.IOException;
import java.net.*;
//群聊接收端
public class GroupChatReceive  extends Thread{

	boolean flag = true;
	@Override
	public void run() {
		// 建立udp的服务,要监听一个端口
		try {
			DatagramSocket socket = new DatagramSocket(8999);
			// 准备空的数据包存储数据
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
			while (flag) {

				socket.receive(packet);
				// packet.getAddress() 获取对方数据 包的IP地址对象。
				System.out.println(packet.getAddress().getHostName()+"说: "+new String(buf, 0, packet.getLength()));

			}
			// 关闭资源
			socket.close();

		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

	}

}
