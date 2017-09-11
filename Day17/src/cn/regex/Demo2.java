package cn.regex;

import java.util.Arrays;

/*������ʽ��Ҫ���ڲ����ַ����Ĺ���  ������ʽ���ַ����Ĳ��������¼�����
    
    ƥ��  matches();
    
    �и�  split()   ʹ��ָ����ʽ�и� �������� 
 
    �滻  replaceAll(String regex, String replacement)   
 
    ����
 
*/
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathesPhone("13819255633");
		MathTelNum("0516-1123456");
		Spspad("1 2 3 4 5");
		MathQQ("js@qq.com");
		StrRepl();
		Replace1();
	}

	// ƥ���ֻ��� 1��ͷ �ڶ�λ��3��4��5��7��8 ����һ�� ����11λ
	public static void MathesPhone(String str) {
		String RegPhone = "1[34578]\\d{9}"; // ����11λ ��һλ��1 �ڶ�λ��
		System.out.println(str.matches(RegPhone) ? "�Ϸ��ֻ���" : "�Ƿ��ֻ���");
	}

	// ƥ��̶��绰 ��ʽ�� ����-������ ���ţ���λ��0 ����3-4 �����ţ���λ������0 ����7-8λ
	public static void MathTelNum(String str) {
		String Regtel = "0\\d{2,3}-[^0]\\d{6,7}";
		System.out.println(str.matches(Regtel) ? "�Ϸ��̶��绰" : "���Ϸ��̶��绰");
	}

	// QQ����ƥ��
	public static void MathQQ(String str) {
		String Regqq = "(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w{2,3}){1,3})";
		// 1�������ַ���.�Ӷ���ַ�
		System.out.println(str.matches(Regqq) ? "�Ϸ�����" : "����ƥ��ʧ��");
	}

	/**
	 * ������ʽ����֤����
	 */
	public static final String REGEX_EMAIL = 
	"^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

	// �ַ��� �и�split
	public static void Spspad(String str) {
		String[] str2 = str.split(" "); // ʹ�ÿո��и�� ���顣
		System.out.println(Arrays.toString(str2));
	}
	
	//replaceAll
	public static void StrRepl(){
		//���󣺰��ֻ����滻�ɡ�*���š�
		String str1 = "��ϵ�ң�13567012119��ϵ�ң�13567012119��ϵ�ң�13567012119��ϵ�ң�13567012119��ϵ�ң�13567012119��ϵ�ң�13567012119";
				String reg= "1[34578]\\d{9}";   //ѡ�������е��ֻ���
				str1 =	str1.replaceAll(reg,"******");  //�����е��ֻ����滻����********
				System.out.println("�滻������ӣ�"+ str1);
	}
	
	//ʹ��������ʽ �滻���ظ����ַ�
	public static void Replace1(){
		String name="jjeeeeeeerrrrrrryyyyy";
		String Newname=name.replaceAll("(.)\\1+","$1");
		System.out.println(Newname);
		
	} 
}
