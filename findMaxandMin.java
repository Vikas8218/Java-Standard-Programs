class Demo{
	public static void findMaxandMin(int [] arr){
			int min=arr[0];
			int mix=arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]<min){
					min =arr[i];
			}
			if(arr[i]>mix){
				mix =arr[i];
		}}
	   System.out.println("Minimum value :"+min);
	   System.out.print("Miximum value :"+mix);
	}
	public static void main(String args[]){
		int[] arr ={1,2,3,4,5};
		 findMaxandMin(arr);
}}