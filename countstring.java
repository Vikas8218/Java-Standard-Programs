class Countstring{
	public static void main(String args[]){
		String m1="vikas saini";
		String m2="manish kedwal";
		String name=m1+" "+m2;
		int count=0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)!=' '){
				count++;
			}
		}
		System.out.print("charater count="+count);
		
}}
	