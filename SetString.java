class SetString {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer("vikas");
        System.out.println(sb.charAt(0));
        sb.delete(2,3);
        System.out.println(sb);
    }
}
