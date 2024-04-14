class Main{
	public int ThirdLargest(int [] arr){
		int temp;
		for(int k=0;k<arr.length;k++){
		for(int i=0;i<arr.length-1;i++){
		if(arr[i]<arr[i+1]){
			temp =arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}}
		}
		return arr[1];
		}
		public static void main(String args[]){
			Main obj =new Main();
			int [] arr ={120,31,56,900,389,90,10};
			int large =obj.ThirdLargest(arr);
			System.out.println("Second largest value:"+large);
		}
	}

