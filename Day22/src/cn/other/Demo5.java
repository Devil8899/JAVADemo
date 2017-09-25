package cn.other;
import java.io.*;
import java.util.Properties;
/*
properties �����
���� ʹ��propertiesʵ�ֱ����ֻ�� �������Σ�����������֮�����ʾ�������棬��jvm.

*/
public class Demo5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO �Զ����ɵķ������
		File file = new File("D:\\liuz\\JAVADemo\\count.properties");
		if(!file.exists()){
			//��������ļ������ڣ��򴴽��������ļ�
			file.createNewFile();
		}
		
		//����Properties����
		Properties properties = new Properties();
		//�������ļ�����Ϣ���ص�properties��
		properties.load(new FileInputStream(file));  //�ֽ�����ȡ  ���������ʹ���ַ���
		FileOutputStream fileOutputStream = new FileOutputStream(file);

		int count = 0; //����ñ��������ڱ�����������д����ġ�
		//��ȡ�����ļ������д���
		String value = properties.getProperty("count");
		if(value!=null){
			count = Integer.parseInt(value);
		}
		
		//�ж�ʹ�õĴ����Ƿ��Ѿ��ﵽ�����Σ�
		if(count==3){
			System.out.println("���Ѿ����������ô������빺�������������");
			System.exit(0);
		}

		count++;
		System.out.println("���Ѿ�ʹ���˱������"+count+"��");
		properties.setProperty("count",count+"");
		//ʹ��Properties����һ�������ļ�
		properties.store(fileOutputStream,"runtime");
		
	}

}
