package Day21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
�ֽ������ֽ�����ȡ�����ļ��еĶ��������ݣ����������ݲ��������ת�����㿴�ö����ַ���    
 
�ַ����� �ַ�����Ѷ�ȡ���Ķ����Ƶ����ݽ��ж�Ӧ �ı�������빤����   �ַ��� = �ֽ��� + ����(����)
 
�����ַ�����
----------| Reader �����ַ����Ļ���   ������
-------------| FileReader ��ȡ�ļ��������ַ�����


FileReader���÷���
	1. �ҵ�Ŀ���ļ�
	2. �������ݵ�����ͨ��
	3. ��ȡ����    read() ����  ÿ�ζ�ȡ�������ֽ� ����1�����ַ� ���Կ���ֱ�Ӷ�ȡ����
	4. �ر���Դ
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
	
//		readTest1();
		readTest2();
		
	}

	//1. �����ַ��� ����������ȡ����
	public static void readTest1() throws IOException{
		//1. �ҵ�Ŀ���ļ�
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		//2. �������ݵ�����ͨ��
		FileReader reader=new FileReader(file);
		//3. ��ȡ����    read() ����  ÿ�ζ�ȡ�������ֽ� ����1�����ַ� ���Կ���ֱ�Ӷ�ȡ����
		int context=0;
		while((context=reader.read())!=-1){ //ÿ��ֻ���ȡһ���ַ�  Ч�ʵ�
			//���ʹ��read����û�д��뻺�����飬��ô����ֵ�Ƕ�ȡ�������ݡ�
			System.out.print((char)context);
		}
		//4.�ر���Դ
		reader.close();	
	}
	
	//2.ʹ�û����ַ������ȡ�ļ���Ч�ʸ�
	public static void readTest2() throws IOException{
		//1. �ҵ�Ŀ���ļ�
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		//2. �������ݵ�����ͨ��
		FileReader reader=new FileReader(file);
		//���������ַ������ȡ�ļ�����
		char[] buf = new char[1024];
		int length = 0 ;   //length���������еĶ�ȡ�ַ�����
		while((length = reader.read(buf))!=-1){ //reader.read(buf) ÿ�ζ�ȡ1024���ֽ�
			System.out.print(new String(buf,0,length));
			System.out.println("length"+length);
		}
	
		
	}
}
