package otherlist;

import java.util.Iterator;
import java.util.TreeSet;

/*
需求：将字符串中的数值进行排序。
		例如String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
*/
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "8 10 15 5 2 7";
		String[] Newchar = str.split(" "); // 使用空格 来进行拆分 数组
		TreeSet tree = new TreeSet();
		for (int i = 0; i < Newchar.length; i++) {

			tree.add(Integer.parseInt(Newchar[i])); //// 字符串转int类型数据是需要使用Integer.parseInt()

		}
		System.out.println(tree);
		// 遍历treeSet的元素拼接成对应的字符串
		//这里用了一个遍历集合  使用了集合的迭代方法;
		Iterator it = tree.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}

	}

}
