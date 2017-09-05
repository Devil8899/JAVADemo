package cn.System;

import java.util.Arrays;
import java.util.Properties;

/*
System  ϵͳ�� ��Ҫ���ڻ�ȡϵͳ���������ݡ�  ����ʵ����
	
System�ೣ�õķ�����
	1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) һ��
		src - Դ���顣
		srcPos - Դ�����е���ʼλ�á�
		dest - Ŀ�����顣
		destPos - Ŀ�������е���ʼλ�á�
		length - Ҫ���Ƶ�����Ԫ�ص�������
		
	2. currentTimeMillis()  ���ص�ǰʱ���Ժ���Ϊ��λ��       �ص�
	3. exit(int status)     �˳�jvm  ���������0��ʾ�����˳�jvm����0��ʾ�쳣�˳�jvm��    һ��
    4. gc()                 ����jvm�Ͽ��������������ڻ���������
	5. getenv(String name)  ���ݻ������������ֻ�ȡ����������
	6. getProperty(key)     ��ȡָ���ļ�ָʾ��ϵͳ���ԡ� 
	
	
		
	finalize()  ���һ�������������������յ�ʱ��gc���������ȵ��ö����finalize()������
*/
public class Demo1 {

	public static void main(String[] args) {
		// 1.arraycopy
		int[] srcArr = { 10, 12, 14, 16, 19 };
		// ��srcArr������Ԫ�ؿ��� ��destArr�����С�
		int[] destArr = new int[4];

		System.arraycopy(srcArr, 1, destArr, 0, 4);
		//2. System.exit(0); //jvm�˳�.. ע�⣺ 0���߷�0�� ���ݶ������˳�jvm�������û�����û���κ�����
		System.out.println("Ŀ�������Ԫ�أ�" + Arrays.toString(destArr)); // 0 14 16 0
		System.out.println("��ǰ��ϵͳʱ�䣺" + System.currentTimeMillis());//����
		System.out.println("����������" + System.getenv("JAVA_HOME")); // ��ȡ��������
        //3.gc �������� ������Ч��
		for (int i = 0; i < 4; i++) {
			new person("jerry"+i);
			System.gc();
		}
		//4.��ȡϵͳ���������ԡ�
		Properties properties = System.getProperties();  //��ȡϵͳ���������ԡ�
		properties.list(System.out);
		System.out.println("___________________________");
		System.out.println(System.getProperty("os.name"));  //��ӡϵͳ�汾 ������һ��key
	}

}

 class person {
	String name;

	// ���캯��
	public person(String name) {
		this.name = name;
	}

	// ��д ����gc����ǰ  ��������Object��finalize����      finalize��Object�µķ���
	// ������д����   source-->Oveeride/Implements Methods
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name+"��������..");
		
	}

}
