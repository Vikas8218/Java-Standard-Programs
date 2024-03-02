import java.uitl.*;
public class Amripnumber{
	public static boolean prime(int n){
		   for(int i=2;i<=n/2;i++)
    if(n%2==0)
        return false;
   return true;
}
public static int Reverse(int n){
   int sum=0;
   for(int i=0;i<n;n=n/10)
         sum=sum*10+n%10;
   return sum;
}
		
	public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number:");
	int num =sc.nextInt();
	if(Prime(num)&&Prime(Reverse(num)))
    System.out.print("Emrip");
   else
    System.out.print("Not Emrip");
	}
}