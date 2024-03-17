class Character{
	public static void main(String args[]){
		int count =0;
		String a="my name is vikas saini";
		String ch="vikas";
		for(int i=0;i<a.length();i++){
	    for(int j=0;j<ch.length();j++)
			if(ch.charAt(j)==a.charAt(i)){
				count++;
		}
		}
		System.out.print("Occurency of character == :"+count);
}}