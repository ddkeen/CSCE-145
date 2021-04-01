/*David Keen
 * 10/22/19
 * CSCE 145
 * HW 5 (Tester)
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) 
	{
		//create Scanner and 2 Coffee Objects
		Scanner key = new Scanner(System.in);
		Coffee starbux = new Coffee();
		Coffee dunkin = new Coffee();
		
		System.out.println("Welcome to Cool Beans!");
		
		//receive input names for both coffees
		System.out.println("What's the name of the first Coffee?");
		String name1 = key.nextLine();
		System.out.println("What's the name of the second Coffee?");
		String name2 = key.nextLine();
		
		//receive input caffeine for both coffees
		System.out.println("What's the caffeine content for the first coffee?");
		double caf1 = key.nextDouble();
		System.out.println("What's the caffeine content for the second coffee?");
		double caf2 = key.nextDouble();
		
		//set values for 1st coffee
		starbux.setName(name1);
		starbux.setCaffeineContent(caf1);
		
		//set values for 2nd coffee
		dunkin.setName(name2);
		dunkin.setCaffeineContent(caf2);
		
		//print amount of cups to be had safely for both kinds of coffee
		System.out.println("It would take " + starbux.riskyAmount() + " cups of the " + starbux.getName() + " before it's dangerous to drink more.");
		System.out.println("It would take " + dunkin.riskyAmount() + " cups of the " + dunkin.getName() + " before it's dangerous to drink more.");
		
		System.out.println("America Runs on Dunkin.");
	}

}
