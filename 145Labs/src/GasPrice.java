/*
 * David Keen
 * 10/7/19
 * CSCE 145
 * Lab 11
 */
import java.util.Scanner;

public class GasPrice 
{
	//constant for number of days in week; this will be the length of our array
	public static final int DAYSINWEEK = 7;
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		double [] gas = new double[DAYSINWEEK];
		System.out.println("We are going to look at the gas price data for the past week.");
		//for loop to input values into the array
		for (int i =0; i<gas.length; i++)
		{
			System.out.println("Please enter the price per gallon for day " +(i+1)+ ":");
			gas[i] = key.nextDouble();
		}
		//create variable average that will eventually hold the average value of the array
		double average = 0;
		//for loop that gets the sum of the values in the array
		for (int i =0; i<gas.length; i++)
		{
			average+=gas[i];
		}
		//divides the sum of all the values by the number of values to get the sum
		average = average/7;
		
		System.out.println("The average price per gallon during the last 7 days = $" +average);
		
		System.out.println("The price was above average on");
		//for loop that checks if the price on each day was greater than the average price
		for (int i =0; i<gas.length; i++)
		{
			if(gas[i]>average)
			{
				System.out.println("Day " + i + ": $" + gas[i]);
			}
		}
	}

}
