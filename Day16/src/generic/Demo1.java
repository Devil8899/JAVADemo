package generic;

import java.util.ArrayList;

/*
������jdk1.5ʹ�õ������ԡ�


 ���͵ĺô���
 	1. ������ʱ���쳣��ǰ���˱���ʱ��
 	2. ��������ν��ǿ������ת�� ��
 	
 
�����ڼ����еĳ���Ӧ�ã�
 	
 	ArrayList<String>  list = new ArrayList<String>();  true     �Ƽ�ʹ�á�
 	
 	ArrayList<Object>  list = new ArrayList<String>();  false
 	ArrayList<String>  list = new ArrayList<Object>();  false
 	
 	//��������д����Ҫ��Ϊ�˼������ϵͳ�ļ��������⡣
 	 * 
   ArrayList<String>  list = new ArrayList();           true   
 
   ArrayList    list = new ArrayList<String>();   true   

ע�⣺ ����û�ж�̬�ĸ���������ߵ����� ���ͱ��� Ҫһ�£�����ֻ��дһ�ߵķ������͡�

�Ƽ�ʹ�ã� ���߶�д���͡�


���� ��һ��������Ԫ��ȫ��ת�ɴ�д�� 

*/
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add("d");
		arr.add("e");

		for (int i = 0; i < arr.size(); i++) {
			String str = (String) arr.get(i);
			System.out.println("ת��д" + str.toUpperCase());
		}
		// ���巺��
		ArrayList<String> list = new ArrayList<String>(); // <String>
        // ��ʾ������ֻ�ܴ洢�ַ�������
		// �����ݡ�
		list.add("aa");
		list.add("bb");
		list.add("cc");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("��д��" + str.toUpperCase());
		}

		test.print(arr);

		ArrayList<String> list2 = test.getList();
	}

}
