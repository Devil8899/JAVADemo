/*
打jar包  有时在服务器部署不能直接使用class文件 可以将文件打包成*.jar包


使用格式：
 
	jar cvf jar文件的名字  class文件或者是文件夹 

     




*/

package cc;
import javax.swing.*;
class Demo5 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
           
         //System.out.println("QQ程序..");
		JFrame frame = new JFrame("QQ程序");
		frame.setSize(400,500);
		frame.setVisible(true); //设置窗口可见。
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
