 class Demo {
     public static void main(String args[]){
	int[] arr ={5,1,9,3,5,6,7};
    int temp ;
       for(int i=0;i<arr.length;i++){
	   for(int j=0;j<arr.length-1;j++){
		   if(arr[j]>arr[j+1]){
			   temp =arr[j];
		   arr[j]=arr[j+1];
		   arr[j+1]=temp;
 }
 }
	   }
 System.out.print("Sorted Array");
 for(int i=0;i<arr.length;i++)
	 System.out.print(arr[i]+" ");
	   }
	 }
 