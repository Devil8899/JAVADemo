package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;

/*
�ж�
	isEmpty()     �ж�Ϊ��
	contains(Object o)
	containsAll(Collection<?> c)   //�����а�����һ�������е�����Ԫ����
*/
public class Demo3 {

	public static void main(String[] args) {
     //����1
     Collection c=new ArrayList();
     System.out.println(c.isEmpty());   //��
     c.add("123");
     c.add("test");
     //����2
     Collection c1=new ArrayList();
     c1.add("123");
     c1.add("test");
     System.out.println("�Ƿ����"+c.contains("123"));
     System.out.println("��Ա�Ƿ�ȫ�����"+c.containsAll(c1));
     
     
     ////��������Զ����Ԫ��
     Collection Cn=new ArrayList();
     Collection Cn1=new ArrayList();
     Cn.add(new person("jerry",1));
     Cn1.add(new person("jerry",1));
  // ��ʵcontains�����ڲ���������equals�������бȽϵġ�
     System.out.println(Cn);   //��ӡc ����ӵĶ����ֻ��һ���ڴ��ַ
// 	System.out.println("�жϼ����Ƿ�Ϊ��Ԫ�أ�"+ c.isEmpty());
//	System.out.println("�жϼ������Ƿ����ָ����Ԫ�أ�"+ c.contains(""));*/
     System.out.println("Cn�����а���Cn1�����е�����Ԫ����"+Cn.containsAll(Cn1));  //true 
     //�жϼ������Ƿ����ָ����Ԫ��
     System.out.println("�жϼ������Ƿ����ָ����Ԫ��"+Cn.contains(new person("jerry",1)));
     
	}
}


class person{
	String name;
	int   ID;
	public person(String name,int ID){
		this.name=name;
		this.ID=ID;
	}
	
	
	// ���ظö���Ĺ�ϣ��ֵ(��ҿ��԰ѹ�ϣ��� �����Ƕ�����ڴ��ַ)/
	//java�淶�� һ����дequlas�������Ƕ�����дhashCode�����ġ�
	@Override
	public int hashCode() {
		return this.ID;
	}

    //	  ��дtoString֮������ֱ�����һ�������ʱ�򣬾ͻ������������������ĸ�ʽ���ݡ�
	@Override
	public String toString() {
		return "{����"+this.name+"���"+this.ID+"}";
	}


	//��дEquals ����  �Ƚ�ID
	@Override
	public boolean equals(Object obj) {
		person p=(person)obj;
		return this.ID==p.ID;
	}
	
	
	
	
}
