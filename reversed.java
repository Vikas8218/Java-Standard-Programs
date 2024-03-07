class reversed{
	public static  void main(String args[]){
String str="Ram is a good boy";
String rev ="";
String word="";
str=str+" ";
for(int i=0;i<str.length();i++){
	char ch=str.charAt(i);
	if(ch!=' '){
		word =word+ch;
	}
	else{
		    rev =word+" "+rev;
		word ="";
	
}}
System.out.print(rev.trim());
}
}

		
