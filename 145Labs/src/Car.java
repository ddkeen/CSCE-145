/*
 * David Keen
 * 11/6/19
 * CSCE 145
 * Lab 18
 */
public class Car extends Vehicle{
	//private instance variables
	private double gasMileage;
	private int numPassengers;
	//default constructor
	public Car()
	{
		super();
		this.gasMileage =0;
		this.numPassengers = 0;
	}
	//parameterized constructor
	public Car(String xManName, int xNumCyls, String xOwnName, double xGasMileage, int xNumPass)
	{
		super(xManName, xNumCyls, xOwnName);
		setGasMileage(xGasMileage);
		setNumPass(xNumPass);
	}
	//get methods
	public double getGasMileage()
	{
		return this.gasMileage;
	}
	public double getNumPass()
	{
		return this.numPassengers;
	}
	//set methods
	public void setGasMileage(double xGasMileage)
	{
		if(xGasMileage>=0)
		{
			this.gasMileage = xGasMileage;
		}
		else
		{
			System.out.println("Invalid input for gas mileage!");
		}
	}
	public void setNumPass(int xNumPass)
	{
		if(xNumPass>=0)
		{
			this.numPassengers = xNumPass;
		}
		else
		{
			System.out.println("Invalid input for number of passengers!");
		}
	}
	/**
	 * Precondition: Instance Variables are defined
	 * PostCondtion: Returns true if the values for this Car equal the Values of the Car in Parenthesis, false otherwise
	 * @param c
	 * @return boolean 
	 */
	//overridden method from Vehicle Class
	public boolean equals(Car c)
	{
		return super.equals(c)
				&& this.gasMileage == c.getGasMileage()
				&& this.numPassengers == c.getNumPass();
	}
	/**
	 * Precondition: Instance Variables are defined
	 * Postcondition: returns all the instance variable values of this Vehicle as a String
	 * @return String
	 */
	//overridden method from Vehicle Class
	public String toString()
	{
		return super.toString()+"\nGas Mileage: " + this.gasMileage + "\nNumber of Passengers: " + this.numPassengers;
	}

}
