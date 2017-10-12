package cn.System;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 
日期类 Date 
Date 类封装的是系统的当前时间.。但是Date已经过时了，sun推荐使用Calendar类。
Calendar: 该类是一个日历的类，封装了年月日时分秒时区。
日历类：Calendar
日期格式化类    SimpleDateFormat

		// 显示 当前系统时间: 2014年12月26日  xx时xx分xx秒   
		
		 *  日期格式化类    SimpleDateFormat  2个常用的方法
		 *  		作用1： 可以把日期转换转指定格式的字符串     format()
		 *  		作用2： 可以把一个 字符转换成对应的日期。    parse()  
		 *  	
		 */

public class Demo3 {

	 public static void main(String[] args) throws  ParseException {
		// TODO Auto-generated method stub
		Date date = new Date(); // 获取当前的系统时间
//		System.out.println("老方法+年份："+ date.getYear());
	    System.out.println("___________________________________________");
		Calendar calendar = Calendar.getInstance(); //获取当前的系统时间。
		System.out.println("年："+ calendar.get(Calendar.YEAR));
		System.out.println("月："+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("日："+ calendar.get(Calendar.DATE));
		
		System.out.println("时："+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分："+ calendar.get(Calendar.MINUTE));
		System.out.println("秒："+ calendar.get(Calendar.SECOND));
		
		/*//日期格式化
		Date date2 = new Date(); //获取当前的系统时间。
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss") ; //使用了默认的格式创建了一个日期格式化对象。
		String time = dateFormat.format(date2);  //可以把日期转换转指定格式的字符串
		System.out.println("当前的系统时间："+ time);
		
		//字符串转日期  字符串格式 必须与格式化时间一致； 
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy@MM@dd日   HH+mm+ss") ; //使用了默认的格式创建了一个日期格式化对象。
		String Da="2017@08@16日   19+30+123";
		
		Date date3=dateFormat2.parse(Da);  //此方法可能会抛异常  所以方法体要提前声明throws 
		System.out.println(date3);*/
		
	}

}
