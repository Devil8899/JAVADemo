package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;

//����
/*
 * 
 *  ���ϣ������Ǵ洢�������ݵļ���������
 
���ϱ���������ƣ�
	1. ���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������� �����ݡ�
	2. ���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶��ġ�
	
 
-------| Collection  �������ϵĸ��ӿڡ� 
 ----------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ���
 ----------| Set   �����ʵ����Set�ӿڵļ����࣬�߱��ص㣺 ���򣬲����ظ���

Collection�ӿ��еķ�����
	
	����
		add(E e)  ��ӳɹ�����true����� ʧ�ܷ���false.
		addAll(Collection c)  ��һ������ ��Ԫ����ӵ�����һ��������ȥ��
	
	ɾ��
		clear() 
		remove(Object o) 
		
		removeAll(Collection  c) 
		retainAll(Collection  c) 
	
	�鿴    Ԫ�ظ���
		size() 

	
	�ж�
		isEmpty() 
		contains(Object o) 
		containsAll(Collection<?> c) 
	
	����
		toArray() 
		iterator() 
 * 
 * */
public class Demo2 {

	public static void main(String[] args) {
		//Collection �ӿ� ʵ���� ArrayList 
		Collection co=new ArrayList();  //�ӿ�ָ��ʵ�������  ��̬��һ������
		//���Ͽ��Դ洢�������͵Ķ�������
        co.add("jerry");
        co.add(20);  
        co.add(15.99);
     
        Collection c=new ArrayList();
        c.add("tom");   
        co.addAll(c);        //addAll(Collection c)  ��һ������ ��Ԫ����ӵ�����һ��������ȥ��
        System.out.println("��Ӽ��Ϸ���"+c.add("eason"));
        System.out.println("��ӡ����"+co);
        
        System.out.println("���Ԫ��________________________________________________");
        //��������
        Collection c1=new ArrayList();
        c1.add("jerry");
        c1.add("tom");
        c1.add("eason");
        //��������
        Collection c2=new ArrayList();
        c2.add("jack");
        c2.add("tom");
     
      //  c1.addAll(c2);
        System.out.println(c1);
	//	c.clear(); //clear()��ռ����е�Ԫ��
       // c1.remove("eason");
	 //c1.removeAll(c2); //ɾ��c��������c2�Ľ���Ԫ�ء�
	  //	c1.retainAll(c2); //����c������c2�Ľ���Ԫ�أ�������Ԫ��һ��ɾ����
      //  c1.removeAll(c2);
     // System.out.println("ɾ��c1��������c2�Ľ���Ԫ��"+c1);
        c1.retainAll(c2);
        System.out.println("����c1��������c2�Ľ���Ԫ��"+c1);
       System.out.println(c1.size());   //�鿴Ԫ�ظ���
	}

}
