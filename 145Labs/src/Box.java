/*
 * David Keen
 * 11/13/19
 * CSCE 145
 * Lab 20
 */
public class Box {

	//private instance variables
	private String label;
	private double length;
	private double width;
	private double height;
	
	//default constructor
	public Box()
	{
		this.label = "no label yet";
		this.length = 0;
		this.width = 0;
		this.height = 0;
	}
	//parameterized constructor
	public Box(String xLabel, double xLength, double xWidth, double xHeight)
	{
		setLabel(xLabel);
		setLength(xLength);
		setWidth(xWidth);
		setHeight(xHeight);
	}
	//acessor methods
	public String getLabel()
	{
		return this.label;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	//mutator methods
	public void setLabel(String xLabel)
	{
		this.label = xLabel;
	}
	public void setLength(double xLength)
	{
		if(xLength>0)
		{
			this.length = xLength;
		}
		else
		{
			System.out.println("The dimensions of the box cannot have a negative value! Invalid Input!");
		}
	}
	public void setWidth(double xWidth)
	{
		if(xWidth>0)
		{
			this.width = xWidth;
		}
		else
		{
			System.out.println("The dimensions of the box cannot have a negative value! Invalid Input!");
		}
	}
	public void setHeight(double xHeight)
	{
		if(xHeight>0)
		{
			this.height = xHeight;
		}
		else
		{
			System.out.println("The dimensions of the box cannot have a negative value! Invalid Input!");
		}
	}
	/**
	 * Precondition: parameters for length, width, and height are all greater than 0
	 * Postcondition: returns the Volume of the box by multiplying these values
	 * @return double
	 */
	public double getBox()
	{
		return this.height*this.length*this.width;
	}
	/**
	 * Precondition: instance variabels are defined and valid
	 * Postcondition: returns a string containing the box's label and volume
	 * @return String
	 */
	public String toString()
	{
		return "Box Label: " + getLabel() + "\nVolume: " + getBox() + " cubic ft.";
	}
	
}

