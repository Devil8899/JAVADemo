package cn.string;
/*
 * String �����˹��췽�� ���ſ���ȡ����
2.2	��ȡ����
	int length()  ��ȡ�ַ����ĳ���
	char charAt(int index) ��ȡ�ض�λ�õ��ַ� (�Ǳ�Խ��)
	int indexOf(String str) �����Ӵ���һ�γ��ֵ�����ֵ,����Ӵ�û�г��� ���ַ����У���ô�򷵻�-1��ʾ��
	int lastIndexOf(String str) �����Ӵ����һ�γ��ֵ�����ֵ , ����Ӵ�û�г��� ���ַ����У���ô�򷵻�-1��ʾ
*/
public class Demo3 {
	public static void main(String[] args) {
	  String str="����һ��abc����"; 
	  System.out.println(str.length());  //��ȡ�ַ�������   ��� "9"
	  System.out.println(str.charAt(3)); //������0��ʼ      ��� ����"
	  System.out.println(str.indexOf("��")); // �����Ӵ���һ�γ��ֵ�����ֵ  ��� 0
	  System.out.println(str.indexOf("��"));  //3
	  System.out.println(str.lastIndexOf("��"));//�����Ӵ����һ�γ��ֵ�����ֵ   ���"8"
	}
	
}
