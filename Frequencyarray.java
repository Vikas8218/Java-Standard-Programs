class Frequencyarray{
	public static void main(String args[]){
		int[] a ={10,20,20,70,70,60,60,50,40,40,40};
		for(int i=0;i<a.length;i++){
			int x=a[i];
			int count=0;
			if(x==-1)
				continue;
			for(int j=0;j<a.length;j++){
				if(a[j]==x){
					count++;
					a[j]=-1;
				}
			}
			System.out.println("Frequecy of "+x+"is"+" "+count);
		}
}}
	