package cn.System;

import java.io.IOException;

/*
 ����ʵ����
RunTime   ��������Ҫ������Ӧ�ó������еĻ�����
	
	getRuntime()          ���ص�ǰӦ�ó�������л�������
	exec(String command)  ����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ���
	freeMemory()          ���� Java ������еĿ����ڴ������� ���ֽ�Ϊ��λ
	maxMemory()           ���� Java �������ͼʹ�õ�����ڴ�����
	totalMemory()         ���� Java ������е��ڴ�����
	
	

*/
public class Demo2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		//��Ϊ���಻��ʵ���� ����ģʽ ͨ����̬������ȡʵ��
		Runtime run =Runtime.getRuntime();
		//run.exec("C:\\Windows\\notepad.exe");   //����һ������
		Process pro=run.exec("C:\\Windows\\notepad.exe");  //�˷�������һ������
		Thread.sleep(5000);   //��ǰ����ֹͣ5��
		pro.destroy();        //destroyɱ���ӽ���
		System.out.println(" Java������еĿ����ڴ�����"+run.freeMemory());
		System.out.println("Java �������ͼʹ�õ�����ڴ���:"+ run.maxMemory());
		System.out.println("���� Java ������е��ڴ�����:"+ run.totalMemory());
	}
}
