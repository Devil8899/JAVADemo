/*
ֵ����


ֵ����: ����һ��������ʱ�򣬴��ݸ������Ĳ��� ��ʵ���ϴ��ݱ������洢��ֵ��


*/
import java.util.*;
class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        int c=10;
        System.out.println(c); //10  ����һ��ֵ��������������ı�֮ǰ�ı���c
        int[] arr = {23,10,9}; //������ ����һ�ݵ�ַ������ �ı��ı�֮ǰ�ı���ֵ
		changeArr(arr,1,2);
		System.out.println("����Ԫ�أ�"+ Arrays.toString(arr));//23, 9 ,10
		System.out.println("�����length��"+arr.length);
	}
    public static int changeValue(int c){
		 c+=10;
		System.out.println(c);
	    return c; //20  
	}


   //����2�� ����һ�������������������� Ԫ�ص�λ�á�
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
