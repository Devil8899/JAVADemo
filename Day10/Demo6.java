/*
�쳣

�쳣����ϵ��
----------| Throwable    �������쳣���ߴ�����ĸ���  ���������� Error  Exception
--------------|Error     ����   ����һ��������jvm������Ӳ�����������⣬��������һ�㲻��ͨ������ȥ��������ġ�
--------------|Exception �쳣   ����Ҫͨ������ȥ�����ġ�

������ִ������쳣�أ�
	�����������˲���������Ϣ���������������Ϣ����������Error��β�ģ���ô�϶���һ������
	�������Exception��β�ģ���ô�϶�����һ���쳣��


Throwable���õķ�����
	toString()  ���ص�ǰ�쳣�������������+��̬��Ϣ��
	getMessage() ���ص��Ǵ���Throwable������ַ�����Ϣ��
	printStackTrace() ��ӡ�쳣��ջ��Ϣ��

*/

class Demo6 
{
	public static void main(String[] args) 
	{
		
		//������һ��Throwable����
		Throwable t = new Throwable("ͷ�Σ���ð..");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString: "+ info);  // java.lang.Throwable  ����+���� = ��������
		System.out.println("message: "+ message);
		
		test();
	}

	public static void test(){
		//
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}