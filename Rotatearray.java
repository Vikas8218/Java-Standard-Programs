import java.util.Scanner;
class Largestnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,40,5,6};
		int max =arr[0];
       for(int i=0;i<arr.length;i++){
	  if(max<arr[i]){
		  max =arr[i];
	   }}
	   System.out.print(max);
		
}}
