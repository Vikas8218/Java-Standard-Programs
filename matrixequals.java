public class matrixequals{
	public static void main(String  args[]){
		int[][] m1={{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("\nfirst matrix:");
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
        System.out.print(m1[i][j]+" ");
        System.out.println();
		}
      System.out.println("\nsecond matrix:");
      for(int i=0;i<3;i++){
      for(int j=0;j<3;j++)
      System.out.print(m2[i][j]+" ");
      System.out.println();
	  }
	 int  flag=1;
	  if(m1.length==m2.length){
		  for(int i=0;i<3;i++)
		  for(int j=0;j<3;j++)
		  if(m1[i][j]==m2[i][j])
		  flag=0;
            if(flag==1)
                System.out.print("\nMatrix Are Equal!");
            else
                System.out.print("\nMatrix Are Different!");
		  
	  }else{
		  System.out.print("\nmatrix are different!");
	  }
}}