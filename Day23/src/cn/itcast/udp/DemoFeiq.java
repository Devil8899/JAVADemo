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

 每个网络程序都有自己所处理的特定格式数据,如果接收到的数据不符合指定的格式，那么就会被当成垃圾数据丢弃。(加密..)

 飞Q接收的数据格式：
 version:time :sender : ip: flag:content ;
 版本号          时间                   发送人   :IP随便谢：               发送的标识符(32): 真正的内容;
 Demo
1.0:1505960424629:测试:192.168.10.1:32:发送一个内容2017年09月21日(*_*)


 在udp协议中，有一个IP地址称作为广播地址，广播地址就是主机号为255地址。

 给广播IP地址发送消息的时候，在同一个网络段的机器都可以接收 到信息。
 我的网段是192.168.3 网段
 广播地址是 192.168.3.255

 */
//使用udp协议给飞Q发送消息。  只能使用2425端口

public class DemoFeiq {

	public static void main(String[] args) throws IOException {
		SimpleDateFormat sm=new SimpleDateFormat("yyyy年MM月dd日");
		// 建立udp的服务
		DatagramSocket socket=new DatagramSocket();
		// 准备数据，把数据封装到数据包中
		String buf=getData("发送一个内容"+sm.format(new Date())+"(*_*)");
		// 发送数据
		DatagramPacket packet=new DatagramPacket(buf.getBytes(), buf.getBytes().length,InetAddress.getByName("192.168.3.255"),2425);
		socket.send(packet);
		// 关闭资源
		socket.close();
	}
	public static String getData(String context){
		StringBuilder sb = new StringBuilder();
		sb.append("1.0:");
		sb.append(System.currentTimeMillis() + ":");
		sb.append("测试:");
		sb.append("192.168.10.1:");
		sb.append("32:");
		sb.append(context);

		return sb.toString();
	}
	

}
