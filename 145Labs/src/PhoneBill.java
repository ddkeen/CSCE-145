/*David Keen
 * 9/16/19
 * CS 145
 * Lab - 05
 */
import java.util.Scanner;
public class PhoneBill 
{
	//initializes constants for the prices of the three plans as well as the number of minutes allowed and the price of each additional minute
	public static final double BASIC = 39.99;
	public static final double PREMIUM = 59.99;
	public static final double UNLIMITED = 69.99;
	public static final int BASICMINUTESALLOWED = 450;
	public static final int PREMIUMMINUTESALLOWED = 900;
	public static final double EXTRABASICMINUTES = .45;
	public static final double EXTRAPREMIUMMINUTES = .40;
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		//Prompt to the user to choose a plan
		System.out.println("Welcome to Cocky Mobile! You can choose from one of the three subscription plans listen below:");
		System.out.println("1. Basic");
		System.out.println("2. Premium");
		System.out.println("3. Unlimited");
		System.out.println("Please enter your selection:");
		String plan = key.next();
		
		if (plan.equalsIgnoreCase("basic"))
		{
			//Get user to enter monthly minutes
			System.out.println("Enter your monthly usage(in minutes):");
			int minutes = key.nextInt();
			//input validation
			if (minutes<0)
			{
				System.out.println("Invalid value for monthly usage!!!");
			}
			//user did not go over their monthly minutes limit
			else if(minutes<=BASICMINUTESALLOWED)
			{
				System.out.println("Your monthly bill = $" +BASIC);
			}
			//user went over monthly minutes limit and will be charged extra
			else 
			{
				int extraMinutes = minutes-BASICMINUTESALLOWED;
				double extraCharge = extraMinutes*EXTRABASICMINUTES;
				//bill is the monthly price plus the amount of additional minutes times price per additional minute
				double bill = BASIC+extraCharge;
				System.out.println("Your monthly bill = $" + bill); 
			}
		}
		
		else if (plan.equalsIgnoreCase("premium"))
		{
			//Get user to enter monthly minutes
			System.out.println("Enter your monthly usage(in minutes):");
			int minutes = key.nextInt();
			//input validation
			if (minutes<0)
			{
				System.out.println("Invalid value for monthly usage!!!");
			}
			//user did not go over their monthly minutes limit
			else if(minutes<=PREMIUMMINUTESALLOWED)
			{
				System.out.println("Your monthly bill = $" +PREMIUM);
			}
			//user went over monthly minutes limit and will be charged extra
			else 
			{
				int extraMinutes = minutes-PREMIUMMINUTESALLOWED;
				double extraCharge = extraMinutes*EXTRAPREMIUMMINUTES;
				//bill is the monthly price plus the amount of additional minutes times price per additional minute
				double bill = PREMIUM+extraCharge;
				System.out.println("Your monthly bill = $" + bill); 
			}
		}
		
		else if (plan.equalsIgnoreCase("unlimited"))
		{
			//no need to calculate minutes and extra charge because unlimited price is fixed
			System.out.println("Your monthly bill = $" + UNLIMITED);
		}
		else
		{
			//input validation
			System.out.println("Invalid name for subscription plan!!!");
		}
		

	}

}
