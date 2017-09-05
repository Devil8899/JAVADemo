package cn.System;

import java.util.Arrays;
import java.util.Properties;

/*
System  系统类 主要用于获取系统的属性数据。  不能实例化
	
System类常用的方法：
	1.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 一般
		src - 源数组。
		srcPos - 源数组中的起始位置。
		dest - 目标数组。
		destPos - 目标数据中的起始位置。
		length - 要复制的数组元素的数量。
		
	2. currentTimeMillis()  返回当前时间以毫秒为单位。       重点
	3. exit(int status)     退出jvm  如果参数是0表示正常退出jvm，非0表示异常退出jvm。    一般
    4. gc()                 建议jvm赶快启动垃圾回收期回收垃圾。
	5. getenv(String name)  根据环境变量的名字获取环境变量。
	6. getProperty(key)     获取指定的键指示的系统属性。 
	
	
		
	finalize()  如果一个对象被垃圾回收器回收的时候gc方法，会先调用对象的finalize()方法。
*/
public class Demo1 {

	public static void main(String[] args) {
		// 1.arraycopy
		int[] srcArr = { 10, 12, 14, 16, 19 };
		// 把srcArr的数组元素拷贝 到destArr数组中。
		int[] destArr = new int[4];

		System.arraycopy(srcArr, 1, destArr, 0, 4);
		//2. System.exit(0); //jvm退出.. 注意： 0或者非0的 数据都可以退出jvm。对于用户而言没有任何区别。
		System.out.println("目标数组的元素：" + Arrays.toString(destArr)); // 0 14 16 0
		System.out.println("当前的系统时间：" + System.currentTimeMillis());//毫秒
		System.out.println("环境变量：" + System.getenv("JAVA_HOME")); // 获取环境变量
        //3.gc 方法运行 看回收效果
		for (int i = 0; i < 4; i++) {
			new person("jerry"+i);
			System.gc();
		}
		//4.获取系统的所有属性。
		Properties properties = System.getProperties();  //获取系统的所有属性。
		properties.list(System.out);
		System.out.println("___________________________");
		System.out.println(System.getProperty("os.name"));  //打印系统版本 参数传一个key
	}

}

 class person {
	String name;

	// 构造函数
	public person(String name) {
		this.name = name;
	}

	// 重写 运行gc方法前  会先运行Object的finalize方法      finalize是Object下的方法
	// 快速重写方法   source-->Oveeride/Implements Methods
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name+"被回收了..");
		
	}

}
