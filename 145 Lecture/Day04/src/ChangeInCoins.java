//9/5/19 Lecture Problem
import java.util.Scanner;

public class ChangeInCoins 
{
	public static final int QUARTERS =25;
	public static final int DIMES =10;
	public static final int NICKELS =5;
	public static final int CENTS =1;
	 public static void main(String[] args) 
	{
		//declare coin variables
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		//get amount of change
		Scanner key = new Scanner(System.in);
		System.out.println("Enter an amount of change in cents:"); 
		int change = key.nextInt();
		int original = change;
		
		//num of quarters
		quarters = change/QUARTERS;
		change = change%QUARTERS;
		
		
		//num of dimes
		dimes = change/DIMES;
		change = change%DIMES;
		
		//num of nickels
		nickels = change/NICKELS;
		change = change%NICKELS;
			
		//num of pennies
		pennies = change;
		
		//Output
		System.out.println("Here is the change for your " + original + " cents: " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");
	}

}
