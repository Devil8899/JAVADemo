package Day21;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
����ַ���:

------| Writer ����ַ����Ļ��ࡣ ������
-----------| FileWriter ���ļ��������ݵ�����ַ���

FileWriter��ʹ�ò��裺
	1. �ҵ�Ŀ���ļ���
	2. �����������ͨ��
	3. д�����ݡ�
	4. �ر���Դ
	
FileWriterҪע������
	1. ʹ��FileWriterд���ݵ�ʱ��FileWriter�ڲ���ά����һ��1024���ַ�����ģ�д���ݵ�ʱ�����д�뵽���ڲ�ά�����ַ������У������Ҫ
	����������д��Ӳ���ϣ���Ҫ����flush������close�����������������ڲ����ַ����顣
	2. ʹ��FileWriter��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ���
	3.ʹ��FileWriter��ʱ�� ���Ŀ���ļ��Ѿ������ˣ���ôĬ�������������ļ��е����ݣ�Ȼ����д������ �� �����Ҫ��ԭ���Ļ�����׷�����ݣ�
	��Ҫʹ�á�new FileWriter(File , boolean)���Ĺ��췽�����ڶ�����Ϊtrue��
	

��ϰ�� ʹ���ַ�������һ���ı��ļ�(java�ļ�). 
����ʹ���ַ�������һ��ͼƬ���۲�ͼƬ�Ĵ�С�仯��˼��Ϊʲô��������??��

******************************************************************************
��ʱʹ���ַ�������ʱʹ���ֽ�����������ʲô��

ʹ���ַ�����Ӧ�ó����� ����Ƕ�д�ַ����ݵ�ʱ����ʹ���ַ�����

ʹ���ֽ�����Ӧ�ó����� �����д�����ݶ�����Ҫת�����ַ���ʱ����ʹ���ֽ����� 
 
ʹ���ַ�������ͼƬ��������ݵ�һ����ʧ��

 */
public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//writeTest1();
		copyFile();
	}
	
	//����ַ���   
	public static void  writeTest1() throws IOException{
	        File file=new File("D:\\liuz\\JAVADemo\\a.txt");
	        FileWriter fwrite=new FileWriter(file);
	        String str="����Ҫд�����ص��ĵ���1";
	        fwrite.write(str);  // //�ַ����߱�����Ĺ��ܡ�
			//ˢ���ַ���
//			fwrite.flush();
			//�ر���Դ
	        fwrite.close();
	        
	        
//	        FileOutputStream outp=new FileOutputStream(file,true);
//	        outp.write(str.getBytes());
		
	}
	
	
	// ʹ���ַ������ܿ���ͼƬ  ��ΪͼƬ�����ֽڴ洢��
   public static void  copyFile() throws IOException{
	/*   File file1=new File("D:\\liuz\\JAVADemo\\a.txt");
	   File file2=new File("D:\\2.txt");
	   FileReader  fread=new FileReader(file1);
	   FileWriter  fwrite=new FileWriter(file2);
	   char[] buf=new char[1024];  //���ݶ�ȡ�浽���� �ַ�����
	   int context=0;
	   while((context=fread.read(buf))!=-1){  
		   fwrite.write(buf,0,context); //�߶���д
	   };
	   fwrite.close();  //������� close����
	   
	   */
	   
	   
	   File file1=new File("D:\\liuz\\JAVADemo\\adb.mp4");
	   File file2=new File("D:\\liuz\\adb.mp4");
	   FileInputStream fread=new FileInputStream(file1);
	   FileOutputStream  fwrite=new FileOutputStream(file2);
	   byte[] buf=new byte[1024];  //���ݶ�ȡ�浽���� �ַ�����
	   int context=0;
	   while((context=fread.read(buf))!=-1){  
		   fwrite.write(buf, 0, context);
	   };
	   fwrite.close();  //������� close����
	   fread.close();
	   
	   
//	   BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Test.txt"));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Test.exe"));
//		String line=null;
//		while((line = bufferedReader.readLine())!=null){
//		bufferedWriter.write(line);
//		}
//		bufferedWriter.close();
//		bufferedReader.close();
	   
   }
	

}
