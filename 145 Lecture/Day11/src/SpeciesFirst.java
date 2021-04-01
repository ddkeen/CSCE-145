import java.util.Scanner;
public class SpeciesFirst 
{
	//instance variables
	public String name;
	public int population;
	public double growthRate;
	//"private" = encapsulation - information hiding
	
	/**
	 * Precondition: the instance variables must be declared
	 * Postcondition: instance variables are updated with values provided by the user
	 * 
	 */
	public void readInput()
	{
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the name of the species:");
		
		name = key.nextLine();
		
		System.out.println("Enter the population:");
		
		population = key.nextInt();
		
		System.out.println("Enter the growth rate (in %):");
		
		growthRate = key.nextDouble();
	}
	/**
	 * Precondition: the calling objects must contain values
	 * Postcondition: the receiving object displays values on the screen
	 */
	public void writeOutput()
	{
		System.out.println("Species Name: " + name);
		System.out.println("Pupulation: " + population);
		System.out.println("Growth Rate: " + growthRate + "%");
	}
	
	public int populationIn10()
	{
		int result = 0;
		int count = 10;
		double populationAmount = population;
		
		while(count>0 && populationAmount>0)
		{
			populationAmount += populationAmount * (growthRate/100);
			count--;
		}
		
		if (populationAmount > 0)
		{
			result = (int) populationAmount;
		}
		
		return result;
		
	}
	
	/**
	 * Precondition: years is a non-negative value
	 * Postcondition: the future population is returned
	 * @param years
	 * @return population
	 */
	public int getFuturePopulation(int years)
	{
		int result = 0;
		int count = years;
		double populationAmount = population;
		
		while(count > 0 && populationAmount> 0 )
		{
			populationAmount += populationAmount * (growthRate/100);
			count--;
		}
		
		if(populationAmount >0)
		{
			result = (int) populationAmount;
		}
		
		return result;
		
	}
}
