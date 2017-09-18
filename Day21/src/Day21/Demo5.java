package Day21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
�����ַ���:
-------| Reader ���������ַ����Ļ��ࡣ ������
----------| FileReader ��ȡ�ļ��ַ����������ַ�����
----------| BufferedReader   ���������ַ���  �� ���� �����ַ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ� ��Ч�ʺ���չ��FileReader�Ĺ��ܡ� 
��ʵ�����ڲ�Ҳ��ά����һ���ַ�����
***********************************************
��ס�������������߱���д�ļ���������

BufferedReader��ʹ�ò��裺
	1.�ҵ�Ŀ���ļ�
	2 .�������ݵ�����ͨ����
	3.�������������ַ���
	
	1.�ֽ���   1.���������ֽ���  2.��������ַ���
	2.�ַ���   1.���������ַ���   2.��������ַ���
	
	
 */
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readTest1();

	}
	
	//�Լ�ȥʵ��readLine������
		public static String myReadLine(FileReader fileReader) throws IOException{
			//����һ���ַ������������
			StringBuilder sb = new StringBuilder();  //StringBuilder��Ҫ�����ڴ洢��ȡ��������
			int content = 0 ;
			while((content = fileReader.read())!=-1){
				if(content=='\r'){
					continue;
				}else if(content=='\n'){
					break;
				}else{
					//��ͨ�ַ�
					sb.append((char)content);
				}
			}
			//�����Ѿ���ȡ����ˡ�
			if(content ==-1){
				return null;
			}
			
			return sb.toString();  
		}
		
		
	
	
	public static void readTest1() throws IOException{
		//�ҵ�Ŀ���ļ�
		File file  = new File("D:\\liuz\\JAVADemo\\a.txt");
		//�������ݵ�����ͨ����
		FileReader fileReader = new FileReader(file);
		//�������������ַ���
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//��ȡ����
		/*int content = bufferedReader.read();  //������һ���ַ��� ��ȡ�����ַ��϶�Ҳ�Ǵ�Bufferedreader�ڲ����ַ������л�ȡ�ĵ�������Ч�ʸߡ�
		System.out.println((char)content);*/
		//ʹ��BUfferedReader��չ�Ĺ��ܣ�readLine()  һ�ζ�ȡһ���ı�������������ļ���ĩβ����null��ʾ��
		String line =  null;
//		bufferedReader.read();
		while((line = bufferedReader.readLine())!=null){ 
			//����String ��ȻreadLineÿ�ζ�ȡһ�����ݣ����Ƿ����line�ǲ�����\r\n��   \r 13  \n 10��ʾ
			System.out.println(Arrays.toString("aaa\r\n".getBytes()));
//			System.out.println(Arrays.toString(line.getBytes()));
//			System.out.println(line);
		}
		//�ر���Դ
		bufferedReader.close();
		
	}
}
