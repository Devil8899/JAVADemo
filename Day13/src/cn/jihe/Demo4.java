package cn.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*  
����   ������תΪ���� ����һ��object[] ����
	toArray() 
*/
public class Demo4 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("zhagnsan");
		c.add("lisi");
		c.add(132);
		Object[] arr = c.toArray(); //�Ѽ����е�Ԫ��ȫ�� �洢��һ��Object�������з��ء�
		System.out.println("�����Ԫ�أ�"+Arrays.toString(arr));
		
		
		Collection c1 = new ArrayList();
		c1.add(new person("eason",110));
		c1.add(new person("pony",119));
		Object[] arr1 = c1.toArray();
		System.out.println(arr1);
		//���� �ѱ����110������Ϣ �����
		for(int i = 0 ; i<arr1.length ; i++){
			person p = (person)arr1[i];  //��Object������ȡ����Ԫ��ֻ��ʹ��Object���������������գ������Ҫ���� ��������Ҫ����ǿ������ת����
			if(p.ID==110){
				System.out.println(p);
			}
		}
		
		
	}

}
