/*

this�ؼ��ִ��������������ĵ����߶���
this�ؼ������ã�
	1. �������ͬ����Ա������ֲ�����ʱ���ڷ����ڲ�Ĭ���Ƿ��ʾֲ����������ݣ�����ͨ��this�ؼ���ָ�����ʳ�Ա���������ݡ�
	2. ��һ�����캯���п��Ե�������һ�����캯����ʼ������


this�ؼ��ֵ��������Ĺ��캯��Ҫע������
	1. this�ؼ��ֵ��������Ĺ��캯��ʱ��this�ؼ��ֱ���Ҫλ�ڹ��캯���� �ĵ�һ����䡣 ****  ����ҪŶ
	2. this�ؼ����ڹ��캯���в��ܳ����໥���� ���������Ϊ��һ����ѭ����

this�ؼ���Ҫע�����
	1. ����ͬ���ĳ�Ա������ֲ�����ʱ���ڷ������ڲ����ʵ��Ǿֲ�����(java ��ȡ���ǡ��ͽ�ԭ�򡱵Ļ��Ʒ��ʵġ�)
	2. �����һ�������з�����һ���������ñ���ֻ���ڳ�Ա����������£���ôjava���������ڸñ����� ǰ�����this�ؼ��֡�


*/

class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		car C=new car("�µ�",100000);
		//ʹ�ù��캯����ʼ������
		System.out.println("����Ʒ��"+C.name+"�����۸�"+C.Money);     //����Ʒ��null�����۸�0.0  
		C.printMsg();  //�ֲ�������nameֵ  ����
        C.printCarName();

		Computer Comp=new Computer("Lenovo",30,40);
		System.out.println("����Ʒ��"+Comp.Logo+"�ߴ�"+Comp.Wight+Comp.height);

	}
}



class car
{
  String name;
  double Money;

//���캯��
 car(String name,double Money){   //�β�Ĭ��Ҳ��һ�־ֲ�����
   name=name;        //����name�൱�ھֲ����� ����nameΪ�ֲ�����name��ֵ  ������Ϊ��Ա����name��ֵ
   this.Money=Money; //��this ������Ϊ��ǰ����ĳ�Ա����Money ��ֵ 

 }


  void printMsg(){
    String name="����";  //�ֲ����� �������ͽ�ԭ��
	System.out.println(name);
  
  }

//this�ؼ��ִ��������������ĵ����߶���
  void printCarName(){
   System.out.println(this.Money);  //����this  ��������Ĭ�ϼ�һ��this
  }
}

//this ���ù��캯��
class Computer
{
   String Logo;
   int Wight;
   int height;

   Computer(String logo,int Wight,int height){
     this(height);  //����һ����һ�������Ĺ��캯����
	 this.Logo=logo;
	 this.Wight=Wight;
     

   
   }

  Computer(int height){
    this.height=height;
  }

 //Ĭ����һ���޲εĹ��캯��������Լ�д���в����Ĺ��캯���Ḳ�ǵ��޲Σ�����Ҫдһ���޲εĹ��캯��
}