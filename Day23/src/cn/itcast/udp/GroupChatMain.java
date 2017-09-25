package cn.itcast.udp;

public class GroupChatMain {

	public static void main(String[] args) {
		
	       //∑¢ÀÕ∂À
           GroupChatSend send=new GroupChatSend();
           send.start();
           //Ω” ’∂À
           GroupChatReceive receive=new GroupChatReceive();
           receive.start();
          
	}

}
