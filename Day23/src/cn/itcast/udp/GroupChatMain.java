package cn.itcast.udp;

public class GroupChatMain {

	public static void main(String[] args) {
		
	       //���Ͷ�
           GroupChatSend send=new GroupChatSend();
           send.start();
           //���ն�
           GroupChatReceive receive=new GroupChatReceive();
           receive.start();
          
	}

}
