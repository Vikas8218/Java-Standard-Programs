class Evilnumber{
	public static void main(String args[]){
		int num=10;
		int count=0;
		for(int i=0;i<num;num=num/2)
		{
			if(num%2==1)
				count++;
		}
		if(count%2==0)
			System.out.print("Evil number!");
		else 
			System.out.print("Not Evil number");
	}
}
