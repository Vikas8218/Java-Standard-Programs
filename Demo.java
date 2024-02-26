import java.util.Scanner;
public class Demo{
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the number");
  int number = scan.nextInt();
  if(number<1 || number>9999){
	  System.out.println("Invalid number");
  }
  else{
	  int a=number%10;
	  int b=(number/10)%10;
	  int c =(number/100)%10;
	  int d =(number/1000)%10;
	  String A[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fiveteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	  String B[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	  String H="Hundred";
	  String T="Thousand";
	  if(number<20){
		  System.out.println(A[number]);
	  }else if(number>=20&&number<=99){
		  System.out.println(B[b]+" "+A[a]);
	  }
	  else if(number>=100&&number<=999){
		  System.out.println(A[c]+" "+H+" "+B[b]+" "+A[a]);
	  } else{
		  System.out.print(A[d]+" "+T+" "+A[c]+" ");
		  if(c==0)
			  System.out.print(B[b]+" "+A[a]);
		  else
			  System.out.print(H+" "+B[b]+" "+A[a]);
  }
 }
 }
}
 
			  
	  
	  
  
  
 

