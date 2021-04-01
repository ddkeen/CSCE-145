/*
 * David Keen
 * 10/22/19
 * CSCE 145
 * Homework 5
 */
public class Coffee 
{
	//private instance variables
	private double caffeine;
	private String name;
	
	//default constructor
	public Coffee()
	{
		this.name = "iced";
		this.caffeine = 100;
	}
	
	//accessor methods
	public double getCaffeineContent()
	{
		return this.caffeine;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	//mutator methods
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setCaffeineContent(double xCaffeine)
	{
		if(xCaffeine<50)
		{
			System.out.println("Invalid amount! Caffeine content is too low. The default caffeine value is 100");
		}
		else if(xCaffeine>300)
		{
			System.out.println("Invalid amount! Caffeine content is too high. The default caffeine value is 100");
		}
		else
		{
			this.caffeine = xCaffeine;
		}
	}
	/**
	 * PreCondition: caffeine has a value greater than 50 and less than 300
	 * PostCondition: The maximum amount of this coffee with this caffeine content that can be safely consumed
	 * @return SafeNumCups
	 */
	public int riskyAmount()
	{
		//this is the formula for the amount of coffee that can be drinken safely
		double numCups = (180.0/((this.getCaffeineContent()/100.0)*6));
		int SafeNumCups = (int) numCups;
		return SafeNumCups;
	}
}
