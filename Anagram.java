class  Anagram{
	public static void main(String args[]){
    String str1="LISTEN"; 
	String str2="SILENT";
	 StringBuilder sb=new StringBuilder(str1);
	 int count=0;
	 if(str1.length()==str2.length()){
		 for(int i=0;i<str1.length();i++){
		 for(int j=0;j<str2.length();j++){
			 if(str1.charAt(i)==sb.charAt(j)){
				 sb.setCharAt(j,'*');
				 count++;
			 }
		 }
			 }
		 if(str2.length()==count){
			 System.out.print("anagram !");
		 }
		 else{
			 System.out.print("Not anagram!");
		 }
		 
	 }else
		 System.out.print("Not anagram!");
	 
	}
}
