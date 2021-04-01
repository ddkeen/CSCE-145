import java.util.Scanner;

public class SqaureRoot {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		double num = key.nextDouble();
		
		double squareRoot = Math.sqrt(num);
		
		System.out.println("Square root of "+num+" = "+ squareRoot);
		
	}

}
