/*
finally �飻

finally��� ʹ��ǰ���Ǳ���Ҫ����try�����ʹ�á�

finally��Ĵ������κ�����¶���ִ�еģ�����jvm�˳��������

finally�ǳ��ʺ�����Դ�ͷŵĹ����������ӿ��Ա�֤��Դ�ļ����κ�����¶� �ᱻ�ͷš�



try���������Ϸ�ʽ��


��һ�֣� �Ƚ����������쳣Ҫ��������û����ԴҪ�ͷŵġ�
		 try{

			���ܷ����쳣�Ĵ���
	
			}catch(������쳣���� ������){
				�����쳣�Ĵ���
			}

�ڶ��֣��Ƚ������ڼ����쳣Ҫ������Ҫ�ͷ���Դ�Ĵ��롣
		
		try{

			���ܷ����쳣�Ĵ���
	
			}catch(������쳣���� ������){
				�����쳣�Ĵ���
			}finally{ 
				�ͷ���Դ�Ĵ���;
			}

�����֣� �Ƚ��������ڲ��׳���������ʱ�쳣����������ԴҪ���ͷš�
		   try{

			���ܷ����쳣�Ĵ���
	
			}finally{ 
				�ͷ���Դ�Ĵ���;
			}

*/
import java.io.*;
class Demo4
{
	public static void main(String[] args) 
	{
		FileReader fileReader = null;
		try{
			//�ҵ�Ŀ���ļ�
			File file = new File("f:\\a.txt");
			//�����������ļ�������ͨ��
			fileReader = new FileReader(file);
			//��ȡ�ļ�
			char[] buf = new char[1024];
			int length = 0; 
			length = fileReader.read(buf);
			System.out.println("��ȡ�������ݣ�"+ new String(buf,0,length));
		}catch(IOException e){
			System.out.println("��ȡ��Դ�ļ�ʧ��....");
		}finally{
			System.out.println("�Ҷ���ִ��");
			try{
				//�ر���Դ
				fileReader.close();
				System.out.println("�ͷ���Դ�ļ��ɹ�....");
			}catch(IOException e){
				System.out.println("�ͷ���Դ�ļ�ʧ��....");
			}
		}
	}
}
