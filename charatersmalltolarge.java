class Character{
	public static void main(String agrs[]){
	String str="Ram is good boy";
	String temp=" ";
	for(int a=0;a<str.length();a++){
		if((str.charAt(a)>=65)&&(str.charAt(a)<=90))
			temp =temp+((char)(str.charAt(a)+32));
		
			else
				if((str.charAt(a)>=90)&&(str.charAt(a)<=122))
			temp =temp+((char)(str.charAt(a)-32));
			else 
				temp=temp+str.charAt(a);
				}
				System.out.println("String :"+str);
				System.out.println("String :"+temp);
	}
	}
