package Day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		writeTest();
		readrTest();
	}


	//1.ʹ���ֽ���д���ġ�   �ֽ���֮�����ܹ�д��������Ϊ�������ַ�����getBytes�������ַ��������˱��루�ַ�---->���֣��� 
	public static void writeTest() throws IOException{
	   File fi=new File("D:\\liuz\\JAVADemo\\a.txt");  //�ҵ�Ŀ���ļ�
	   FileOutputStream str=new FileOutputStream(fi);    //�������ݵ����ͨ��
	   String Data="��Һ�";
	   byte[] by=Data.getBytes(); //��Ҫ���ַ���ת���ֽ�����
	   System.out.println("��������ݣ�"+ Arrays.toString(by));   //��������� 
	 //  �ֽ���֮�����ܹ�д��������Ϊ�������ַ�����getBytes�������ַ��������˱��루���ַ������---->���֣��� 
	   str.write(by);//Ĭ��write����д���� ����Ϊת�����ֽ���  ���±�������н���Ĺ��� ���Դ�������
	   str.close(); //�ر���Դ
	}
	
	
	//2.ʹ���ֽ�����ȡ����
	public static void readrTest() throws IOException{
		
		 File file=new File("D:\\liuz\\JAVADemo\\a.txt");  //�ҵ�Ŀ���ļ�
		 FileInputStream InputStream=new FileInputStream(file);    //�������ݵ����ͨ��
		 int content=0;
		 byte[] byt=new byte[2];
//		 while((content = InputStream.read(byt))!=-1){ 
//		  //���������ԭ�� һ��������gbk�����Ĭ����ռ�����ֽڣ�
//		   // Ŀǰ��ֻ��ȡ��һ���ֽڶ��ѣ����Բ���һ�����������ġ�
//              System.out.print(new String(byt));
//            }
//		 
		for (int i = 0; i <= byt.length; i++) {
		    InputStream.read(byt);  //ÿ�ζ�ȡ2�ֽ�  1������ռ2���ֽ� ������ȡ�Ϳ�����
		    System.out.print(new String(byt));
		}
		
		InputStream.close();		
	}
}
