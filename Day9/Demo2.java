/*
值交换


值传递: 调用一个方法的时候，传递给方法的参数 ，实际上传递变量所存储的值。


*/
import java.util.*;
class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        int c=10;
        System.out.println(c); //10  复制一份值传给方法并不会改变之前的变量c
        int[] arr = {23,10,9}; //对象是 复制一份地址给方法 改变会改变之前的变量值
		changeArr(arr,1,2);
		System.out.println("数的元素："+ Arrays.toString(arr));//23, 9 ,10
		System.out.println("数组的length："+arr.length);
	}
    public static int changeValue(int c){
		 c+=10;
		System.out.println(c);
	    return c; //20  
	}


   //需求2： 定义一个函数交换数组中两个 元素的位置。
	public  static void changeArr(int[] arr , int index1,  int  index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	
	}
}


class test
{
   int a ;
   int b;



}
