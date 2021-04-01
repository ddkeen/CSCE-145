/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class HouseCat extends Cat{
	
private String type;
	
	public HouseCat()
	{
		super();
		this.type = "no type yet";
	}
	
	public HouseCat(String xName, double xWeight, String xMood, String xType)
	{
		super(xName, xWeight, xMood);
		setType(xType);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Short Hair") || xType.equalsIgnoreCase("Boombay") || xType.equalsIgnoreCase("Ragdoll") || xType.equalsIgnoreCase("Sphinx")|| xType.equalsIgnoreCase("Scottish Fold"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type of Cat!");
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nType: " + this.type;
	}
	
	public boolean equals(HouseCat c)
	{
		return super.equals(c) && this.type.equalsIgnoreCase(c.getType());
	}



}
