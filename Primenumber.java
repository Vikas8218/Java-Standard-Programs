public class Primenumber{
	public static void main(String args[]){
		int num =8;
		 int flag=1;   
		for(int i=2;i<num;i++){
			if(num%2==0)
				flag=0;
		break;
		}
		if(flag==1){
			System.out.println("prime number");
		}
		else System.out.println("Not prime number!");
		}	
	}


	