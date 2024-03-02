 import java.util.*;
 public class Automorphic{
 public static void main(String agrs[]){
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter a Automorphic number:");
	 int num=sc.nextInt();
	 int flag =1;
	 int sq =num*num;
	 while(num>0){
		 if(sq%10!=num%10){
			 flag =0;
		 break;
	 }
		 num=num/10;
		 sq=sq/10;
	 }
	 if(flag==1)	 
	 System.out.println("Automorphic Number!");
   else 
	   System.out.println("Not Automorphic Number!");
 }
 }