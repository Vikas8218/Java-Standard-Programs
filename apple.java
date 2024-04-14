 class demo {
	 demo(){
		 this("manish","kedwal");
	 System.out.println("Defaut constructor ");
	 }
	 demo(String  x){
		 
		 System.out.println(x);
	 }
	 demo(String x ,String y){
		  this("Akash");
		 System.out.println(x+" "+y);
	 }
	 demo(String x, String  y, String  z){
		
		 System.out.println(x+y+z);
	 }
	 public static void main(String args[]){
		 demo obj =new demo();
	 }
 }
 
		 