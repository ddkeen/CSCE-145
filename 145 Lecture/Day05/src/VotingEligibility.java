import java.util.Scanner;
public class VotingEligibility 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = key.nextInt();
		
		//validating user input
		
		if(age <=0)
		{
			System.out.println();
			//exits the program
			System.exit(0);
			
		}
		
		if(age >= 18)
		{
			System.out.println("You are eligible to vote!");
		}
		else
		{
			int wait = 18 - age;
			System.out.println("You need to wait for another " + wait+ " years to become eligible to vote!");
		}

	}
}
