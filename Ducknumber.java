 import java.util.*;
 class Ducknumber{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		 int flag =0;
		for(int i=0;i<num;num=num/10)
		if(num%10==0)
			flag=1;
	
		if(flag==1)
			System.out.println("Duck number!");
		else
			System.out.println("Not Duck number!");
		}
}
		