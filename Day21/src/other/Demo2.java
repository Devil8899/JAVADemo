package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
װ�������ģʽ����ǿһ����Ĺ��ܣ����һ���������Щװ���໥��װ�Ρ�

װ�������ģʽ�Ĳ��裺
	1. ��װ������ڲ�ά��һ����װ��������á�
	2. ��װ������һ����ͬ�ĸ�������Ǹ��ӿڡ�    ����ͬ�̳���һ���������
	�̳�ʵ�ֵ���ǿ�������ģʽʵ�ֵ���ǿ���к�����

	�̳�ʵ�ֵ���ǿ�ࣺ
		�ŵ㣺����ṹ����������ʵ�ּ�. 
		ȱ�㣺����ÿһ������Ҫ��ǿ���඼Ҫ�����������������������ǿ�������ᵼ�¼̳���ϵ�����Ӵ�

����ģʽʵ�ֵ���ǿ�ࣺ
		�ŵ㣺�ڲ�����ͨ����̬�����Զ����Ҫ��ǿ���������ǿ�� ��������Щװ����ﵽ����װ�ε�Ч����ʹ�ñȽ���
		
		ȱ�㣺��Ҫ�ڲ�ͨ����̬����ά����Ҫ����ǿ�����ʵ��������ʹ�ô�����΢���ӡ�

	
	
	*/
public class Demo2 {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\liuz\\JAVADemo\\a.txt");
		FileReader fileReader = new FileReader(file);
		//�������������ַ���
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		//�������кŵĻ��������ַ���  ��һ�����������ַ��� ʵ�����Ǵ�һ���������
		BufferedLineNum2 bufferedLineNum = new BufferedLineNum2(bufferedReader);
		
		//���ֺŵĻ��������ַ���
		BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum);   //��̬����ʵ�� ��������Ķ���
		
		//��˫���ŵĻ��������ַ���
		BufferedQuto2 bufferedQuto2 = new  BufferedQuto2(bufferedReader);
		String line = null;
		while((line = bufferedQuto2.readLine())!=null){
			System.out.println(line);
		}
	}

}
//���кŵĻ��������ַ���
class BufferedLineNum2 extends BufferedReader{
	//���ڲ�ά��һ����װ��������á�
		BufferedReader bufferedReader;
		int count = 1;
		public BufferedLineNum2(BufferedReader bufferedReader){
			super(bufferedReader);// ע�⣺ �����û���κε����ã�ֻ������Ϊ���ô��벻����
			this.bufferedReader = bufferedReader;			
		}
	
		public String readLine() throws IOException{
			String line = bufferedReader.readLine();
			if(line==null){
				return null;
			}
			line = count+" "+line;
			count++;
			return line;
		}	
}

//���ֺŻ��������ַ���
class BufferedSemi2 extends BufferedReader{  //ΪʲôҪ�̳�?  ��Ϊ������Щװ����Ķ��������Ϊ�������д��ݣ��ﵽ����װ�� ��Ч����

	//1.���ڲ�ά��һ����װ��������á�
	BufferedReader bufferedReader;	
	public BufferedSemi2(BufferedReader bufferedReader){ // new BuffereLineNum();
		super(bufferedReader);// ע�⣺ �����û���κε����ã�ֻ������Ϊ���ô��벻����
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
		if(line==null){
			return null;
		}
		line = line +";";
		return line;
	}
}
//�������˫����
class BufferedQuto2 extends BufferedReader{
	
	//���ڲ�ά��һ����װ�ε���
	BufferedReader bufferedReader;
	
	public BufferedQuto2(BufferedReader bufferedReader){  //new  BufferedSemi2();
		super(bufferedReader) ; //ֻ��Ϊ���ô��벻����..
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
		if(line==null){
			return null;
		}
		line = "\""+line +"\"";
		return line;
	}
}
	
