/*
 * David Keen
 * 11/6/19
 * CSCE 145
 * Lab 18
 */
public class Vehicle 
{
	//private instance variables
	private String manufacturerName;
	private int numCylinders;
	private String ownerName;
	//deafault constructor
	public Vehicle()
	{
		this.manufacturerName="manufacturer name unknown";
		this.numCylinders = 1;
		this.ownerName="owner name unknown";
	}
	//Parameterized Constructor
	public Vehicle(String xManName, int xNumCyls, String xOwnName)
	{
		setManName(xManName);
		setNumCyls(xNumCyls);
		setOwnName(xOwnName);
	}
	//get methods
	public String getManName()
	{
		return this.manufacturerName;
	}
	public int getNumCyls()
	{
		return this.numCylinders;
	}
	public String getOwnName()
	{
		return this.ownerName;
	}
	//set methods
	public void setManName(String xManName)
	{
		this.manufacturerName = xManName;
	}
	public void setNumCyls(int xNumCyls)
	{
		if(xNumCyls>0)
		{
			this.numCylinders=xNumCyls;
		}
		else
		{
			System.out.println("Invalid input for number of cylinders!");
		}
	}
	public void setOwnName(String xOwnName)
	{
		this.ownerName = xOwnName;
	}
	/**
	 * Precondition: Instance Variables are defined
	 * PostCondtion: Returns true if the values for this Vehicle equal the Values of the Vehicle in Parenthesis, false otherwise
	 * @param v
	 * @return boolean 
	 */
	public boolean equals(Vehicle v)
	{
		return this.manufacturerName.equalsIgnoreCase(v.getManName())
				&& this.numCylinders == v.getNumCyls()
				&& this.ownerName.equalsIgnoreCase(v.getOwnName());
	}
	/**
	 * Precondition: Instance Variables are defined
	 * Postcondition: returns all the instance variable values of this Vehicle as a String
	 * @return String
	 */
	public String toString()
	{
		return "Manufacturer Name: " + this.manufacturerName + "\nNumber of Cylinders: "+this.numCylinders+ "\nOwner's Name: " + this.ownerName;
	}
	
}
