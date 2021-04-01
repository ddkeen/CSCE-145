/*
 * David Keen
 * 10/8/19
 * CSCE 145
 * Homework 4
 */
import java.util.Scanner;
public class TacoSorter 
{
	//The number of tacos to be sorted is always 10
	public static final int NUMTACOS = 10;
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		String[] names = new String[NUMTACOS];
		double [] prices = new double[NUMTACOS];
		System.out.println("Welcome to Taco Stop!");
		System.out.println();
		
		//for loop to obtain user input and add it to to price and names arrays
		for(int i = 0; i<NUMTACOS; i++)
		{
			System.out.println("Please enter the name of a taco: ");
			names[i] = key.next();
			System.out.println("Please enter the price of that taco: ");
			prices[i] = key.nextDouble();
		}
		
		//print both arrays side by side before they have been sorted
		System.out.println();
		System.out.println("Here is a list of all the tacos");
		for(int j = 0; j<prices.length; j++)
		{
			System.out.print(names[j] + ": $" +prices[j]+" ");		
			System.out.println();
		}
		System.out.println();
		
		
		//nested for loop to check for the smallest remaining price in the array
		for(int k=0; k< prices.length; k++)
		{
			double smallest = prices[k];
			int minIndex = k;
			for(int i = k+1; i<prices.length; i++)
			{
				//if the price at position i is less than the smallest price, the smallest price changes
				if(prices[i]<smallest)
				{
					smallest = prices[i];
					minIndex=i;
				}
			}
			
			//swaps values in both arrays if any value after the value at position k is smaller
			if(smallest < prices[k])
			{
				double temp = prices[k];
				prices[k] = prices[minIndex];
				prices[minIndex] = temp;
				String temp2 = names[k];
				names[k] = names[minIndex];
				names[minIndex] = temp2;
				
			}
		}
		//print the arrays after all values have been sorted
		System.out.println("Here is a list of all the tacos sorted by cheapest to most expensive:");
		for(int j = 0; j<prices.length; j++)
		{
			System.out.print(names[j] + ": $" +prices[j]+" ");		
			System.out.println();
		}
		System.out.println();
			
		}
	
	/* (Sample Output)
	Welcome to Taco Stop!
	
	Please enter the name of a taco: 
	tuna
	Please enter the price of that taco: 
	3.99
	Please enter the name of a taco: 
	cheese
	Please enter the price of that taco: 
	2.68
	Please enter the name of a taco: 
	mega
	Please enter the price of that taco: 
	7.99
	Please enter the name of a taco: 
	carne
	Please enter the price of that taco: 
	5.88
	Please enter the name of a taco: 
	pollo
	Please enter the price of that taco: 
	4.20
	Please enter the name of a taco: 
	party
	Please enter the price of that taco: 
	19.49
	Please enter the name of a taco: 
	mini
	Please enter the price of that taco: 
	.99
	Please enter the name of a taco: 
	meal
	Please enter the price of that taco: 
	8.88
	Please enter the name of a taco: 
	doritos
	Please enter the price of that taco: 
	6.11
	Please enter the name of a taco: 
	vegan
	Please enter the price of that taco: 
	7.11
	
	Here is a list of all the tacos
	tuna: $3.99 
	cheese: $2.68 
	mega: $7.99 
	carne: $5.88 
	pollo: $4.2 
	party: $19.49 
	mini: $0.99 
	meal: $8.88 
	doritos: $6.11 
	vegan: $7.11 

	Here is a list of all the tacos sorted by cheapest to most expensive:
	mini: $0.99 
	cheese: $2.68 
	tuna: $3.99 
	pollo: $4.2 
	carne: $5.88 
	doritos: $6.11 
	vegan: $7.11 
	mega: $7.99 
	meal: $8.88 
	party: $19.49 
	 */


		
		
	}

