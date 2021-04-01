/*
 * David Keen
 * 11/4/19
 * CSCE 145
 * Lab 17
 */
import java.util.Scanner;
public class CustomerRecords 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		String create = "yes";
		//do while loop to create aas many customers as needed and prints out their values
			do {
				System.out.println();
				System.out.println("Please enter the name of the customer: ");
				String xName = key.nextLine();
				System.out.println("Enter the customer's number: ");
				int xNumber = key.nextInt();
				System.out.println("Is " + xName + " on the mailing list? Enter true or false");
				boolean xList = key.nextBoolean();
				System.out.println("Enter the purchase amount: ");
				int xAmount = key.nextInt();
				PreferredCustomer andy = new PreferredCustomer(xName, xNumber, xList, xAmount);
				andy.writeOutput();
				System.out.println("Do you want to create another customer? Enter yes or no.");
				key.hasNextLine();
				create = key.next();
				key.nextLine();
				
			} while (create.equalsIgnoreCase("yes"));
			System.out.println("Goodbye!");
	}
	
}