package cn.itcast.tcp;
import java.io.*;


public class Demo1 {

	public static void main(String[] args) throws IOException {
        File file =new File("D:\\aa.txt");    
	    FileInputStream inputStream=new FileInputStream(file);
	    byte[] buf=new byte[1024];
	    int length=0;   //length���������еĶ�ȡ�ַ�����
//	    while((length=inputStream.read())!=-1)  //���ʹ��read����û�д��뻺�����飬��ô����ֵ�Ƕ�ȡ�������ݡ�
//	    {
//	    	 System.out.print((char)length);   	
//	    }
//	    
//	    while((length=inputStream.read(buf))!=-1)
//	    {
//	    	 System.out.print(new String(buf,0,length)+"\r\n");   	
//	         System.out.println("length:"+length);	 
//	    }
	    
	    //�ַ��� ����ֱ�Ӷ�ȡ����  �ֽ�����Ϊ�����п���2������һ���ֽ����� �����������û���㹻�ռ�ͻ���ɶ�ȡʧ��
		FileReader reader=new FileReader(file);
	    System.out.println((char)reader.read());
	}

}
