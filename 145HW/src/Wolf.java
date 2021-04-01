/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class Wolf extends Dog{
	
	private String packLeaderName;
	
	public Wolf()
	{
		super();
		this.packLeaderName = "no name yet";
	}
	
	public Wolf(String xName, double xWeight, int xEnergyLevel, String xPackLeaderName)
	{
		super(xName, xWeight,xEnergyLevel);
		setPackLeaderName(xPackLeaderName);
	}
	
	public String getPackLeaderName()
	{
		return this.packLeaderName;
	}
	
	public void setPackLeaderName(String xPackLeaderName)
	{
		this.packLeaderName = xPackLeaderName;
	}
	
	public String toString()
	{
		return super.toString() + "\nPack Leader Name: " + this.packLeaderName;
	}
	
	public boolean equals(Wolf w)
	{
		return super.equals(w)&&this.packLeaderName.equalsIgnoreCase(w.getPackLeaderName());
	}
	
	

}
