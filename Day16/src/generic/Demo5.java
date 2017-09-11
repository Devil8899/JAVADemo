package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 ���͵������ޣ�
 
����1�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Integer������Integer�ĸ����������ݡ�

����2�� ����һ���������Խ��ս����������͵ļ��϶��� Ҫ����յļ��϶���ֻ�ܴ洢Number������Number�������������ݡ�

������ͨ����� �� 
	
	? super Integer : ֻ�ܴ洢Integer������Integer����Ԫ�ء�  ���� ������
 	
 	? extends Number �� ֻ�ܴ洢Number������Number���͵��������ݡ� ��������
 	
 */
public class Demo5 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Number> list2 = new ArrayList<Number>();
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		getData(set);
		
	}
	
	//���͵�����  ���⼯������
	public static void getData(Collection<? extends Number> c){
		 Iterator it = c.iterator();  
		 while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	//���͵�����
	public static void print(Collection<? super Integer> c){
		
	}
	
}
