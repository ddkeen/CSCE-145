/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class Leopard extends Cat{
	
	private int numberOfSpots;
	
	public Leopard()
	{
		super();
		this.numberOfSpots = 0;
	}
	
	public Leopard(String xName, double xWeight, String xMood, int xNumberOfSpots)
	{
		super(xName, xWeight,xMood);
		setNumberOfSpots(xNumberOfSpots);
	}
	
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	
	public void setNumberOfSpots(int xNumberOfSpots)
	{
		this.numberOfSpots = xNumberOfSpots;
	}
	
	public String toString()
	{
		return super.toString() + "\nNumber Of Spots: " + this.numberOfSpots;
	}
	
	public boolean equals(Leopard l)
	{
		return super.equals(l)&&this.numberOfSpots==(l.getNumberOfSpots());
	}
	

}
