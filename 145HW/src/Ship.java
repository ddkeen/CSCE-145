/*
 * David Keen
 * 11/5/19
 * CSCE 145
 * Homework 6
 */
public class Ship {
	private String name;
	private String launchDate;
	
	public Ship()
	{
		this.name = "no name given";
		this.launchDate = "01/18/2001";
	}
	
	public Ship(String xName, String xLaunchDate)
	{
		setLaunchDate(xLaunchDate);
		setName(xName);
	}
	public String getName()
	{
		return this.name;
	}
	public String getLaunchDate()
	{
		return this.launchDate;
	}
	
	public void setName(String xName)
	{
		this.name=xName;
	}
	public void setLaunchDate(String xLaunchDate)
	{
		String last4Digits = xLaunchDate.substring(xLaunchDate.length()-4);
		int year = Integer.parseInt(last4Digits);
		if(year>=1990 && year<=2019)
		{
			this.launchDate = xLaunchDate;
		}
		else
		{
			System.out.println("Invalid launch date entered!");
		}
	}
	
	public String toString()
	{
		return ("Ship Name: "+this.name+"\nLaunch Date: " +this.launchDate);
	}

}
