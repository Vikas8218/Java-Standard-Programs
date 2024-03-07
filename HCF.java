class HCF{
	public static void main(String args[]){
		int a=12;
		int b=16;
		int HCF =1;
		for(int i=1;i<=12;i++){
			if(a%i==0&&b%i==0){
				HCF =i;
		}}
			System.out.print(HCF);
		}
	}
