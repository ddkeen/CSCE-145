/*
 * David Keen
 * 9/11/19
 * CS 145
 * Lab-04
 */
import java.util.Scanner;
public class Seconds {
//constant values for seconds, minutes, hours, and days
public static final int SECOND = 1;
public static final int MINUTE = 60;
public static final int HOUR = 3600;
public static final int DAY = 86400;

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Please enter a time in seconds:");
		double seconds = key.nextDouble();
		//checks if user input is negative
		if(seconds<0)
		{
			System.out.println("Time cannot be negative!");
			System.exit(0);
		}
		//checks if number of seconds is less than a minute
		else if (seconds<MINUTE)
		{
			System.out.println(seconds + " seconds isn't even one minute!");
		}
		//checks if number of seconds is less than an hour, prints number of minutes if true
		else if(seconds<HOUR)
		{
			System.out.println(seconds + " seconds is the same as " + seconds/MINUTE + " minutes!" );
		}
		//checks if number of seconds is less than a day, prints number of hours if true
		else if(seconds<DAY)
		{
			System.out.println(seconds + " seconds is the same as " + seconds/HOUR + " hours!" );
		}
		//prints number of days since the number of seconds must be greater than 1 day
		else 
		{
			System.out.println(seconds + " seconds is the same as " + seconds/DAY + " days!" );
		}
	}

}
