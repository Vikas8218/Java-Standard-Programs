class Demo {
	int a,b;
	public Demo(int a1,int b1){
		a =a1;
		b=b1;
	}
	public Demo(Demo c){
		a =c.a;
		b =c.b;
	}
	void view(){
		System.out.println("A="+a+"B="+b);
	}
	
    public static void main(String args[]) {
        Demo cc =new  Demo(10,20);
		cc.view();
		Demo dd =new Demo(cc);
		dd.view();
}
}