package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/*
 
 ���� ��һ��mp3���и��n�ݣ�Ȼ���ٰ���Щ�ļ��ϲ�������
 
 */

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Cutfile();
		addFile();
	}

	//�и��ļ�
	public static void Cutfile() throws IOException{
		File file=new File("D:\\liuz\\JAVADemo\\Day22\\src\\cn\\gril.mp3");
		//Ŀ���ļ���
		File dir = new File("D:\\liuz\\JAVADemo\\music");
		//��ȡ�ļ�
		FileInputStream finput=new FileInputStream(file);
		byte[] buf=new byte[1024*1024]; //ÿ�ζ�ȡ1M  1kb*1024
		int length=0;
		for (int i = 0; (length=finput.read(buf))!=-1; i++) {   //length��ÿ�ζ�ȡ�����ֽ�  1048576�ֽ� =1MB
		 FileOutputStream fout=	new FileOutputStream(new File(dir,i+".mp3"));
		 fout.write(buf,0,length);
		 fout.close();
		}
		finput.close();
	}
	
	//�ϲ��ļ�
	
	public static <T> void addFile() throws IOException{
		// Ŀ���ļ���
		File dir1 = new File("D:\\liuz\\JAVADemo\\music");
		// ͨ��Ŀ���ļ����ҵ����е�MP3�ļ���Ȼ������е�MP3�ļ���ӵ�vector�С�
		File[] files = dir1.listFiles();
	    //����  С����
	    for (int i = 0;i < files.length;i++){
	        for(int j = i+1;j < files.length;j++){
	            if (Integer.parseInt(files[i].getName().replace(".mp3",""))> Integer.parseInt(files[j].getName().replace(".mp3",""))){
	                File temp = files[i];
	                files[i] = files[j];
	                files[j] = temp;
	            }
	        }
	    }
		
		
		Vector<FileInputStream> ve = new Vector<FileInputStream>();
//		for (File file : files) { // forѭ����ǿ
//			if (file.getName().endsWith(".mp3")) { // �ж��ļ���
//				ve.add(new FileInputStream(file));
//			}
//		}
		
		for (int i = 0; i < files.length; i++) {
			ve.add(new FileInputStream(files[i]));
		}
		
		
		
	
		// ͨ��Vector��ȡ������ ѭ������
		Enumeration<FileInputStream> e = ve.elements();
		// ����������
		SequenceInputStream inputStream = new SequenceInputStream(e);
		// �����ļ������ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream("D:\\liuz\\JAVADemo\\all.mp3");
		byte[] by=new byte[1024*1024];
		int context=0;
         while ((context=inputStream.read(by))!=-1) {
		         fileOutputStream.write(by,0,context);
		       
		}
       //�ر���Դ
 		fileOutputStream.close();
 		inputStream.close();
	}

}
