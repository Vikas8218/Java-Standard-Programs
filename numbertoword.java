import java.util.Scanner;

class Revision {
    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = sc.nextInt();

	        if (number < 1 || number > 999) {
	            System.out.println("Invalid number");
	        } else {
	            int a = number % 10;
	            int b = (number / 10) % 10;
	            int c =(number / 100) % 10;

	            String A[] = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	            String B[] = {" ", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
                String C = "Hundred";
	            if (number >= 1 && number <= 19) {
	                System.out.print(A[number]);
	            } else if (number >= 20 && number <= 99) {
	                System.out.print(B[b] + " " + A[a]);
	                
	            
	        } else if (number >= 100 && number <= 999) {
                System.out.print(A[c] + " " + C + " " + B[b] + " " + A[a]);
	            }
	        }
	    }
	}
