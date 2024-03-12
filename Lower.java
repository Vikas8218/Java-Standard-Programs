import java.util.*;
class Lower{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int[][] m1 ={{5,2,3},{8,5,6},{11,8,9}};
		int even =0; 
		int odd=0;
		System.out.println("\n your matrix:");
		for(int i=0;i<3;i++){
	    for(int j=0;j<3;j++){
			if(m1[i][j]%2==0)
				even++;
		
			else
				odd++;
		}}
		System.out.println("even frequencey:"+even);
		System.out.println("odd frequencey:"+odd);
		}
		}

				
	
