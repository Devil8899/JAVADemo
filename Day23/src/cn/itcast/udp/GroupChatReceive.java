package cn.itcast.udp;

import java.io.IOException;
import java.net.*;
//Ⱥ�Ľ��ն�
public class GroupChatReceive  extends Thread{

	boolean flag = true;
	@Override
	public void run() {
		// ����udp�ķ���,Ҫ����һ���˿�
		try {
			DatagramSocket socket = new DatagramSocket(8999);
			// ׼���յ����ݰ��洢����
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
			while (flag) {

				socket.receive(packet);
				// packet.getAddress() ��ȡ�Է����� ����IP��ַ����
				System.out.println(packet.getAddress().getHostName()+"˵: "+new String(buf, 0, packet.getLength()));

			}
			// �ر���Դ
			socket.close();

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
