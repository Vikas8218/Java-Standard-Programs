import java.util.*;
public class Sunnynumber{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num =sc.nextInt();
		int flag =0;
		for(int i=0;i<(num+1)/2;i++){
			if(i*i==(num+1)){
				flag=1;
				break;
			}
		}
				if(flag==1)
			System.out.println("Sunnynumber!");
		else 
			System.out.println("Not Sunnynumber!");
}}