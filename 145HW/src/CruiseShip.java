/*
 * David Keen
 * 11/5/19
 * CSCE 145
 * Homework 6
 */
public class CruiseShip extends Ship {
	
	private int capacity;
	private int crew;
	
	public CruiseShip()
	{
		super();
		this.capacity = 0;
		this.crew = 0;
	}
	
	public CruiseShip(String xName, String xLaunchDate, int xCapacity, int xCrew)
	{
		super(xName, xLaunchDate);
		setCapacity(xCapacity);
		setCrew(xCrew);
	}
	
	public int getCapacity()
	{
		return this.capacity;
	}
	public int getCrew()
	{
		return this.crew;
	}
	
	public void setCapacity(int xCapacity)
	{
		if(xCapacity>=0)
		{
			this.capacity = xCapacity;
		}
		else
		{
			System.out.println("Invalid value for capacity!");
		}
	}
	public void setCrew(int xCrew)
	{
		if(xCrew>=0)
		{
			this.crew = xCrew;
		}
		else
		{
			System.out.println("Invalid value for crew number!");
		}
	}
	
	public String toString()
	{
		return ("Ship Name: "+super.getName()+"\nCapacity: " + this.capacity+"\nNumber of Crew Members: " +this.crew);
	}
	
	

}
