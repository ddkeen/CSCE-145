/*
 * David Keen
 * 11/5/19
 * CSCE 145
 * Homework 6
 */
import java.util.Scanner;
public class ShipNavigator {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String create = "yes";
		
		System.out.println("Welcome to ShipNavigator!");
		do {
			System.out.println("Enter the name of the ship: ");
			String name = key.nextLine();
			System.out.println("Enter it's launch date (mm/dd/yyyy): ");
			String date = key.nextLine();
			System.out.println("Is it a cruise ship or a cargo ship?");
			String type = key.nextLine();
			
			if(type.equalsIgnoreCase("Cruise Ship"))
			{
				System.out.println("Enter the ship's passenger capacity: ");
				int capacity = key.nextInt();
				System.out.println("How many crew members are on this ship? ");
				int crew = key.nextInt();
				System.out.println("Creating a cruise ship..." + "\nPrinting the ship's details: ");
				CruiseShip tom = new CruiseShip(name,date,capacity,crew);
				System.out.println(tom.toString());
			}
			else if(type.equalsIgnoreCase("Cargo Ship"))
			{
				System.out.println("Enter the ship's tonnage (DWT): ");
				double tonnage = key.nextDouble();
				System.out.println("Enter the maximum speed of the ship (in mph): ");
				double speed = key.nextDouble();
				System.out.println("Creating a cargo ship..." + "\nPrinting the ship's details: ");
				CargoShip jack = new CargoShip(name,date,tonnage,speed);
				System.out.println(jack.toString());
			}
			else
			{
				System.out.println("Invalid type of ship!");
			}
			System.out.println("Do you want to create another ship object? Enter yes or no: ");
			create = key.next();
			key.nextLine();
		}while (create.equalsIgnoreCase("yes"));
			
		System.out.println("Goodbye!");
	}

}
