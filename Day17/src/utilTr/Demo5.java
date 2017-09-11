package utilTr;
/*Arrays:用于对数组操作的工具类
1，二分查找,数组需要有序
binarySearch(int[])
binarySearch(double[])

2，数组排序
sort(int[])
sort(char[])……
1，	将数组变成字符串。
 toString(int[])
2，	复制数组。
 copyOf();
3，	复制部分数组。
copyOfRange():
4，	比较两个数组是否相同。
equals(int[],int[]);
5，	将数组变成集合。
List asList(T[]);
这样可以通过集合的操作来操作数组中元素，
但是不可以使用增删方法，add，remove。因为数组长度是固定的，会出现
UnsupportOperationExcetion。
可以使用的方法：contains，indexOf。。。
如果数组中存入的基本数据类型，那么asList会将数组实体作为集合中的元素。
如果数组中的存入的引用数据类型，那么asList会将数组中的元素作为集合中
的元素。
*/
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
