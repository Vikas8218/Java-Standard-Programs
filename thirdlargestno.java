class Demo{
	public int ThirdLargest(int[]arr){
		for(int k=0;k<arr.length;k++){
		for(int i=0;i<arr.length-1;i++)
		if(arr[i]<arr[i+1]){
		int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}}
		return arr[1];
	}
	public static void main(String args[]){
	Demo obj=new Demo();
	int[] array={23,67,89,9,67,98,78,67};
	int large=obj.ThirdLargest(array);
	System.out.println("Third Largest value:"+large);
	}
}
