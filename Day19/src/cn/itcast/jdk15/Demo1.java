package cn.itcast.jdk15;

import java.util.ArrayList;
import java.util.Collections;

/*
jdk1.5������֮-------��̬����

��̬��������ã� ����д��

��̬�����������һ��������о�̬��Ա�� 

��̬����ĸ�ʽ��
	import static ����.����.��̬�ĳ�Ա��


��̬����Ҫע������ 
	1. �����̬����ĳ�Ա�뱾��ĳ�Ա����ͬ��������£���ôĬ��ʹ�ñ���ľ�̬��Ա�������Ҫָ��ʹ�þ�̬����ĳ�Ա����ô��Ҫ�ھ�̬��Աǰ���������


*/
import static java.util.Collections.*;
import static java.lang.System.out;
public class Demo1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(13);
		list.add(9);
		list.add(10);
		list.add(19);
		
		//����
		//�����Ҫָ��ʹ�þ�̬����ĳ�Ա����ô��Ҫ�ھ�̬��Աǰ�������
		Collections.sort(list);                       
		out.println("���ϵ�Ԫ�أ�"+ list);
		out.println("����ֵ��"+ binarySearch(list,13));   //��ȡ����ֵ
		out.println("���ֵ��"+ max(list));
	}
	
	//�;�̬����ķ���ͬ�� ����ñ����ڵķ���
	public static void sort(ArrayList<Integer> list){
		System.out.println("���� ��sort����.....");
	}

}
