package cn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 ������Ҫʹ�õĶ���
 Pattern(�������);
 Matcher(ƥ��������);

ƥ����Ҫʹ�õ��ķ���
1.find()   ֪ͨƥ����ȥƥ���ַ��������ҷ��Ϲ�����ַ����� ����ҵ����Ϲ�����ַ��� ����true ���򷵻�false;
2.group()  ��ȡ���Ϲ�����ַ�����

ע��  ʹ��group������ʹ��һ��Ҫ������find�ķ������ҷ��Ϲ�����ַ��������򱨴�



 * */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="hi my Name is lilei";
            String reg="\\b[a-zA-Z]{2}\\b";  //ƥ�����е��ʳ���Ϊ2;  ��\\b �Ǳ߽�ƥ����
            //�Ȱ��ַ�������������Pattern�Ķ���;
            Pattern p=Pattern.compile(reg);
            //ʹ���������ƥ���ַ������ڲ���һ��Matcher����
            Matcher m=p.matcher(str);
            //Matcher  ���÷��� find()  group() ��������
//            System.out.println("�Ƿ�ƥ��2����ĸ����:"+  m.find());  //����bool
//            System.out.println("���ҵ��ĵ�����ʲô:"+  m.group());  //����ƥ��ĵ���
            System.out.println("_____________________________________________");
            while(m.find()){
            	System.out.println(m.group());
            }
            System.out.println("_____________________________________________new");
            getEamil();
            
	}
	
   //ƥ���������� ���������ַ
   public static void getEamil(){
	   String str="�����ַ�� 110aa23@qq.com �����ַ�� 11023@163.com �����ַ�� 11023@soft.com "
	   		+ "�����ַ�� 11023@biye.com.cn�����ַ�� 11023ww@126.net�����ַ�� "
	   		+ " 11023@nba.cn�����ַ�� 1s@qq.com";
	   String reg="[a-zA-Z1-9]\\w+@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
//	   String reg="[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
	    //ƥ�����
	   //��1λ a �� z �� A �� Z 1-9  
	   //��2λ \w  �����ַ� ��Χ��[a-zA-Z_0-9] 
	   //��3λ +   �����ַ����ܳ���һ�λ���
	   //Nλ @����
	   //@���ź������ ���ַ� ��Χ��[a-zA-Z_0-9]  ����2λ �� @qq @163
	   //.ʵ������ĵ�� ƥ�����\\. 
	   //��ź��������net ���� cn  ���� com  �м���|���� ���ߵ���˼
	   //(\\.(com|cn|net)){1,2} ��˼�ǿ��ܻ����1�λ���2�Ρ�
	   
	   
	   //�Ȱ��ַ�������������Pattern�������;
       Pattern p=Pattern.compile(reg);
       //ʹ���������ƥ���ַ������ڲ���һ��Matcherƥ��������
       Matcher m=p.matcher(str);
       while(m.find()){
    	   System.out.println(m.group());
       }	   
   }
	

}
