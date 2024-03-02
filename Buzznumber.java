import  java.util.*;
class Buzznumber{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if((num % 7 == 0 )||( num % 10 == 7))
			System.out.println("Buzz number");
		
			else 
				System.out.print("Not Buzz number");
		}
	}