package utilTr;
//Collection是一个单列集合的根接口  与 	Collections 是操作集合对象的一个工具类
/*集合框架中的工具类：特点：该工具类中的方法都是静态的。
Collections：常见方法：

1，	对list进行二分查找：
前提该集合一定要有序。
int binarySearch(list,key);
//必须根据元素自然顺序对列表进行升级排序
//要求list 集合中的元素都是Comparable 的子类。
int binarySearch(list,key,Comparator);

2，对list集合进行排序。
sort(list); 
//对list进行排序,其实使用的事list容器中的对象的compareTo方法
sort(list,comaprator);

//按照指定比较器进行排序
3，对集合取最大值或者最小值。
max(Collection)
max(Collection,comparator)
min(Collection)
min(Collection,comparator)

4，对list集合进行反转。
reverse(list);
8，可以将不同步的集合变成同步的集合。
Set synchronizedSet(Set<T> s)
Map synchronizedMap(Map<K,V> m)
List synchronizedList(List<T> list)

max(Collection)
max(Collection,comparator)
min(Collection)
min(Collection,comparator)

4，对list集合进行反转。
reverse(list);
8，可以将不同步的集合变成同步的集合。
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
		// 排序
		Collections.sort(list);
		// 折半查找的前提是排序好的元素
		System.out.println( Collections.binarySearch( list , 8 ) );  // 找不到返回-插入点-1
		// 反序集合输出
		Collections.reverse( list );
		System.out.println("反序集合"+list );
		// 求最值
		System.out.println( Collections.max( list ) );   // 4
		// fill()  使用指定的元素替换指定集合中的所有元素
		// Collections.fill( list, 5 );
		System.out.println( list );

		// 将数组转换为集合
		Integer is[] = new  Integer[]{6,7,8};
		List<Integer> list2 =  Arrays.asList(is);
		list.addAll( list2 );
		System.out.println( list );

		// 将List转换为数组
		Object [] ins =  list.toArray();
		System.out.println( Arrays.toString( ins ) );

	}

}
