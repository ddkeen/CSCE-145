/*
 * David Keen
 * 9/4/19
 * CSCE 145
 * Lab 02
 */
//This program calculates the final velocity and distance traveled by an object traveling vertically through the air.
import java.util.Scanner;

public class Kinematics {
//acceleration due to gravity
	public static final double GRAV = 9.8;
	
	public static void main(String[] args) 
	{
		
		Scanner key = new Scanner(System.in);
		//User inputs initial velocity
		System.out.println("Enter the initial velocity of the object (in meters per second) at point A: ");
		double vO = key.nextDouble();
		//User inputs time
		System.out.println("Enter the amount of time (in seconds) for the object to reach point B: ");
		double time = key.nextDouble();
		//calculate final velocity and distance traveled using kinematic formulas
		double vF = vO + GRAV*time;
		double distance = vO*time + (GRAV/2)*Math.pow(time, 2);
		//prints values
		System.out.println("Final Velocity of the object = " + vF + " m/s");
		System.out.println("Distance traveled by the object = " + distance + " meters");
		
	}

}
