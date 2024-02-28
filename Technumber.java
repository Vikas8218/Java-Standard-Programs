  public class Technumber{
	  public static void main(String args[]){
		  int num=2025;
		  String str=Integer.toString(num);
		  int len =str.length();
		  if(len%2==0)
		  {
			  int div = (int)Math.pow(10,len/2);
			  int finalNum =num/div+num%div;
		  
			  if(finalNum*finalNum==num){
				  System.out.println("Tech");
			  }
			  else
				  System.out.println("Not Tech");
			  }
  }
  }