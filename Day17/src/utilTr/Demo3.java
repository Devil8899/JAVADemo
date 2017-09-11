package utilTr;
//Collection��һ�����м��ϵĸ��ӿ�  �� 	Collections �ǲ������϶����һ��������
/*���Ͽ���еĹ����ࣺ�ص㣺�ù������еķ������Ǿ�̬�ġ�
Collections������������

1��	��list���ж��ֲ��ң�
ǰ��ü���һ��Ҫ����
int binarySearch(list,key);
//�������Ԫ����Ȼ˳����б������������
//Ҫ��list �����е�Ԫ�ض���Comparable �����ࡣ
int binarySearch(list,key,Comparator);

2����list���Ͻ�������
sort(list); 
//��list��������,��ʵʹ�õ���list�����еĶ����compareTo����
sort(list,comaprator);

//����ָ���Ƚ�����������
3���Լ���ȡ���ֵ������Сֵ��
max(Collection)
max(Collection,comparator)
min(Collection)
min(Collection,comparator)

4����list���Ͻ��з�ת��
reverse(list);
8�����Խ���ͬ���ļ��ϱ��ͬ���ļ��ϡ�
Set synchronizedSet(Set<T> s)
Map synchronizedMap(Map<K,V> m)
List synchronizedList(List<T> list)

max(Collection)
max(Collection,comparator)
min(Collection)
min(Collection,comparator)

4����list���Ͻ��з�ת��
reverse(list);
8�����Խ���ͬ���ļ��ϱ��ͬ���ļ��ϡ�
Set synchronizedSet(Set<T> s)
Map synchronizedMap(Map<K,V> m)
List synchronizedList(List<T> list)

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		// ����
		Collections.sort(list);
		// �۰���ҵ�ǰ��������õ�Ԫ��
		System.out.println( Collections.binarySearch( list , 8 ) );  // �Ҳ�������-�����-1
		// ���򼯺����
		Collections.reverse( list );
		System.out.println("���򼯺�"+list );
		// ����ֵ
		System.out.println( Collections.max( list ) );   // 4
		// fill()  ʹ��ָ����Ԫ���滻ָ�������е�����Ԫ��
		// Collections.fill( list, 5 );
		System.out.println( list );

		// ������ת��Ϊ����
		Integer is[] = new  Integer[]{6,7,8};
		List<Integer> list2 =  Arrays.asList(is);
		list.addAll( list2 );
		System.out.println( list );

		// ��Listת��Ϊ����
		Object [] ins =  list.toArray();
		System.out.println( Arrays.toString( ins ) );

	}

}
