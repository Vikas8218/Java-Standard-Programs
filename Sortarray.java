class Sortarray{
 public static void PrintArray(int arr[]){
	 for(int i=0;i<arr.length;i++){
		 System.out.println(arr[i]+" ");
	 }	
 }		
	public static void main(String args[]){
		int[] arr={2,4,1,5,3,7,8,9};
		for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr.length-1;j++){
		if(arr[j]>arr[j+1]){
		int temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		}
	}
}	
	PrintArray(arr);
	}
}
