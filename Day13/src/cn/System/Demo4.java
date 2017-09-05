package cn.System;
/*
Math 数学类， 主要是提供了很多的数学公式。

abs(double a)  获取绝对值
ceil(double a)  向上取整
floor(double a)  向下取整
round(float a)   四舍五入
random()   产生一个随机数. 大于等于 0.0 且小于 1.0 的伪随机 double 值

*/

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(Math.abs(-3));
    System.out.println(Math.ceil(5.14));
	System.out.println(Math.floor(6.92));
	System.out.println(Math.round(9.99));
	System.out.println(Math.random()); //random()   产生一个随机数. 大于等于 0.0 且小于 1.0 的伪随机 double 值	
	}

}
