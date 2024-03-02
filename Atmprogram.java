
import java.util.Scanner;
class Atmprogram{
 static Scanner sc = new Scanner(System.in);
 static int amount=10000;
 public static void CashDeposit(){
 System.out.print("Enter Amount : ");
 int dep = sc.nextInt();
 amount = amount+dep;
 System.out.println("Deposit Success!");
 }
 public static void CashWith(){
 System.out.print("Enter Amount :");
 int am = sc.nextInt();
 if(am<amount){
    amount=amount-am;
    System.out.println("Withdrawl Success!");
 }else
    System.out.println("Insufficient Balance");
 }
 public static void Inquiry(){
 System.out.println("Amount is : "+amount);
 }
 public static void main(String[] args){
  while(true){
   System.out.println("ATM PROGRAM");
 System.out.print("1. Deposit\n2. Withdrawl\n3. Inquiry\n4. Exit\nEnter Choice : ");
  int choice = sc.nextInt();
  switch(choice){
  case 1: CashDeposit(); break;
  case 2: CashWith(); break;
  case 3: Inquiry(); break;
  default: System.exit(0);
  }
    }
}
}