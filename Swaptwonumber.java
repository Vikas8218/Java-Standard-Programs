 import java.util.*;
 class Swapnumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter  x number: ");
		int  x =sc.nextInt();
		System.out.println("Enter y number:");
		int y =sc.nextInt();
		
		
		 x =x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("Two number swaping !!!!");
		 System.out.println("x = "+x);
		 System.out.println("y = " +y);
	}
}