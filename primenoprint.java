class Demo {
    public static void main(String args[]) {
        int count = 0;
		int n=200;
        for (int i = 100; i <n ; i++) {
            count = 1;
             for(int j=2;j<i/2;j++){
                if (i % j == 0) {
                    count++;
                }
			 }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }
}
