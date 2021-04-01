import java.util.Scanner;

/*
 * David Keen
 * 10/21/19
 * CSCE 145
 */
public class Apple 
{
	//private instance variables
	private String type;
	private double weight;
	private double price;
	//default constructor
	public Apple()
	{
		this.type = "Gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	//mutator methods
	public void setType(String xType)
	{
		if (!(xType.equalsIgnoreCase("Red Delicious") || xType.equalsIgnoreCase("Golden Delicious") || xType.equalsIgnoreCase("Gala") || xType.equalsIgnoreCase("Granny Smith")))
		{
			System.out.println("Invalid type of Apple!");
		}
		else
		{
			this.type = xType;
		}
	}
	public void setWeight(double xWeight)
	{
		if (xWeight>=0 && xWeight<=2)
		{
			weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	public void setPrice(double xPrice)
	{
		if (xPrice>0)
		{
			price = xPrice;
		}
		else
		{
			System.out.println("Price cannot be negative!");
		}
	}
	//accessor methods
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	//methods
	/**
	 * Precondition: the instance variables must be declared
	 * Postcondition: instance variables are updated with values provided by the user
	 * 
	 */
	public void readInput()
	{
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the type of apple: ");
		
		String xType = key.nextLine();
		setType(xType);
		
		System.out.println("Enter the weight of the apple: ");
		
		double xWeight = key.nextDouble();
		setWeight(xWeight);
		
		System.out.println("Enter the price per apple: ");
		
		double xPrice = key.nextDouble();
		setPrice(xPrice);
	}
	/**
	 * Precondition: the calling objects must contain values
	 * Postcondition: the receiving object displays values on the screen
	 */
	public void writeOutput()
	{
		System.out.println("Type = " + type);
		System.out.println("Weight = " + weight + "kg");
		System.out.println("Price = $" + price);
	}
}
