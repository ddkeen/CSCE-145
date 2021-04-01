/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class DomesticDog extends Dog {
	
	private String type;
	
	public DomesticDog()
	{
		super();
		this.type = "no type yet";
	}
	
	public DomesticDog(String xName, double xWeight, int xEnergyLevel, String xType)
	{
		super(xName, xWeight, xEnergyLevel);
		setType(xType);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("Retriever") || xType.equalsIgnoreCase("Terrier") || xType.equalsIgnoreCase("Husky") || xType.equalsIgnoreCase("Yappy")|| xType.equalsIgnoreCase("Mutt"))
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type of dog!");
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nType: " + this.type;
	}
	
	public boolean equals(DomesticDog d)
	{
		return super.equals(d) && this.type.equalsIgnoreCase(d.getType());
	}

}
