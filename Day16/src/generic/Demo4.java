package generic;

/*
���ͽӿ�

���ͽӿڵĶ����ʽ: 

	interface �ӿ���<�����Զ��巺��>{
	
	}

���ͽӿ�Ҫע������
	1. �ӿ����Զ���ķ��͵ľ���������������ʵ��һ���ӿڵ�ʱ��ָ�� �ġ�
	2. �ڽӿ����Զ���ķ��������ʵ�ֽӿڵ�ʱ��û��ָ��������������ͣ���ôĬ��ΪObject���͡�
	
���� Ŀǰ��ʵ��һ���ӿڵ�ʱ���һ�����ȷ��ĿǰҪ�������������ͣ���Ҫ�ȴ������ӿ�ʵ���� �����ʱ���Ҳ���ָ�����͵ľ����������͡�
	
	���Ҫ�ӳ��ӿ��Զ��巺�� �ľ����������ͣ���ô��ʽ���£�
	��ʽ��  
		public class Demo4<T> implements Dao<T>{
		
		}
	
*/


//���巺�ͽӿ�
interface Dao<T>{
	
	public void addd(T t);
	public <d>d del(d t);
}
//ʵ�ַ��ͽӿ�
public class Demo4<T> implements Dao<T> {

	public static void main(String[] args) {
		Demo4<String> d = new Demo4<String>();
		d.addd("1");
	}

	public void addd(T t){
		System.out.println(t);
	}

	@Override
	public <d> d del(d t) {
		
		return null;
	}
	


}
