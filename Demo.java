  class Base{
	  String x;
	  String y;
	  
	  Void show(){
		  System.out.println(x);
		  System.out.println(y);
  }}
  class Child extends Base{
  void Set(String x, String y ){
	  this.x=x;
	  this.y=y;
  }
  public static void main(String args[]){
	  Child  c1 = new Child();
	  c1.Set("mainsh","sohit");
  c1.show();
  }}
	  