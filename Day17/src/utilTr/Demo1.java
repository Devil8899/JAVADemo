package utilTr;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

/*
���� ����һ��TreeMap�����洢���������ֵ�洢�����ַ����� ������ĳ��������������

 */
class Book implements Comparable<Book>{
	
	/*//��д�ȽϷ���  �����ַ�����compareTo����
	@Override
	public int compareTo(Book o) {
		//�õ�ǰʵ���� Stardate�ֶκʹ���ıȽ��ֶ� ���Ա�
		return this.Strdate.compareTo(o.Strdate);
	}*/
	

	

	String name;     //����
	String Strdate; //��������	
	
	
	//תΪDate  ����date���бȽ�
	@Override
	public int compareTo(Book o) {
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		Date date2 = null;
		try {
			date1 =simp.parse(this.Strdate);
			date2 =simp.parse(o.Strdate);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return date1.compareTo(date2);
	}


     
	public Book(String name, String strdate) {
		super();
		this.name = name;
		Strdate = strdate;
	}

    //��дtoString����	
	@Override
	public String toString() {
		
		return "[������ "+this.name+" �������ڣ� "+this.Strdate+"] ";
	}
	
	
	
}
//ctrl + Alt +down
public class Demo1 {
	
	public static void main(String[] args) {
		//TreeMap �Դ�������  ��������ӵĶ���û������  Ҫ�Լ���дʵ��
		TreeMap<Book, String>  map = new TreeMap<Book, String>();  //ֵ�洢����
	    map.put(new Book("�ܲ�ʥ��", "1998-01-01"),"1");
	    map.put(new Book("���ִ�", "2001-01-01"),"2");
	    map.put(new Book("ƽ��������", "2003-01-01"),"3");
		
		System.out.println(map);
	}

}