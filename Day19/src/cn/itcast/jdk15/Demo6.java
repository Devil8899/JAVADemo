package cn.itcast.jdk15;
/*
jdk1.5������֮-----ö��

���⣺ĳЩ���������յ����ݱ������ڹ̶���Χ֮�ڵģ� 

�������1�� ��ʱ�����ǵĽ�����������Զ���һ����,Ȼ����˽�л����캯�������Զ������д�������Ķ������ʹ�á�

jdk1.5����������������µĽ�������� ����ʹ��ö��������

һЩ����������ʱ������Ҫ�����ݲ���������ģ���������һ����Χ�ڵ�ֵ��Java5�Ժ����ֱ��ʹ��ö�����Խ����
	���磺 ���� , �Ա� �� ���� �� ����......


*/

/*
//�Զ���һ���Ա���
class Gender{
	
	String value;
	
	public static final Gender man = new Gender("��");
	
	public static final Gender woman = new Gender("Ů");
	

	private Gender(String value) {
		this.value = value;
	}
}
*/
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonL per = new PersonL("tom", Gender.man);
//		per.setName("jerry");
//		per.setGender("��");
		System.out.println(per.getGender().sex);  //���ַ�ʽ
	}

}

class PersonL {
	private String Name;
	private Gender GenderN;
    //��װ�ֶ�
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Gender getGender() {
		return GenderN;
	}

	public void setGender(Gender gender) {
		GenderN = gender;
	}
	// ���캯��
	public PersonL(String name, Gender gender) {
		super();
	this.Name = name;
	this.GenderN = gender;
	}
}

//���캯��˽�л�
class Gender{
	String sex;
	public static Gender man=new Gender("��");
	public static Gender woman=new Gender("Ů"); 
	private Gender(String value) {
		this.sex = value;
	}
}
