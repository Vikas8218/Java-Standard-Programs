import java.util.*;
public class Petersonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            sum = sum + factorial(rem);
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("Peterson number!");
        } else {
            System.out.println("Not a Peterson number!");
        }
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
}
