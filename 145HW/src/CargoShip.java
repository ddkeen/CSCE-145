/*
 * David Keen
 * 11/5/19
 * CSCE 145
 * Homework 6
 */
public class CargoShip extends Ship {
	
	private double tonnage;
	private double maxSpeed;
	
	public CargoShip()
	{
		super();
		this.tonnage = 0;
		this.maxSpeed = 0;
	}
	
	public CargoShip(String xName, String xLaunchDate,double xTonnage, double xMaxSpeed)
	{
		super(xName,xLaunchDate);
		setTonnage(xTonnage);
		setMaxSpeed(xMaxSpeed);
	}
	
	public double getTonnage()
	{
		return this.tonnage;
	}
	public double getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	public void setTonnage(double xTonnage)
	{
		if(xTonnage>=0)
		{
			this.tonnage = xTonnage;
		}
		else
		{
			System.out.println("Invalid value for tonnage!");
		}
	}
	public void setMaxSpeed(double xMaxSpeed)
	{
		if(xMaxSpeed>=0)
		{
			this.maxSpeed = xMaxSpeed;
		}
		else
		{
			System.out.println("Invalid value for max speed!");
		}
	}
	
	public String toString()
	{
		return ("Ship Name: "+super.getName()+"\nTonnage: "+this.tonnage+"\nMax Speed: "+this.maxSpeed);
	}
	
}
