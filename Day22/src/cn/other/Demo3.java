package cn.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 �������������� : �������������� ��Ҫ������������д�������Ϣ���ȡ�������Ϣ�� ������Ϣһ��д���ļ�����ô�������Ϣ�Ϳ��������־û���
 
 ������������ ObjectOutputStream ��
 
�����������: ObjectInputStream ��
 
 
 ObjectOutputStream��ʹ�ò��裺
 	
 
 �������������Ҫע���ϸ�ڣ�
 	1. ���������Ҫ��д�����ļ��ϣ���ô���������������Ҫʵ��Serializable�ӿڡ� Serializable�ӿ�û���κεķ�������һ����ʶ�ӿڶ��ѡ�
 	2. ����ķ����л����������ʱ�򲢲�����õ����췽���ġ�
 	3. serialVersionUID �����ڼ�¼class�ļ��İ汾��Ϣ�ģ�serialVersionUID���������ͨ��һ�������������Ա�������������������һ�����֡�
 	4. ʹ��ObjectInputStream�����л���ʱ��ObjeectInputStream���ȶ�ȡ�ļ��е�serialVersionUID��Ȼ���뱾�ص�class�ļ���serialVersionUID
 	���жԱȣ����������id��һ�£���ô�����л���ʧ���ˡ�
 	5. ������л��뷴���л���ʱ����ܻ��޸���ĳ�Ա����ô���һ��ʼ�͸������ָ��һ��serialVersionUID�����һ���Ѿ�ָ����serialVersionUID��Ȼ��
 	�����л��뷴���л���ʱ��jvm���������Լ������ class��serialVersionUID�ˡ�
 	6. ���һ������ĳ�����ݲ��뱻���л���Ӳ���ϣ�����ʹ�ùؼ���transient���Ρ�
 	7. ���һ����ά��������һ��������ã���ô����һ����Ҳ��Ҫʵ��Serializable�ӿڡ�
 	8.�����඼ʵ����Serializable�ӿ�
 */
public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO �Զ����ɵķ������
		//WriteObj();
		ReadObj();
	}

	// ����������
	public static void WriteObj() throws IOException,FileNotFoundException{
		File file=new File("D:\\liuz\\JAVADemo\\obj.txt");
		//�����������������
		FileOutputStream fout=new FileOutputStream(file);	
		//������������������
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Home home=new Home(1, "beijing");
		user u=new user("zhangsan","asdqwe",home);
		//�������
		objout.writeObject(u);
		objout.close();	
	}
	
	//����������
	public static void ReadObj() throws IOException, ClassNotFoundException{
		File file=new File("D:\\liuz\\JAVADemo\\obj.txt");
		//������������������
		FileInputStream fint=new FileInputStream(file);	
		//�������������������
		ObjectInputStream objout=new ObjectInputStream(fint);
		//��ȡ����
		user u=(user)objout.readObject();  ////��������϶�Ҫ������������ ��class�ļ���
		objout.close();
		System.out.println("��ӡ"+u);
	}


}

//�����л�����  ����ʵ������ӿ�Serializable  ����ӿ�û���κη���  �������еļ����඼ʵ��������ӿ�    ��ʶ�ӿ�
class user implements Serializable{
	/**
	ָ��serialVersionUID����Ϊ ����������� �޸Ķ����Ա  ��ʱ�����ȡ���������� �ᱨ��
	����ָ��serialVersionUID�� ���ᱨ����  jvm���������Լ������ class��serialVersionUID�ˡ�
	 */
	
	private static final long serialVersionUID = 126302467574898885L;  //ָ��serialVersionUID
	String name;
	String passwrod;
	int age;
	transient String mobile;  //͸��  ���л�ʱ����д�뵽Ӳ��
	Home  home;           //������ά����һ�������
	
	
	public user(String name,String password,Home home){
		this.name=name;
		this.passwrod=password;	
		this.home=home;
		System.out.println("���ù��췽��");
	}


	@Override
	public String toString() {
		return "�û���"+this.name+"����"+this.passwrod+"����"+this.age;
	}	
}
//ͬ����Ҫʵ��Serializable �ӿ�
class Home implements Serializable {
	int id;
	String city;
	public Home(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	
	
}










