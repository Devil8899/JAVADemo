package cn.itcast.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//Ⱥ�ķ��Ͷ�
public class GroupChatSend extends Thread {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

	}

	//ʵ���Զ����߳�  ������д run  ����
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		// super.run();
		
		try {
			// ����udp�ķ���
			DatagramSocket socket = new DatagramSocket();
			//����һ������̨������
            InputStream stream=System.in;
			//�����ֽ��� ת�����ַ���   ��Ϊ�ַ�������һ���ж�ȡ
            BufferedReader read=new BufferedReader(new InputStreamReader(stream));
            String line=null;
            DatagramPacket packet=null;
            while((line=read.readLine())!=null){
            	//�����ݷ�װ ���������ݰ��У�Ȼ�������ݡ�
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("my-pc"),8999);
				//�����ݷ��ͳ�ȥ
				socket.send(packet);	
            }
            //�ر���Դ
            socket.close();

		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

	}

}
