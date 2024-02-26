  import java.util.*;
  public class Palindrome
  {
	  public static void main(String args[]){
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter a number :");
		  int num =sc.nextInt();
		  int temp =num;
		  int sum=0;
		 for(int i=0;i<num;num=num/10) {
		int	rem =num%10;
			sum =sum*10+rem;
		}
		if(sum==temp) {
			System.out.println("polindrome");
		}
			else {
				System.out.println("Not palindrome");
			}
		}

	}


  
			  
		  
		  