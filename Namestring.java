class NAME{
	public static void main(String args[]){
		String str1="vikas";
		String str2="saini";
		String str3=" ";
		for(int i=0;i<str1.length();i++)
			str3=str3+str1.charAt(i);
		for(int j=0;j<str2.length();j++)
			str3=str3+str2.charAt(j);
		System.out.print(str3);
}}