/*

�������Ӧ�ó�����
	����������һ�������ʱ�򣬷��ָ�������ȷʵ������ĳ����Ϊ��
����������ΪĿǰ�ǲ�����ģ���ô���ǿ��Գ�ȡ������Ϊ ������������
��ȥʵ�ָ�����Ϊ����ʱ��������Ϊ���ǳ���Ϊ�������Ϊ�����Ǿ���Ҫʹ�ó����ࡣ

������ĺô�: ǿ��Ҫ������һ��Ҫʵ��ָ���ķ�����


������Ҫע���ϸ�ڣ�
	1. ���һ������û�з����壬��ô�ú�������Ҫʹ��abstract����,�Ѹú������γɳ��� �ĺ�������
	2. ���һ��������˳���ĺ�������ô����Ҳ���� ʹ��abstract���Ρ�
	3. ���һ���ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ȫ��ʵ�֡�
	4. ��������Դ��ڷǳ��󷽷���Ҳ���Դ��ڳ���ķ���.
	5. ��������Բ����ڳ��󷽷��ġ� 
	5. �������ǲ��ܴ�������ġ�
		���ʣ�Ϊʲô�����಻�ܴ��������أ�
		��Ϊ�������Ǵ��ڳ��󷽷��ģ�������ó����ഴ������Ļ�����ôʹ�ó���Ķ���
		���ó��󷽷���û���κ�����ġ�
	6. �������Ǵ��ڹ��캯���ģ��乹�캯�����ṩ�����ഴ�������ʱ���ʼ����������Եġ�

    7.�������ó�����ľ�̬���������?  ����ֱ������.����������
*/


class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        
		/*
		iphone iph=new iphone();
		iph.name="iphone8";
		iph.weight=90;
		iph.call();
		*/

       //���ó��󷽷�
       iphone iph=new iphone();
	   iph.callSomebody();

	 //  mobile new mobile();  ������ ���ܴ�������

      linAd ad=new linAd("��Ϊ",100);
	  ad.call();  //���÷ǳ��󷽷�

	  mobile.call2();
 	}

}

/*����  ������ 2017/7/15*/
abstract class mobile
{
    String name;
	int weight;
    //�ǳ��󷽷�
    void call(){
	  		System.out.println("say  Hello World!"+this.name);
	}
   
   //���󷽷� û�з����� ������ȥʵ��
   abstract void callSomebody();

   //����������й��캯��
   mobile(String name , int weight){
     this.name=name;
	 this.weight=weight;
   }

   mobile(){
  
   }
   static void call2(){
      	System.out.println("���,�������ĵ绰");
   }


}


//���һ���ǳ�����̳��˳����࣬��ô����Ҫ�ѳ���������г��󷽷�ȫ��ʵ�֡�
class iphone extends mobile
{
   void callSomebody(){
  	  		System.out.println("call kobe!");
   }

}
class linAd extends mobile
{
   void callSomebody(){
  	  		System.out.println("call jack!");
   }
   linAd(String name,int weight){
      super(name,weight);  //���ø���Ĺ��캯����
   }

}