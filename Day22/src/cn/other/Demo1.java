package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/*
SequenceInputStream(������)
��������������캯��
1.���Խ�����ļ�������һ��
SequenceInputStream(Enumeration<? extends InputStream> e) 
��ʼ���´����� SequenceInputStream��ס��˵����������������������ʱ������ InputStream Enumeration��  
2.ֻ��2���ļ�������һ��
SequenceInputStream(InputStream s1, InputStream s2) 
��ʼ���´����� SequenceInputStream��ס��������������д��������һ s1Ȼ�� s2���ṩ�ֽ��Ǵ��� SequenceInputStream����  

  
ͬʱ�߱���ȡ�ķ���read() ��
 
 
 
���󣺰�a.txt��b.txt �ļ������ݺϲ���

 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		merge1();
//		merge2();
		merge3();
	}
	//1.���󣺰�a.txt��b.txt �ļ������ݺϲ���   ʹ���ļ���ʵ��
		public static void merge1() throws IOException{
			//�ҵ�Ŀ���ļ�
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File outFile = new File("D:\\liuz\\JAVADemo\\c.txt");
			//�������ݵ��������ͨ��
			FileOutputStream fileOutputStream = new FileOutputStream(outFile);
			FileInputStream fileInputStream1 = new FileInputStream(inFile1);
			FileInputStream fileInputStream2 = new FileInputStream(inFile2);
			
			//���������洢�������У�Ȼ���ٴӼ����ж�ȡ
			ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
			list.add(fileInputStream1);
			list.add(fileInputStream2);
			
			//׼��һ����������
			byte[] buf = new byte[1024];
			int length = 0 ; 
			
			for(int i = 0 ; i< list.size() ; i++){
				FileInputStream fileInputStream = list.get(i);
				while((length = fileInputStream.read(buf))!=-1){
					fileOutputStream.write(buf,0,length);
				}
				//�ر���Դ
				fileInputStream.close();
			}
			fileOutputStream.close();	
		}
		//2. SequenceInputStreamʵ��  ���캯��1
		
		public static void merge2() throws IOException{
			//�ҵ�Ŀ���ļ�
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File outFile = new File("D:\\liuz\\JAVADemo\\d.txt");
			//������Ӧ ���������������
			FileInputStream f1=new FileInputStream(inFile1);
			FileInputStream f2=new FileInputStream(inFile2);
			FileOutputStream f3=new FileOutputStream(outFile);
			//��������������
			SequenceInputStream seq =new SequenceInputStream(f1, f2);
			
			byte[] by=new byte[1024];  //ÿ�ζ�ȡ1024���ֽ�
			int length=0;              //��ȡ���������ֽڳ���
			//��ȡ�ļ�����
			while((length=seq.read(by))!=-1){ //ÿ�ζ�ȡ�������ݴ��뵽�ֽ������� һ������
				f3.write(by, 0, length);			
			}
			//����Ҫ����FileInputStream ��close����
			//�ر���Դ
			seq.close();
			f3.close();
			
		}
		//3.	//�������ļ��ϲ���һ���ļ�  ����Ҫʹ������������һ�����캯��
		public static void merge3() throws IOException{
		   
			//�ҵ�Ŀ���ļ�
			File inFile1 = new File("D:\\liuz\\JAVADemo\\a.txt");
			File inFile2 = new File("D:\\liuz\\JAVADemo\\b.txt");
			File inFile3 = new File("D:\\liuz\\JAVADemo\\d.txt");
			
			File outFile = new File("D:\\liuz\\JAVADemo\\f.txt");
			//������Ӧ ���������������
			FileInputStream f1=new FileInputStream(inFile1);
			FileInputStream f2=new FileInputStream(inFile2);
			FileInputStream f3=new FileInputStream(inFile3);
			
			FileOutputStream f4=new FileOutputStream(outFile,true);
			
			Vector<FileInputStream> vc=new Vector<FileInputStream>();
			vc.add(f1);
			vc.add(f2);
			vc.add(f3);
			//����һ��������  ѭ������ʹ��
			Enumeration<FileInputStream> e = vc.elements();
			
			//��������������  һ����һ����ȡ
			SequenceInputStream seq =new SequenceInputStream(e);

			//��ȡ�ļ�����
			byte[] buf = new byte[1024];
			int length = 0; 
			
			while((length = seq.read(buf))!=-1){
				f4.write(buf,0,length);
			}		
			//�ر���Դ
			seq.close();
			f4.close();	
		}
}
