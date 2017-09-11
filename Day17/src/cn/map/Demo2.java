package cn.map;

import java.util.HashMap;
import java.util.Map;

/*
在现实生活中有些数据是以映射关系存在的，也就是成对存在的，比如： 
	
	民政局 ：
		键                    值
		
		老公                老婆
		身份证            人
		一把要锁       锁
 双列集合：
-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map接口的方法：
 	
 	添加：
 		put(K key, V value) 
 		putAll(Map<? extends K,? extends V> m) 
 	
 	删除
 		remove(Object key)   删除一个键值对
 		clear()  清空集合

 	获取：
 		get(Object key)   通过键获取对应值
 		size()            获取总共几对键值对
 	
 	判断：
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 

 
 */
public class Demo2 {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		//添加方法
		map.put("jerry", "15");
		map.put("Eason", "19");
		map.put("tony","22");
/*		
		//添加
		System.out.println("返回值："+map.put("jerry","50"));  
		// 如果之前没有存在该键，那么返回的是null，如果之前就已经存在该键了，那么就返回该键之前对应 的值。
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("tom", "199");
		map2.put("peter", "100");
		map.putAll(map2); // 把map2的元素添加到map集合中。
*/		
		
		
	
        /* //删除
		 //根据键删除一条map中的数据，返回的是该键对应 的值。
		System.out.println("删除的数据是:"+map.remove("jerry")) ; 
		map.clear(); //清空集合中的所有数据。
		*/
		//获取
		/*System.out.println("根据指定 的键获取对应的值:"+ map.get("Eason"));
		System.out.println("获取map集合键值对个数："+map.size());
		
		
		//判断
		System.out.println("判断map集合是否包含指定的键："+ map.containsKey("jeams"));
		System.out.println("判断map集合中是否包含指定 的值："+ map.containsValue("19"));
		map.clear();   //清除键值对
		System.out.println("判断map集合是否为空元素："+ map.isEmpty()); //false 添加null也是值
		
		System.out.println("集合的元素："+ map);*/
		
		
	}

}