import java.util.Scanner;

public class PositiveOrNot {
	
	public static void main(String[] args) {
	
	Scanner key = new Scanner(System.in);

	System.out.println("Enter a number");
	
	double num = key.nextDouble();
	
	//branching statement
	
	if (num>=0)
	{
		//will be executed when the if condition is true
		System.out.println(num + " is positive!");
	}
	else
	{
		//will be executed when the if condition is false
		System.out.println(num + " is negative!");
	}
}
	
}

