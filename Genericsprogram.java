import java.util.HashMap;
class Demo<A>{
	private A obj;
	Demo(A obj){
		this.obj=obj;
	}
	void print(){
		System.out.println(obj);
}}
Class Main{
	public static void main(String args[] ){
		 HashMap<String, Integer> map = new HashMap<Demo>();
		 map.print();
	}
}
