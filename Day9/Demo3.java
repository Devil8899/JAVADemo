/*�ӿ�


�ӿڣ���չ���ܵġ�  usb�ӿ�.����


�ӿڵĶ����ʽ��
	
	interface �ӿ���{
	
	}

�ӿ�Ҫע������� ��
	1. �ӿ���һ��������ࡣ
	2. �ӿڵĳ�Ա����Ĭ�ϵ����η�Ϊ�� public static final ����ôҲ����˵�ӿ��еĳ�Ա�������ǳ�������������ʱ�͸�ֵ��
	3. �ӿ��� �ķ������ǳ���ķ�����Ĭ�ϵ����η�Ϊ�� public abstract��
	4. �ӿڲ��ܴ�������
	5. �ӿ���û�й��췽���ġ�
	6. �ӿ��Ǹ���ȥʵ��ʹ�õģ��ǳ�����ʵ��һ���ӿڵ�ʱ�򣬱���Ҫ�ѽӿ������з���ȫ��ʵ�֡�

�ӿڵ����ã�
	1. ����Ľ��  ������ϣ�
	2. ����Լ���淶��
	3. ��չ���ܡ�

ʵ�ֽӿڵĸ�ʽ��

	class  ���� implements �ӿ���{
	
	}


����ӿ�֮���ϵ�� ʵ�ֹ�ϵ��

����ӿ�Ҫע������
	1. �ǳ�����ʵ��һ���ӿ�ʱ������Ҫ�ѽӿ������з���ȫ��ʵ�֡�
	2. ������ʵ��һ���ӿ�ʱ������ʵ��Ҳ���Բ�ʵ�ֽӿ��е� ������
	3. һ�������ʵ�ֶ���ӿ� ��
		
		���ʣ� javaΪʲô��֧�ֶ�̳У���֧���˶�ʵ���أ�
			class A{
				
				public void print(){
					System.out.println("AAAAAA");
				}
			}

			class B{

				public void print(){
					System.out.println("BBBBBB");
				}
			}


			class C extends A ,B{
			
			}
			
			new C().print();
	
�ӿ���ӿ�֮���ϵ�� �̳й�ϵ��

�ӿ���ӿ�֮��Ҫע�����
	1. һ���ӿ��ǿ��Լ̳ж���ӿڵġ�



*/

//����ӿ�
interface book
{
   String name="�������";
   void books();

}

interface book2
{
 void  read();
}

//�ӿ���ӿ�֮���Ǽ̳й�ϵ
interface student
{
   void print();
}
interface person extends student
{

}


//�̳нӿ�
class test implements book,book2  //�̳ж���ӿ�
{
   public void books(){   //ʵ�ֽӿڵķ���
    System.out.println("������һ�������������");
   }
   public void read(){
       System.out.println("wo���ڶ���");
   }
}

//�̳нӿ�
class test2 implements person
{
   public void print(){   //�����Ǽ̳�  �����ķ���Ȩ�޲��ܵ��ڸ��෽���ķ���Ȩ��
	 System.out.println("��ӡһ������"); 
	}

}

//������ ��ӿڵļ̳й�ϵ
abstract class test3 implements person
{
   //����ʵ��print����  ����̳г��������ֱ�ӵ���  ���߲�ʵ��
   public void print(){
    	 System.out.println("������ʵ��һ�� �ӿڵ� ��ӡ����"); 

   }
}
//����̳г�����
class children extends test3
{
   public   void  print(){
	   super.print();   //���ø���Ĵ�ӡ����
	  // System.out.println("��д�˸����һ����ӡ����");
	}
}


class Demo3 
{
	public static void main(String[] args) 
	{
	      new test().books();
		  new test().read();
		  new test2().print();
		  //test3.print();   ���������ʵ�ֵĽӿڷ��������� �����Ǿ�̬����
		  new children().print();
	} 
}
