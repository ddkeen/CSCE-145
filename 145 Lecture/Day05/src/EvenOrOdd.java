import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {

			Scanner key = new Scanner(System.in);
			System.out.println("Enter a number:");
			double number = key.nextDouble();
			
			//type casting
			int num = (int)number;
			
			if (num%2==0)
			{
				System.out.println("The number is even!");
			}
			else
			{
				System.out.println("The number is odd!");
			}
			
	}

}
