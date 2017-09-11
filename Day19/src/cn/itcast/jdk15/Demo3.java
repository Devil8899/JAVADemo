package cn.itcast.jdk15;
/*
�Զ����� ʵ��Iterable �ӿ�
��Ϊֻ��ʵ����Iterable�ӿ� ����ʹ����ǿforѭ����
//�Զ�һ����ʹ����ǿforѭ��

1.ʵ��Iterable �ӿ�
2.��дiterator���� �˷�������һ��������
3.�ڷ����ڲ�дһ���ڲ����������   ʵ��Iterator�ӿ� 
��д�ӿ���ط�����





 * */

import java.util.Iterator;
//ʵ�ֽӿ�                ��дiterator() ����
class person implements Iterable<String>{
	
	Object[] obj=new Object[10];
	int index=0;
	
	public void add(Object o){
	   obj[index++]=o;	
	}
    
	//��д����
	@Override
	public Iterator<String> iterator() {
		
		//����һ��������  �����ڲ���ʵ��һ���������ӿ�
		return  new Iterator<String>(){
            //�����ڲ�����д����
			int cursor  = 0;

			@Override
			public boolean hasNext() {
				return cursor<index;
			}

			@Override
			public String next() {
				return (String)obj[cursor++];
			}

			@Override
			public void remove() {
				
			}
			
		};
	}
	
	
}


public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person list =new person();
		list.add("jerry");
		list.add("eason");
		list.add("tom");
		
		for(String item : list){
			System.out.println(item);
		}
	}

}
