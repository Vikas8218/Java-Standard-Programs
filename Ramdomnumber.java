import java.util.Random;
public class Ramdomnumber{	
	public static void main(String[]args){
		int number;
		Random random =new Random();
		number =random.nextInt();
		System.out.println("Generated number is :"+(number +1));
	}
}