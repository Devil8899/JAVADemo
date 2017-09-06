package cn.jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*  
迭代   将集合转为数组 返回一个object[] 数组
	toArray() 
*/
public class Demo4 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("zhagnsan");
		c.add("lisi");
		c.add(132);
		Object[] arr = c.toArray(); //把集合中的元素全部 存储到一个Object的数组中返回。
		System.out.println("数组的元素："+Arrays.toString(arr));
		
		
		Collection c1 = new ArrayList();
		c1.add(new person("eason",110));
		c1.add(new person("pony",119));
		Object[] arr1 = c1.toArray();
		System.out.println(arr1);
		//需求： 把编号是110的人信息 输出。
		for(int i = 0 ; i<arr1.length ; i++){
			person p = (person)arr1[i];  //从Object数组中取出的元素只能使用Object类型声明变量接收，如果需要其他 的类型需要进行强制类型转换。
			if(p.ID==110){
				System.out.println(p);
			}
		}
		
		
	}

}
