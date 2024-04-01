class Main{
	public static void main(String args[]){
		int[][] m1 ={{10,20,30},{40,50,60},{70,80,90}};
		int[][] m2 ={{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("Your matrix first!");
		for(int i=0;i<m1.length;i++){
		for(int j=0;j<m1.length;j++){
			System.out.print(m1[i][j]+" ");
		}
		System.out.println();
		}
		
		System.out.println("Your matrix Second!");
		for(int i=0;i<m2.length;i++){
		for(int j=0;j<m2.length;j++){
			System.out.print(m2[i][j]+" ");
		}
		System.out.println();
		}
		System.out.println("Two matrix addition!");
		for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.print(m1[i][j]+m2[i][j]+" ");
		}
	System.out.println();
}}}
			