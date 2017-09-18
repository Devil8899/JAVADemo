package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
װ�������ģʽ����ǿһ����Ĺ��ܣ����һ���������Щװ���໥��װ�Ρ�

BufferedReader�ǲ�����չ��FileReader�Ĺ��ܡ�
BuferedWriter Ҳ����չ��FileWriter�Ĺ��ܡ�

����1�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������кš�

 ����2����дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺš�
 
 ����3�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫���š�
 
����4�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺš�
 
����5�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ������зֺ�+ ˫���š�

����6�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ�������˫����+ �кš�
  
����7�� ��дһ������չBufferedReader�Ĺ��ܣ� ��ǿreadLine�������� ���ַ��������к�+ �ֺ�+˫���š�

----| Reader
-----------| BufferedReader
---------------| BufferedLineNum  ���к�
---------------| BufferedSemi    ���ֺ�
---------------| BufferedQuto   ��˫��
---------------| ����.. 
---------------|

��ǿһ����Ĺ���ʱ�����ǿ���ѡ��ʹ�ü̳У�
	
	ͨ���̳�ʵ����ǿһ����Ĺ����ŵ㣺   ����ṹ������ͨ���׶���
	
	ȱ�㣺 ʹ�ò����ᵼ�¼̳е���ϵ�����Ӵ�
*/
public class Demo1 {
	public static void main(String[] args) throws IOException {
    //�ҵ�Ŀ���ļ�
	File file=new File("D:\\liuz\\JAVADemo\\a.txt");
	//��������
	FileReader freader=new FileReader(file);
	//�������������ַ���
	BufferedQuto bufferedReader = new BufferedQuto(freader);
    String line=null;
    while((line = bufferedReader.readLine())!=null){ 
    	System.out.println(line);
    }
	}
}

//���кŵĻ��������ַ���
class BufferedLineNum extends BufferedReader {
	int Num = 1;
	// ���캯��
	public BufferedLineNum(Reader in) {
		super(in); // ���ø��๹�캯��
	}
	//��ǿreadLine�������� ���ַ��������кš�
	@Override
	public String readLine() throws IOException {
        //���ø����readLine����
		String context = super.readLine();
		if (context == null) {
			return null;
		}
		//����к�
		context = Num + " " + context;
		Num++;
		return context;
	}
}


//���ֺŵĻ��������ַ���
class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}
}


//��˫���ŵĻ��������ַ���
class  BufferedQuto extends BufferedReader{

	public BufferedQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line+"\"";
		return line;
	}
}
