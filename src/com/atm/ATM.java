 package com.atm;
import java.util.*;
  public class ATM{
	static Scanner sc =new Scanner(System.in);
	static int amount=10000;
	public static void CashDeposit(){
		System.out.println("Enter a Amount:");
		int dep =sc.nextInt();
		amount =amount+dep;
		System.out.println("Deposit Success!");
}
	public static void CashWith(){
		System.out.println("Enter Amount :");
		int am =sc.nextInt();
		if(am<amount){
			amount =amount-am;
			System.out.println("Withdrawl Success!");
		}
		else
			System.out.println("Insufficient Balance");
	}
	public static void Inquiry(){
		System.out.println("Amount is :"+amount);
	}
	public static void main(String args[]){
		while(true){
			System.out.println(" 1.Deosit\n 2.withdrawl\n 3.Insufficient\n 4.Exit\n 5.Enter a choice:");
			int choice =sc.nextInt();
			switch(choice){
				case 1 : CashDeposit(); break;
				case 2 : CashWith(); break;
				case 3 : Inquiry(); break;
				default : System.exit(0);
			}
		}
	
	}
 }