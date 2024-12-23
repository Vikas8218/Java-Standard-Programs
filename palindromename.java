  import java.util.*;
  class Day{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
		System.out.println("Enter your first number :");
		int a =sc.nextInt();
		System.out.println("Enter your Second number :");
		int b =sc.nextInt();
		    System.out.println("Enter your Press 1...");
			System.out.println("Enter your Press 2...");	
			System.out.println("Enter your Press 3...");
			System.out.println("Enter your Press 4...");
		int choice =sc.nextInt();
		int c;
		switch(choice){
			case 1 :
			c =a+b;
			System.out.println("Addition"+c);
			break;
			case 2 :
			c =a-b;
			System.out.println("Sub"+c);
			break;
			case 3 :
			c =a*b;
			System.out.println("Mul"+c);
			break;
			case 4 :
			c =a/b;
			System.out.println("Div"+c);
			break;
			
		}
	}
    }




