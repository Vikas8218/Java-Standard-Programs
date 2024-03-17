 class HEAP {
    public static void main(String args[]) {
        String str1 = "Alok";
        String str2 = "Kumar";
        String str3 =  " ";

        for (int i = 0; i < str1.length(); i++) {
            str3 += str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            str3 += str2.charAt(i);
        }

        System.out.println(str3);
    }
}
