class Krishnamurthy{
	public static int fact (int n){
		int fact =1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		return fact;
	}
	public static void main(String args[]){
		int num=145;
		int temp =num;
		int sum=0;
		for(int m=0;m<num;num=num/10){
			sum =sum+fact(num%10);
		}
			if(sum==temp)
				System.out.print("Krishnamurthy number!");
			else
				System.out.print("Not krishnamurthy number!");
}
		}
		
		