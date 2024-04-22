 class PalindromeString {
    public static void main(String args[]) {
        String str = "MADAM";
        String temp = ""; 
		int i =str.length()-1;
		while(i>=0){
            temp = temp + str.charAt(i);
			i--;
        }

        if (temp.equals(str)) 
            System.out.println("Palindrome");
         else 
            System.out.println("Not Palindrome");
	}
    }
