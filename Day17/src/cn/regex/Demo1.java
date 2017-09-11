package cn.regex;
//������ʽ  ����һ�������ַ�����һ������,������ʽ�Ĺ���ʹ������ķ��ű�ʾ


/*Ԥ�����ַ��� 
 String.matches() ���������Ҫ�Ƿ����Ƿ�ƥ��ָ�����ַ��������ƥ����Ϊtrue,����Ϊfalse;
. 	�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
\d 	���֣�[0-9] 
\D 	�����֣� [^0-9] 
\s 	�հ��ַ���[ \t\n\x0B\f\r] 
\S 	�ǿհ��ַ���[^\s] 
\w 	�����ַ���[a-zA-Z_0-9] 
\W 	�ǵ����ַ���[^\w]

Greedy ������
X ?	X��һ�λ�һ��Ҳû��    ���Ŵ���һ�λ�һ��Ҳû��
X *	X����λ���
X +	X��һ�λ���
X {n}	X��ǡ��n��
X {n,}	X������n��
X {n,m}	X������n�Σ����ǲ�����m��


��Χ��ʾ
[abc]	a��b �� c�����ࣩ 
[^abc]	�κ��ַ������� a��b��c���񶨣� 
[a-zA-Z]	a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
[a-d[m-p]]	a �� d �� m �� p��[a-dm-p]�������� 
[a-z&&[def]]	d��e �� f�������� 
[a-z&&[^bc]]	a �� z������ b �� c��[ad-z]����ȥ�� 
[a-z&&[^m-p]]	a �� z������ m �� p��[a-lq-z]����ȥ��
ע��
��Χ�����������ж೤��û�������ʵ���϶�ֻ��ƥ��һ���ַ�����

�߽�ƥ����
\b
$
*/


public class Demo1 {

	public static void main(String[] args) {
		System.out.println("�Ƿ������ַ�"+"a".matches("."));
		System.out.println("�Ƿ�����"+"1".matches("\\d"));   
		System.out.println("������"+"%".matches("\\D"));
		System.out.println("�հ��ַ�"+"\r".matches("\\s"));
		System.out.println("�ǿհ��ַ�"+"^".matches("\\S"));
		System.out.println("�����ַ�"+"a".matches("\\w"));
		System.out.println("�ǵ����ַ�"+"%".matches("\\W"));
       System.out.println("_____________________________________________________");
		// ������ ���Ƴ��ֵĴ���
		System.out.println("a".matches("."));
		System.out.println("a".matches("a"));
		System.out.println("? һ�λ�һ��Ҳû��" + "1".matches("\\d?"));
		System.out.println("* ��λ��߶��" + "2111".matches("\\d*"));
		System.out.println("+ һ�λ���" + "".matches("\\d")); // +����ƥ������
		// ����һ�λ��γ������� û�г���
		// ����false													
		System.out.println("{}ǡ��n��" + "100".matches("\\d{3}")); // ǡ�����ֳ���3��
		System.out.println("{n,}���ٳ���N��" + "12345".matches("\\d{5,}"));// ���ٳ���n��
		System.out.println("{n,m}����n�Σ����ǲ�����m��" + "12".matches("\\d{1,2}"));// ����n�Σ����ǲ�����m��
		System.out.println("��Χ��ʾ_____________________________________________________");
		
		System.out.println("abc".matches("[abc]")); // ע�� ֻ��ƥ��a�ַ� ��Ϊû�б�������
		System.out.println("��ȫƥ��abc3���ַ�" + "abc".matches("[abc]{3}"));// ��ȫƥ��abc3���ַ�
		System.out.println("a".matches("[^abc]")); // �ų�abc �����abc��һ�� ����false
		System.out.println("�ַ�������a-z���дA-Z֮��" + "a".matches("[a-zA-z"));// a-zA-z�м�ƥ��һ��
	     
	} 

}
