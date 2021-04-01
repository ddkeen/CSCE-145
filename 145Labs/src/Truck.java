/*
 * David Keen
 * 11/6/19
 * CSCE 145
 * Lab 18
 */
public class Truck extends Vehicle {
	//private instance variables
	private double loadCapacity;
	private double towingCapacity;
	//default constructor
	public Truck()
	{
		super();
		this.loadCapacity = 0;
		this.towingCapacity =0;
	}
	//parameterized constructor
	public Truck(String xManName, int xNumCyls, String xOwnName, double xLoadCap, double xTowCap)
	{
		super(xManName, xNumCyls, xOwnName);
		setLoadCap(xLoadCap);
		setTowCap(xTowCap);
	}
	//get methods
	public double getLoadCap()
	{
		return this.loadCapacity;
	}
	public double getTowCap()
	{
		return this.towingCapacity;
	}
	//set methods
	public void setLoadCap( double xLoadCap)
	{
		if(xLoadCap>=0)
		{
			this.loadCapacity = xLoadCap;
		}
		else
		{
			System.out.println("Invalid value for load capacity!");
		}
	}
	public void setTowCap( double xTowCap)
	{
		if(xTowCap>=0)
		{
			this.towingCapacity = xTowCap;
		}
		else
		{
			System.out.println("Invalid value for towing capacity!");
		}
	}
	/**
	 * Precondition: Instance Variables are defined
	 * PostCondtion: Returns true if the values for this Truck equal the Values of the Truck in Parenthesis, false otherwise
	 * @param t
	 * @return boolean 
	 */
	//overridden method from Vehicle Class
	public boolean equals(Truck t)
	{
		return super.equals(t)
				&& this.loadCapacity == t.getLoadCap()
				&& this.towingCapacity == t.getTowCap();
	}
	/**
	 * Precondition: Instance Variables are defined
	 * Postcondition: returns all the instance variable values of this Vehicle as a String
	 * @return String
	 */
	//overridden method from Vehicle Class
	public String toString()
	{
		return super.toString()+"\nLoad Capacity: " + this.loadCapacity + "\nTowing Capacity: "+ this.towingCapacity;
	}
}
