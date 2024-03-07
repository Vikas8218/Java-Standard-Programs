import java.util.*;
class copyarray{
	public static void main(String args[]){
	int a[]=new int[5];
	int b[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value first array:");
	for(int i=0;i<5;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("first array elements:");
	for(int i=0;i<5;i++){
		System.out.println(a[i]+" ");
	}
	System.out.println("second array elements:");
	for(int i=0;i<5;i++){
		b[i]=a[i];
	
	System.out.println(b[i]+" ");
	}
}
}
	
	