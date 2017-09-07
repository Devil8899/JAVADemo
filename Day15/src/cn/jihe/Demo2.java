package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

------| Collection 单例集合的根接口
----------| List  如果是实现了 List接口的集合类，该集合类具备 的特点： 有序、可重复。
----------| Set   如果是实现了Set接口的集合类，该集合具备的特点： 无序，不可 重复。
 
Collection---迭代的方法：
	toArray() 
	iterator()
	
	
迭代器的作用：就是用于抓取集合中的元素。


迭代器的方法：
	hasNext()   问是否有元素可遍历。如果有元素可以遍历，返回true，否则返回false 。
          	
 	next()    返回迭代的下一个元素...
    
      	  
 	remove()  移除迭代器最后一次返回 的元素。


NoSuchElementException 没有元素的异常。 
出现的原因： 没有元素可以被迭代了。。。
	
	
 */
public class Demo2 {

	public static void main(String[] args) {
	     //创建一个集合
         Collection con=new ArrayList();
         con.add("jerry");
         con.add("tom");
         con.add("eason");
         
         //获取集合中所有元素  案例1
         Object[] arr=con.toArray();  // toArray()  把集合 的元素存储到一个 Object的数组中 返回。
         for(int i = 0 ; i<arr.length ; i++){
 			System.out.print(arr[i]+",");
 		}
        System.out.println("________________________________");
        //2.//要求使用iterator迭代器遍历。
         Iterator it = con.iterator();  
         //返回一个迭代器    疑问：iterator()方法返回的是一个接口类型，为什么接口又可以调用方法可以使用呢？
 		//iterator 实际 上返回的是iterator接口的实现类对象。
//        System.out.println("集合的下一个元素"+  it.next());
//        System.out.println("集合的下一个元素"+  it.next());   
//        System.out.println("集合的下一个元素"+  it.next());
         
// 		while(it.hasNext()){ // hasNext() 问是否有元素可以遍历。
// 			System.out.println("元素："+ it.next()); //获取元素
// 		}
 		
//         //清空集合 的元素
//		while(it.hasNext()){
//			it.next();
//			it.remove();
//		}
		System.out.println("集合的元素："+ con);
		
		
 		
 		
 		
         
	}

}
