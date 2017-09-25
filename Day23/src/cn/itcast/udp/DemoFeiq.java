package cn.itcast.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*

 ÿ������������Լ���������ض���ʽ����,������յ������ݲ�����ָ���ĸ�ʽ����ô�ͻᱻ�����������ݶ�����(����..)

 ��Q���յ����ݸ�ʽ��
 version:time :sender : ip: flag:content ;
 �汾��          ʱ��                   ������   :IP���л��               ���͵ı�ʶ��(32): ����������;
 Demo
1.0:1505960424629:����:192.168.10.1:32:����һ������2017��09��21��(*_*)


 ��udpЭ���У���һ��IP��ַ����Ϊ�㲥��ַ���㲥��ַ����������Ϊ255��ַ��

 ���㲥IP��ַ������Ϣ��ʱ����ͬһ������εĻ��������Խ��� ����Ϣ��
 �ҵ�������192.168.3 ����
 �㲥��ַ�� 192.168.3.255

 */
//ʹ��udpЭ�����Q������Ϣ��  ֻ��ʹ��2425�˿�

public class DemoFeiq {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat sm=new SimpleDateFormat("yyyy��MM��dd��");
		// ����udp�ķ���
		DatagramSocket socket=new DatagramSocket();
		// ׼�����ݣ������ݷ�װ�����ݰ���
		String buf=getData("����һ������"+sm.format(new Date())+"(*_*)");
		// ��������
		DatagramPacket packet=new DatagramPacket(buf.getBytes(), buf.getBytes().length,InetAddress.getByName("192.168.3.255"),2425);
		socket.send(packet);
		// �ر���Դ
		socket.close();
	}
	public static String getData(String context){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis() + ":");
		sb.append("����:");
		sb.append("192.168.10.1:");
		sb.append("32:");
		sb.append(context);

		return sb.toString();
	}
	

}
