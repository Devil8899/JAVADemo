package cn.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo4 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		System.out.println("======get方法遍历=======");
		for(int i = 0 ; i<list.size() ; i++){
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("\r\n======使用迭代器正序遍历==========");
		ListIterator it = list.listIterator();	//获取到迭代器
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		
		System.out.println("\r\n======使用迭代器逆序遍历==========");
		while(it.hasPrevious()){
			System.out.print(it.previous()+",");
		}
		
		
	}

}
