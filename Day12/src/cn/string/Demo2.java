package cn.string;
/*
String �Ĺ��췽����

	String()  ����һ�������� ���ַ�������
	String(byte[] bytes)  ʹ��һ���ֽ����鹹��һ���ַ�������
	String(byte[] bytes, int offset, int length)    //����ָ�����볤��
		bytes :  Ҫ���������
		offset�� ָ�����������Ǹ�����ֵ��ʼ���롣
		length����Ҫ������Ԫ�ء�
	
	String(char[] value)  ʹ��һ���ַ����鹹��һ���ַ�����	
	String(char[] value, int offset, int count)  ʹ��һ���ַ����鹹��һ���ַ����� ָ����ʼ������ֵ����ʹ���ַ�������
	String(int[] codePoints,int offset,int count)
	String(String original) 

��ס�� ʹ���ֽ���������ַ����鶼���Թ���һ���ַ�������


*/


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //1.���췽��
		String Str=new String("createString");
		System.out.println(Str);
	    //2.��һ���ֽ����鹹��һ���ַ�������
		byte[] car= {97,98,99};   ////ʹ��һ���ֽ����鹹��һ���ַ�������
		Str=new String(car);
		System.out.println(Str);
		//3.����ָ�����볤��
		Str = new String(car,1,2);   //ʹ��һ���ֽ����鹹��һ���ַ�������,ָ����ʼ���� ������ֵ�ͽ���ĸ�����
        System.out.println(Str);
        //4. ʹ��һ���ַ����鹹��һ���ַ�����
        char[] cnr={66,67,68};
        Str=new String(cnr);
        System.out.println(Str);
        //5. ʹ��һ���ַ����鹹��һ���ַ����� ָ����ʼ������ֵ����ʹ���ַ�������
        char[] cnr2={66,67,68};
        Str=new String(cnr2,1,2);  //�ӵڶ�����ʼ��ȡ
        System.out.println(Str);
        
    	String str = new String();
    	System.out.println("���ַ���"+str);
	}

}
