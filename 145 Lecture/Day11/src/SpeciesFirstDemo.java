import java.util.Scanner;
public class SpeciesFirstDemo 
{

	public static void main(String[] args) {
		SpeciesFirst sp1 = new SpeciesFirst();
		
		sp1.readInput();
		sp1.writeOutput();
		sp1.name = "Rabbit";
		sp1.writeOutput();
		
		Scanner key = new Scanner(System.in);
		System.out.println("Please enter the amount of years you would like to calculate the population for:");
		
		int year = key.nextInt();
		
		if(year>0)
		{
			int futurePopulation = sp1.getFuturePopulation(year);
		
			System.out.println("Population in the next " + year + " years: " + futurePopulation);
		}
		else
		{
			System.out.println("Invalid value for year!");
		}
		
		
	}

}
