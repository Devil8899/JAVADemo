package cn.itat;
/*
  java�������������ԣ�����˼�룺���ʺ� �Ķ������ʺ� �����飺
	
	��ʽһ���Զ����࣬Ȼ��ͨ���Զ�����ഴ������
	
	��ʽ����sun�ṩ�˺ܶ�������ʹ�ã�����ֻ��Ҫ��ʶ��Щ�࣬���ǾͿ���ͨ����Щ�ഴ�������ˡ�
	
Object������������ռ����ࡣ �κ�һ���඼�̳���Object�ࡣ


Object�ࣺ


Object�ೣ�õķ�����
	toString();     ���ظö�����ַ�����ʾ�� ����һ���ַ������������ö���ġ�
���ʣ� toString() �к����ã�	  ��дtoString֮������ֱ�����һ�������ʱ�򣬾ͻ������������������ĸ�ʽ���ݡ�
	
	equals(Object obj)   ���ڱȽ�����������ڴ��ַ���ж����������Ƿ�Ϊͬһ������
	
	hashCode()   ���ظö���Ĺ�ϣ��ֵ(��ҿ��԰ѹ�ϣ��� �����Ƕ�����ڴ��ַ)/


java�еĹ淶��һ��������д��һ�����equals���������Ƕ�����д����hashCode������



java�ǿ�Դ....Դ���빫��...

�鿴Դ����ķ�ʽ��
	��ʽһ�� ��סctrl������������Ҫ����Դ����.
	
	��ʽ�����ѹ���ƶ�������Ҫ�鿴���봦����F3.
	

Ϊʲô����Ҫ�鿴Դ���룺
	1���鿴Դ��������˽���������д����������ģ��������˽�ĸ��ӵ����롣
	2. ���մ�ţ��˼�롣

��Դ������ɻ��һ�㣺 ��Ҫÿ�д��붼Ū����ʲô��˼���ܿ������ �³�����˼�����ӡ�

 * */
public class Demo3 {
	public static void main(String[] args) {
		//Object ���÷��� 
		Object o = new Object();
		System.out.println(o.toString());  
		// java.lang.Object@18b3364    ���ص��ַ�����ʾ�� ��������+@+ ����Ĺ�ϣ��
		System.out.println(o);  
		// ͨ���鿴Դ�����֪��ֱ�����һ������ ��ʱ��ʵ������println�����ڲ��������� ���õ�toString�������Ѱ�toString�������ص����������
		//���ʣ� Ϊʲôֱ�����һ�������ʱ�����������toString�������ص��ַ��������һ�����أ�
		
		
		//��дObject ����
		car c=new car("����",100000);
		System.out.println(c);   //println���Զ�����toString������
		//��дequals ���� 
		car c2=new car("����",200000);
		System.out.println(c2.equals(c));   
	    //��дhashCode
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println("_____________________________");
		
		
		 father fa=new car("",1);  //��̬��ϰ
		 //�Ӹ������ͬ���Ǿ�̬���� Ĭ�ϵ��������ͬ������
		 fa.print();
	}
	
	//�жϼ̳��෽��
	public void printMsg(){
	   if (new Demo3() instanceof Object){   //Object ���� java.lang
		   System.out.println("Demo3 �̳���Object��");
	   }else{
		   System.out.println("Demo3 ���̳���Object��");
	   }
	}
	
	
	
}
//������
class car extends father {
	String name;
	int Money;
	//���췽��;
	public car(String name, int Money){
		this.name=name;
		this.Money=Money;	
	}
	//��дtoString����
	public String  toString(){
	 //return super.toString();    //���ø����toString()����;
	return "��ǰ������Ʒ���ǣ�"+this.name+" �۸���"+this.Money;	
	 
	}
	
	//��дequals ����   Ĭ�Ϸ����ǱȽ϶����ڴ��еĵ�ַ��
	public boolean  equals(Object obj){
		car c1=(car) obj;  //ǿ������ת��  ��������ĳ�Ա
		if(this.name ==c1.name){
			return true;
		}else return false;	
	}
	//��дhashCode����
	public int  hashCode(){
		return this.Money;	
	}
	
	//�����������ӡ����
	public void print(){
		System.out.println("����Ĵ�ӡ����");
		//super.print();
	}
	
}
class father{
	String Di="test1";
	public void print(){
		System.out.print("����Ĵ�ӡ����");
		
	}
	
}
