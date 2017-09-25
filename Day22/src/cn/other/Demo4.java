package cn.other;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


/*
Properties�������ļ��ࣩ: ��Ҫ�������������ļ����ȡ�����ļ�����Ϣ��


PropertiesҪע���ϸ�ڣ�
	1. ��������ļ�����Ϣһ��ʹ�������ģ���ô��ʹ��store�������������ļ���ʱ��ֻ��ʹ���ַ�����������ʹ���ֽ������������ļ��Ļ���
	Ĭ��ʹ�õ���iso8859-1�����б���洢����ʱ���������롣
	2. ���Properties�е����ݷ����˱仯��һ��Ҫ����ʹ��Properties���������ļ������������ļ���Ϣ���ᷢ���仯��
		
*/

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
//		creatProperties();
		readProperties();
	}
	
	//���������ļ��ļ�����Ϣ��
	public static void creatProperties() throws IOException{
		//����Properties
		Properties properties = new Properties();
		properties.setProperty("tom", "123");
		properties.setProperty("jerry","234");
		properties.setProperty("eason","345");
		properties.setProperty("����", "20");
		// ����Properties
		/*Set<Entry<Object, Object>> entrys = properties.entrySet();
		for(Entry<Object, Object> entry  :entrys){
			System.out.println("����"+ entry.getKey() +" ֵ��"+ entry.getValue());
		}*/
		
		//ʹ��Properties���������ļ�,��һ��������һ����������󣬵ڶ�������ʹ��һ���ַ���������������ļ�����Ϣ��
		//properties.store(new FileOutputStream("D:\\liuz\\JAVADemo\\persons.properties"), "haha"); 
		properties.store(new FileWriter("D:\\liuz\\JAVADemo\\persons.properties"), "first");
	}

	//��ȡ�����ļ�����Ϣ 
		public static void readProperties() throws IOException{
			//����Properties����
			Properties properties = new Properties();
			//���������ļ���Ϣ��Properties��
			properties.load(new FileReader("D:\\liuz\\JAVADemo\\persons.properties"));
			//����
			Set<Entry<Object, Object>> entrys = properties.entrySet();
			for(Entry<Object, Object> entry  :entrys){
				System.out.println("����"+ entry.getKey() +" ֵ��"+ entry.getValue());
			}
			//�޸Ĺ��޵�����
			//���޸ĺ��Properties������һ�������ļ�
			properties.setProperty("����", "007");
			properties.store(new FileWriter("D:\\liuz\\JAVADemo\\persons.properties"), "hehe");
			
			
		}
	
}
