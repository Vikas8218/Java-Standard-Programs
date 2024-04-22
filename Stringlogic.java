class Demo{
	public static void main(String[] args){
		String str ="Ram is good boy";
		String rev ="";
		String word="";
		str =str+" ";
		for(int i=0;i<str.length();i++){
		  char ch =str.charAt(i);
		  if(ch!=' '){
			  word =word+ch;
		}
		else{
			rev=word+" "+rev;
		word="";
		}}
		System.out.println(rev);
	}
interface My{
	void show(){
		System.out.println("Show form Interface");
	}
	public static void main(String args[]){
		My obj =new My();
		obj.show();
	}
}
}