package otherlist;

import java.util.Iterator;
import java.util.TreeSet;

/*
���󣺽��ַ����е���ֵ��������
		����String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
*/
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "8 10 15 5 2 7";
		String[] Newchar = str.split(" "); // ʹ�ÿո� �����в�� ����
		TreeSet tree = new TreeSet();
		for (int i = 0; i < Newchar.length; i++) {

			tree.add(Integer.parseInt(Newchar[i])); //// �ַ���תint������������Ҫʹ��Integer.parseInt()

		}
		System.out.println(tree);
		// ����treeSet��Ԫ��ƴ�ӳɶ�Ӧ���ַ���
		//��������һ����������  ʹ���˼��ϵĵ�������;
		Iterator it = tree.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}

	}

}
