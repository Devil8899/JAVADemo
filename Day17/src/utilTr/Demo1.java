package utilTr;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

/*
需求： 定义一个TreeMap，键存储的是书对象，值存储的是字符串。 根据书的出版出版日期排序。

 */
class Book implements Comparable<Book>{
	
	/*//重写比较方法  利用字符串的compareTo排序
	@Override
	public int compareTo(Book o) {
		//拿当前实例的 Stardate字段和传入的比较字段 做对比
		return this.Strdate.compareTo(o.Strdate);
	}*/
	

	

	String name;     //书名
	String Strdate; //出版日期	
	
	
	//转为Date  利用date进行比较
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

    //重写toString方法	
	@Override
	public String toString() {
		
		return "[书名： "+this.name+" 出版日期： "+this.Strdate+"] ";
	}
	
	
	
}
//ctrl + Alt +down
public class Demo1 {
	
	public static void main(String[] args) {
		//TreeMap 自带排序功能  他自身添加的对象没有排序  要自己手写实现
		TreeMap<Book, String>  map = new TreeMap<Book, String>();  //值存储书名
	    map.put(new Book("跑步圣经", "1998-01-01"),"1");
	    map.put(new Book("白轮船", "2001-01-01"),"2");
	    map.put(new Book("平凡的世界", "2003-01-01"),"3");
		
		System.out.println(map);
	}

}