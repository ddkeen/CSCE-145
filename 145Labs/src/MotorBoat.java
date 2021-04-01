/*
 * David Keen
 * 10/28/19
 * CSCE 145
 * Lab 15
 */
public class MotorBoat 
{
	//private instance variables
	private double capacity;
	private double maxSpeed;
	private double efficiency;
	//default constructor
	public MotorBoat()
	{
		this.capacity = 45;
		this.maxSpeed = 50;
		this.efficiency = .03;
	}
	//parameterized constructor
	public MotorBoat(double xCapacity, double xMaxSpeed, double xEfficiency)
	{
		this.setCapacity(xCapacity);
		this.setMaxSpeed(xMaxSpeed);
		this.setEfficiency(xEfficiency);
	}
	//copy constructor
	public MotorBoat(MotorBoat bob)
	{
		this.setCapacity(bob.getCapacity());
		this.setMaxSpeed(bob.getMaxSpeed());
		this.setEfficiency(bob.getEfficiency());
	}
	//get methods
	public double getCapacity()
	{
		return this.capacity;
	}
	public double getMaxSpeed()
	{
		return this.maxSpeed;
	}
	public double getEfficiency()
	{
		return this.efficiency;
	}
	//set methods
	public void setCapacity(double xCapacity)
	{
		if(xCapacity>0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("Invalid Input for Capacity!");
		}
	}
	public void setMaxSpeed(double xMaxSpeed)
	{
		if(xMaxSpeed>0)
		{
			this.maxSpeed = xMaxSpeed;
		}
		else
		{
			System.out.println("Invalid Input for Max Speed!");
		}
	}
	public void setEfficiency(double xEfficiency)
	{
		if(xEfficiency>0)
		{
			this.efficiency = xEfficiency;
		}
		else
		{
			System.out.println("Invalid Input for Efficiency!");
		}
	}
	//methods
	/**
	 * PreCondition: instance variables are defined
	 * PostCondition: a string is returned containing all the instance variables
	 * @return String
	 */
	public String toString()
	{
		return ("Capacity of the Fuel Tank: " + this.capacity + " Gallons" +"\nMaximum Speed of the Boat: " + this.maxSpeed + " Knotts" + "\nEfficiency of the Boat's Motor: " + this.efficiency);
	}
	/**
	 * Precondition: current speed is less than max speed
	 * Postcondition: Calculates and returns the time taken to reach the destination using the formula: Time taken = distance traveled / current speedi
	 * @param speed
	 * @param distance
	 * @return double
	 */
	public double timeTakenToReachDestination(double speed, double distance)
	{
		if(speed>this.maxSpeed)
		{
			System.out.println("Current Speed cannot be greater than Max Speed!");
			System.exit(0);
		}
		return distance / speed;

	}
	/**
	 * Precondition: current speed is less than max speed
	 * Postcondition: Calculates and returns the amountOfFuel used by the boat using the formula: AmountOfFuel = motorEfficiency * time * (current speed)^2
	 * @param speed
	 * @param time
	 * @return
	 */
	public double amountOfFuelUsed(double speed, double time) 
	{
		if(speed>this.maxSpeed)
		{
			System.out.println("Current Speed cannot be greater than Max Speed!");
			System.exit(0);
		}
		return this.efficiency*time*speed*speed;
	}
	
	
	
	
	
}

	
