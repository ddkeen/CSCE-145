/*
 * David Keen
 * 10/28/19
 * CSCE 145
 * Lab 15
 */
import java.util.Scanner;
public class MotorBoatDriver {
	
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the Motor Boat Tester!");
		
		//creates one boat with default values and prints them as a string
		System.out.println("Creating the first MotorBoat with default values");
		MotorBoat billy = new MotorBoat();
		System.out.println(billy.toString());
		
		//takes user input for speed and distance and calculates time and amount of fuel used
		System.out.println("What is the current speed of this boat (in knotts)");
		double speed = key.nextDouble();
		System.out.println("How many more nautical miles do you need to travel?");
		double distance = key.nextDouble();
		System.out.println("Time taken to reach the destination: " + billy.timeTakenToReachDestination(speed, distance) + " hours");
		System.out.println("Amount of fuel used to travel " + distance + " nautical miles at " + speed + " knotts with a motor efficiency of " + billy.getEfficiency() + " is: " + billy.amountOfFuelUsed(speed,billy.timeTakenToReachDestination(speed, distance)) +" gallons");
		
		/*
		 * creates a second boat with variable values from user input and prints it as a String
		 * System.out.println("You can make the second boat!");
		System.out.println("Enter the max speed");
		double maxSpeed2 = key.nextDouble();
		System.out.println("Enter the fuel capacity");
		double capacity2 = key.nextDouble();
		System.out.println("Enter the efficiency");
		double efficiency2 = key.nextDouble();
		MotorBoat goat = new MotorBoat(capacity2, maxSpeed2, efficiency2);
		System.out.println(goat.toString());
		
		//takes user input for speed and distance and calculates time and amount of fuel used
		System.out.println("What is the current speed of this boat (in knotts)");
		double speed2 = key.nextDouble();
		System.out.println("How many more nautical miles do you need to travel?");
		double distance2 = key.nextDouble();
		System.out.println("Time taken to reach the destination: " + goat.timeTakenToReachDestination(speed2, distance2) + " hours");
		System.out.println("Amount of fuel used to travel " + distance2 + " nautical miles at " + speed2 + " knotts with a motor efficiency of " + goat.getEfficiency() + " is: " + goat.amountOfFuelUsed(speed2,goat.timeTakenToReachDestination(speed2, distance2)) +" gallons");
		
		 */
		
		//copies boat 1 and makes boat 2 and prints the values
		System.out.println("Copying values from boat 1 to make boat 2 using the copy constructor");
		MotorBoat bob = new MotorBoat(billy);
		System.out.println(bob.toString());
		System.out.println("Updating efficiency to .001");
		bob.setEfficiency(.001);
		
		//takes user input for speed and distance and calculates time and amount of fuel used
		System.out.println("What is the current speed of this boat (in knotts)");
		double speed2 = key.nextDouble();
		System.out.println("How many more nautical miles do you need to travel?");
		double distance2 = key.nextDouble();
		System.out.println("Time taken to reach the destination: " + bob.timeTakenToReachDestination(speed2, distance2) + " hours");
		System.out.println("Amount of fuel used to travel " + distance2 + " nautical miles at " + speed2 + " knotts with a motor efficiency of " + bob.getEfficiency() + " is: " + bob.amountOfFuelUsed(speed2,bob.timeTakenToReachDestination(speed2, distance2)) +" gallons");
		
		
		
		//end
		System.out.println("Happy Boating!!!");
		
		
		
		
		
		
	}

}
