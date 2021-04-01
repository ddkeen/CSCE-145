/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class Cat extends Animal {
	
	private String mood;
	
	public Cat()
	{
		super();
		this.mood = "no mood yet";
	}
	
	public Cat(String xName, double xWeight, String xMood)
	{
		super(xName, xWeight);
		setMood(xMood);
	}
	
	public String getMood()
	{
		return this.mood;
	}
	
	public void setMood(String xMood)
	{
		if (xMood.equalsIgnoreCase("hungry") || xMood.equalsIgnoreCase("sleepy") || xMood.equalsIgnoreCase("playful"))
		{
			this.mood = xMood;
		}
		else
		{
			System.out.println("Invalid mood entered!");
		}
	}
	
	public String toString()
	{
		return super.toString()+"\nMood: "+this.mood;
	}
	
	public boolean equals(Cat c)
	{
		return super.equals(c) && this.mood.equalsIgnoreCase(c.getMood());
	}
	

}
