package cn.other;
/*
��ӡ����printStream��  ��ӡ�����Դ�ӡ�������͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
������ӡ����ȵȶ���




*/
import java.io.*;

public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO �Զ����ɵķ������

		/*FileOutputStream fileOutputStream = new FileOutputStream("F:\\a.txt");
		fileOutputStream.write("97".getBytes());   //�����תΪstring  97 ��ʹ��char �洢  �ļ�����a
		fileOutputStream.close();*/
		
		
		//1. ��ӡ�����Դ�ӡ�κ����͵����ݣ����Ҵ�ӡ����֮ǰ�����Ȱ�����ת�����ַ����ٽ��д�ӡ��
		File file = new  File("D:\\a.txt");
		//����һ����ӡ��
		PrintStream printStream = new PrintStream(file);
		/*
		printStream.println(97);
		printStream.println(3.14);
		printStream.println('a');
		printStream.println(true);
		Animal a = new Animal("����", "��ɫ");
		printStream.println(a);
		
		
		//2. Ĭ�ϱ�׼����������������̨����� �������������˱�׼����������� ��������������ļ���
		System.setOut(printStream); //���������˱�׼�����������
		System.out.println("�������²����������");
		*/
		
		//3.�ռ��쳣����־��Ϣ��
		File logFile = new File("D:\\2015��1��8��.log");
		PrintStream logPrintStream = new PrintStream( new FileOutputStream(logFile,true) );  //׷������ ���Ḳ�ǵ��ļ�
		try{
			int c = 4/0;
			System.out.println("c="+c);
			int[] arr = null;
			System.out.println(arr.length);
			
		}catch(Exception e){
			e.printStackTrace(logPrintStream);
			
		}
		
		
		
	}

}
