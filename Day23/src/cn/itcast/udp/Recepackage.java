package cn.itcast.udp;

import java.io.IOException;
import java.net.*;

public class Recepackage {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO �Զ����ɵķ������
		//����udp�ķ���
				DatagramSocket socket = new DatagramSocket(9090);
				
				//�����յ����ݰ��洢����
				byte[] buf = new byte[1024];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				
				//���Ͻ������ݰ�
				while(true){
					socket.receive(packet);
					System.out.println(new String(buf,0,packet.getLength()));
					Thread.sleep(10);
				}
	}

}
