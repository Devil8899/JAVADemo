class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
       int[] arr={1,3,5,7,9};
     System.out.println(halfSeach_2(arr,2));

	}


	public static int halfSeach_2(int[] arr,int key){
		int min,max,mid;//������С������м���
		min = 0;//��СΪ0
		max = arr.length-1;// ���Ϊ����ĳ���-1
		mid = (max+min)>>1; //(max+min)/2;//�м���Ϊ������С����2
		while(arr[mid]!=key){//����������gֵ������key
			if(key>arr[mid]){//���key>���gֵ
				min = mid + 1;
			}
			else if(key<arr[mid])
				max = mid - 1;
			if(max<min)
				return -1;
			mid = (max+min)>>1;	
		}
		return mid;
	}

}
