import java.util.*;
 public class Revsion {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String str=Integer.toString(num);
		int len=str.length();
		int[] arr= new int[len];
		for(int i=len-1;i>=0;i--){
			arr[i]=num%10;
			num=num/10;
		}
		int flag=1;
		for(int i=0;i<len;i++){
		int count =0;
		for(int j=0;j<len;j++){
			if(i==arr[j])
				count++;
		}
		if(count!=arr[i])
			flag=0;
		}
		if(flag==1)
			System.out.print("Auto biographical number");
		else 
			System.out.print("Not biographical number");
	}
 }
 
			
		