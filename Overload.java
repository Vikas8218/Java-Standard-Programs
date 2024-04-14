class parent{
	static void show(){
		System.out.println("Show From parent");
	}
}
class Child extends parent{
	static void show(){
		System.out.println("Show From Child");
	}
	public static void main(String[] args){
		show();
		parent.show();
	}
}
