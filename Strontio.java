 import java.util.*;
 public class Strontio
 {
	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int num =sc.nextInt();
		 if(num>=100){
			 if(((num/10)%10)==((num/100)%10))
				 System.out.println("Strontio");
			 else 
				 System.out.println("Not Strontio");
		 }
		 else{
			 System.out.println("Not Strontio");
		 }
	 }
 }
 