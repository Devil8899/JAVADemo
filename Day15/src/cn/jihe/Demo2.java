package cn.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

------| Collection �������ϵĸ��ӿ�
----------| List  �����ʵ���� List�ӿڵļ����࣬�ü�����߱� ���ص㣺 ���򡢿��ظ���
----------| Set   �����ʵ����Set�ӿڵļ����࣬�ü��Ͼ߱����ص㣺 ���򣬲��� �ظ���
 
Collection---�����ķ�����
	toArray() 
	iterator()
	
	
�����������ã���������ץȡ�����е�Ԫ�ء�


�������ķ�����
	hasNext()   ���Ƿ���Ԫ�ؿɱ����������Ԫ�ؿ��Ա���������true�����򷵻�false ��
          	
 	next()    ���ص�������һ��Ԫ��...
    
      	  
 	remove()  �Ƴ����������һ�η��� ��Ԫ�ء�


NoSuchElementException û��Ԫ�ص��쳣�� 
���ֵ�ԭ�� û��Ԫ�ؿ��Ա������ˡ�����
	
	
 */
public class Demo2 {

	public static void main(String[] args) {
	     //����һ������
         Collection con=new ArrayList();
         con.add("jerry");
         con.add("tom");
         con.add("eason");
         
         //��ȡ����������Ԫ��  ����1
         Object[] arr=con.toArray();  // toArray()  �Ѽ��� ��Ԫ�ش洢��һ�� Object�������� ���ء�
         for(int i = 0 ; i<arr.length ; i++){
 			System.out.print(arr[i]+",");
 		}
        System.out.println("________________________________");
        //2.//Ҫ��ʹ��iterator������������
         Iterator it = con.iterator();  
         //����һ��������    ���ʣ�iterator()�������ص���һ���ӿ����ͣ�Ϊʲô�ӿ��ֿ��Ե��÷�������ʹ���أ�
 		//iterator ʵ�� �Ϸ��ص���iterator�ӿڵ�ʵ�������
//        System.out.println("���ϵ���һ��Ԫ��"+  it.next());
//        System.out.println("���ϵ���һ��Ԫ��"+  it.next());   
//        System.out.println("���ϵ���һ��Ԫ��"+  it.next());
         
// 		while(it.hasNext()){ // hasNext() ���Ƿ���Ԫ�ؿ��Ա�����
// 			System.out.println("Ԫ�أ�"+ it.next()); //��ȡԪ��
// 		}
 		
//         //��ռ��� ��Ԫ��
//		while(it.hasNext()){
//			it.next();
//			it.remove();
//		}
		System.out.println("���ϵ�Ԫ�أ�"+ con);
		
		
 		
 		
 		
         
	}

}
