package cn.map;

import java.util.HashMap;
import java.util.Map;

/*
����ʵ��������Щ��������ӳ���ϵ���ڵģ�Ҳ���ǳɶԴ��ڵģ����磺 
	
	������ ��
		��                    ֵ
		
		�Ϲ�                ����
		���֤            ��
		һ��Ҫ��       ��
 ˫�м��ϣ�
-------------| Map  �����ʵ����Map�ӿڵļ����࣬�߱����ص㣺 �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ��������ظ���ֵ�����ظ���
----------------| HashMap 
----------------| TreeMap
----------------| Hashtable 
 
 Map�ӿڵķ�����
 	
 	��ӣ�
 		put(K key, V value) 
 		putAll(Map<? extends K,? extends V> m) 
 	
 	ɾ��
 		remove(Object key)   ɾ��һ����ֵ��
 		clear()  ��ռ���

 	��ȡ��
 		get(Object key)   ͨ������ȡ��Ӧֵ
 		size()            ��ȡ�ܹ����Լ�ֵ��
 	
 	�жϣ�
 		containsKey(Object key) 
 		containsValue(Object value) 
 		isEmpty() 

 
 */
public class Demo2 {
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		//��ӷ���
		map.put("jerry", "15");
		map.put("Eason", "19");
		map.put("tony","22");
/*		
		//���
		System.out.println("����ֵ��"+map.put("jerry","50"));  
		// ���֮ǰû�д��ڸü�����ô���ص���null�����֮ǰ���Ѿ����ڸü��ˣ���ô�ͷ��ظü�֮ǰ��Ӧ ��ֵ��
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("tom", "199");
		map2.put("peter", "100");
		map.putAll(map2); // ��map2��Ԫ����ӵ�map�����С�
*/		
		
		
	
        /* //ɾ��
		 //���ݼ�ɾ��һ��map�е����ݣ����ص��Ǹü���Ӧ ��ֵ��
		System.out.println("ɾ����������:"+map.remove("jerry")) ; 
		map.clear(); //��ռ����е��������ݡ�
		*/
		//��ȡ
		/*System.out.println("����ָ�� �ļ���ȡ��Ӧ��ֵ:"+ map.get("Eason"));
		System.out.println("��ȡmap���ϼ�ֵ�Ը�����"+map.size());
		
		
		//�ж�
		System.out.println("�ж�map�����Ƿ����ָ���ļ���"+ map.containsKey("jeams"));
		System.out.println("�ж�map�������Ƿ����ָ�� ��ֵ��"+ map.containsValue("19"));
		map.clear();   //�����ֵ��
		System.out.println("�ж�map�����Ƿ�Ϊ��Ԫ�أ�"+ map.isEmpty()); //false ���nullҲ��ֵ
		
		System.out.println("���ϵ�Ԫ�أ�"+ map);*/
		
		
	}

}