/* David Keen
 * 9/9/19
 * CSCE 145
 * Lab - 03
 */

import java.util.Scanner;

public class CookieRecipe 
{
	//constants for the ingredients and the number of cookies in a batch
	public static final double SUGAR = 1.5;
	public static final double BUTTER = 1;
	public static final double FLOUR = 3;
	public static final int BATCH = 48;
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		//Divide Ingredient by number in batch to calculate amount of each ingredient for 1 cookie
		double sugarPerCookie = SUGAR/BATCH;
		double butterPerCookie = BUTTER/BATCH;
		double flourPerCookie = FLOUR/BATCH;
		//ask user for amount of cookies
		System.out.println("How many cookies would you like to make?");
		int numCookies = key.nextInt();
		//multiply amount of cookies by amount of each ingredient needed for 1 cookie
		double sugarNeeded = sugarPerCookie*numCookies;
		double butterNeeded = butterPerCookie*numCookies;
		double flourNeeded = flourPerCookie*numCookies;
		//return correct ratio of ingredients
		System.out.println("Here is the ingredients list to make " + numCookies + " cookies:");
		System.out.println("Sugar: " + sugarNeeded + " cups");
		System.out.println("Butter: " + butterNeeded + " cups");
		System.out.println("Flour: " + flourNeeded + " cups");
		System.out.println("Don't eat the cookie dough!");
		System.out.println("\"I love cookies!\"");
		

	}

}
