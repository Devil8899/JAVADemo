class Demo1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
       int[] arr={1,3,5,7,9};
     System.out.println(halfSeach_2(arr,2));

	}


	public static int halfSeach_2(int[] arr,int key){
		int min,max,mid;//定义最小，最大，中间数
		min = 0;//最小为0
		max = arr.length-1;// 最大为数组的长度-1
		mid = (max+min)>>1; //(max+min)/2;//中间数为最大加最小除以2
		while(arr[mid]!=key){//如果数组中間值不等于key
			if(key>arr[mid]){//如果key>中間值
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
