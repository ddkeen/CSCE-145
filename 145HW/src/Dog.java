/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class Dog extends Animal{
	
	private int energyLevel;
	
	public Dog()
	{
		super();
		this.energyLevel = 0;
	}
	
	public Dog(String xName, double xWeight, int xEnergyLevel)
	{
		super(xName, xWeight);
		setEnergyLevel(xEnergyLevel);
	}
	
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int xEnergyLevel)
	{
		if(xEnergyLevel>=0 && xEnergyLevel<=100)
		{
			this.energyLevel = xEnergyLevel;
		}
		else
		{
			System.out.println("Energy Level cannot be negative or over 100!");
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nEnergy Level: " + this.energyLevel;
	}
	public boolean equals(Dog d)
	{
		return super.equals(d) &&  this.energyLevel == d.energyLevel;
	}

}
