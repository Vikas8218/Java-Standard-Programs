class PerfectSquare{
	public static void main(String args[]){
		int num=16;
		int flag=1;
		for(int i=1;i<num/2;i++){
			if(i*i==num){
				System.out.print("perfect Square number!"+i);
				flag=0;
				break;
			}	
		}
		if(flag==1)
			System.out.print("Not perfect square number!");
}}
	