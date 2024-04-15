 class Demo {
    public static void main(String[] args) {
        String originalString = "vikas,ram ,sohit, manish ,vikas ,vikas";
        String replacedString = originalString.replace("vikas", "Akash");
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);
    }
}