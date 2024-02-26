public class array{
	public static void main(String args[]){
		int a[]={3,2,4,6,3,76,87};
		int sumeven=0;
		int sumodd=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.println(a[i]);
				sumeven=sumeven+a[i];
		}else{
			System.out.println(a[i]);
			sumodd=sumodd+a[i];
		}
		}
		System.out.println("Sumeven>>"+sumeven);
		System.out.println("Sumodd>>"+sumodd);
	}
}