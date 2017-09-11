package cn.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
迭代：
	keySet() 
	values() 
	entrySet() 

*/
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String, String>();
		//添加方法
		map.put("jerry", "shanghai");
		map.put("tom", "Beijing");
		map.put("jack","hangzhou");
		map.put("Eason", "taibei");
		/*
		//map集合中遍历方式一： 使用keySet方法进行遍历       缺点： keySet方法只是返回了所有的键，没有值。 
		Set<String> keys = map.keySet();  //keySet() 把Map集合中的所有键都保存到一个Set类型 的集合对象中返回。
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String key = it.next();
			System.out.println("键："+ key+" 值："+ map.get(key));
		}
		
		
		
		//map集合的遍历方式二： 使用values方法进行 遍历。    缺点： values方法只能返回所有 的值，没有键。
		Collection<String>  c = map.values(); 
		//values() 把所有的值存储到一个Collection集合中返回。
		Iterator<String> it = c.iterator();
		while(it.hasNext()){
			System.out.println("值："+ it.next());
		}
		*/
		
		//map集合的遍历方式三： entrySet方法遍历。
		/*Set<Map.Entry<String,String>>  entrys = map.entrySet(); 
		Iterator<Map.Entry<String,String>> it = entrys.iterator();
		while(it.hasNext()){
			Map.Entry<String,String> entry = it.next();
			System.out.println("键："+ entry.getKey()+" 值："+ entry.getValue());
		}
		*/
	
	}
}
