package other;

public class Demo3 {

	public static void main(String[] args) {
		son s=new son();
//		s.Work();
		mather ma=new mather(s);
//		ma.Work();
        father fa=new father(s);
        fa.Work();
	}

}
/*��ϰ��
һ������ÿ���˶��Ṥ�������ӵĹ������ǻ�����ĸ�׵Ĺ��������ڶ��ӵĻ�������һ����ǿ������ֹ���Ի�������������Ϳ�ϡ�
�ְֵĹ������������������������ǿ�������ϻ���
�Ӹ������ͬ���ķǾ�̬�ĳ�Ա����ʱ�����ʵ�������ĳ�Ա������
*/
interface Work{
	public void Work();
}
//ʵ�ֽӿ���
class son implements Work{
	@Override
	public void Work() {
	  System.out.println("����...");	
		
	}
}
//ʵ�ֽӿ���
class mather implements Work{
     Work work; 	//��Ҫ����ǿ���ࡣ
	 //���캯��
     public mather(Work work){
    	 this.work=work;  //ʵ�ʴ�����son���� 
     }
     
	@Override
	public void Work(){
	  work.Work();
	  System.out.println("Ϳ��...");		
	}
}

class father implements Work{
    Work work;  	//��Ҫ����ǿ���������
	 //���캯��
    public father(Work work){
   	 this.work=work;  //ʵ�ʴ������������    
    }
    
	@Override
	public void Work(){
	  work.Work(); //�������ķ�����  ��̬  father fa=new son();   son�̳���father��
	  System.out.println("����...");		
	}
}
