 class RemoveSpaces {
	 public static String removeSpaces(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "This is a string with spaces";
        String withoutSpaces = removeSpaces(str);

        System.out.println(withoutSpaces); // Output: Thisisastringwithspaces
    }
 }
   