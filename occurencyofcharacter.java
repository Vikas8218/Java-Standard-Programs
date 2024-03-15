class Character{
	public static void main(String args[]){
		int count =0;
		String a="AMAN KUMAR";
		char ch='M';
		for(int i=0;i<a.length();i++){
			if(ch==a.charAt(i)){
				count++;
		}
		}
		System.out.print("Occurency of character == :"+count);
}}