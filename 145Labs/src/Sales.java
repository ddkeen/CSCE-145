/*
 * David Keen
 * 10/2/19
 * CSCE 145
 * Lab 10
 */
import java.util.Scanner;
public class Sales 
{
	public static final int STORES = 5;
	public static final int INCREMENT = 100;
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		//create array to hold the values of sales for each store
		int[] salesArray = new int[STORES];
		//insert user's values into the array
		for(int i = 0; i<salesArray.length; i++)
		{
			System.out.println("Please enter today's sales for Store " + (i+1) + " to the nearest hundred dollars:");
			salesArray[i] = key.nextInt();
		}
		System.out.println("Here is a bar chart comparing each store's sales: Each asterick represents $100.");
		//nested for loop that goes through the array and prints one asterisk per 100 dollars for each array value
		for(int j=0; j<salesArray.length; j++)
		{
			System.out.print("Store " +(j+1)+ ": ");
			for(int k=100; k<=salesArray[j]; k=k+INCREMENT)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
