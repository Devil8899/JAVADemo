package Day21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
����ַ���
----------| Writer  ��������ַ����Ļ��࣬  �����ࡣ
--------------- | FileWriter ���ļ�����ַ����ݵ�����ַ����� 
----------------| BufferedWriter ��������ַ���       
��������ַ������ã� ���FileWriter��д����Ч������չFileWriter�Ĺ��ܡ�
BufferedWriter�ڲ�ֻ�������ṩ��һ��8192���ȵ��ַ�������Ϊ���������ѣ���չ��FileWriter�Ĺ��ܡ�

BufferedWriter���ʹ�ã�
	1. �ҵ�Ŀ���ļ�
 	2. �������ݵ����ͨ��



 */
public class Demo6 {

	public static void main(String[] args) throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("D:\\liuz\\JAVADemo\\a.txt");
		//�������ݵ����ͨ��
		FileWriter fileWriter = new FileWriter(file,true);
		//�����������������
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
		//д������
//		bufferedWriter.newLine(); //newLine() ���С� ʵ���Ͼ������ļ����\r\n.
		bufferedWriter.write("\r\n");
		bufferedWriter.write("�µ�һ�У�");
		//�ر���Դ
		bufferedWriter.flush();
//		bufferedWriter.close();
		
	}
	
}
