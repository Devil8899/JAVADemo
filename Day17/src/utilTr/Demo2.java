package utilTr;

/*
双列集合： Map接口
-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
----------------| HashMap  底层也是基于哈希表实现 的。
HashMap的存储原理：
	往HashMap添加元素的时候，首先会调用键的hashCode方法得到元素 的哈希码值，然后经过运算就可以算出该
	元素在哈希表中的存储位置。 
	情况1： 如果算出的位置目前没有任何元素存储，那么该元素可以直接添加到哈希表中。
	
	情况2：如果算出 的位置目前已经存在其他的元素，那么还会调用该元素的equals方法与这个位置上的元素进行比较
	，如果equals方法返回 的是false，那么该元素允许被存储，如果equals方法返回的是true，那么该元素被视为
	重复元素，不允存储。

----------------| TreeMap   TreeMap也是基于红黑树（二叉树）数据结构实现 的， 特点：会对元素的键进行排序存储。

TreeMap 要注意的事项：
	1.  往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序特性进行排序存储。
	2.  往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性， 那么键所属的类必须要实现Comparable接口，把键
	的比较规则定义在CompareTo方法上。
	
	3. 往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，而且键所属的类也没有实现Comparable接口，那么就必须
	在创建TreeMap对象的时候传入比较器。
	

----------------| Hashtable  底层也是基于哈希表实现 的。实现方式与HashMap是一致的 但是HashMap 线程是安全的 操作效率低
*/
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
