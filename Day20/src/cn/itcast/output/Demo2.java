package cn.itcast.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
4.ʹ��FileOutputStream��write����д���ݵ�ʱ����Ȼ���յ���һ��int���͵����ݣ�
��������д����ֻ��һ���ֽڵ����ݣ�ֻ��
�ѵͰ�λ�Ķ���������д����������ʮ��λ����ȫ��������
 
 00000000-000000000-00000001-11111111   511
 

*/
public class Demo2 {
	
	
	public static void main(String[] args) throws IOException {
		writeTest();
		
		//readTest();
	}
	
	public static void readTest() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		//�������ݵ�����ͨ��
		FileInputStream fileInputStream = new FileInputStream(file);
		//�������������ȡ�ļ�����
		byte[] buf = new byte[4];  //��ȡ4���ֽڵ�����
		//��ȡ�ļ�����
		int length = 0;
		while ((length = fileInputStream.read()) != -1) {	
				System.out.print("����"+(char) length);
		}
		
		
		System.out.println("�ֽ���������ݣ�"+ Arrays.toString(buf));
		//�ر���Դ
		fileInputStream.close();
		
	}
	
	
	
	

	public static void writeTest() throws FileNotFoundException, IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		//�������ݵ����ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//������д��
		fileOutputStream.write(511);
//		fileOutputStream.write('9');
		//�ر���Դ
		fileOutputStream.close();
	}

}

