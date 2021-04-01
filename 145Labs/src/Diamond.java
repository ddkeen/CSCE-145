/*
 * David Keen
 * 11/18/19
 * CSCE 145
 * Lab 21
 */
public class Diamond extends ShapeBasics implements DiamondInterface {
	
	private int width;
	
	//default constructor
	public Diamond()
	{
		super();
		this.width = 0;
	}
	//parameterized constructor
	public Diamond(int xOffset, int xWidth)
	{
		super(xOffset);
		setWidth(xWidth);
	}
	//accessor method
	public int getWidth()
	{
		return this.width;
	}
	//mutator methods
	public void setWidth(int xWidth)
	{
		if (xWidth%2 == 1)
		{
			this.width = xWidth;
		}
		else
		{
			System.out.println("Width must be odd!");
		}
	}
	/**
	 * PreCondition: width is odd and offset is >=0
	 * PostCondition: A diamond is drawn
	 */
	public void drawHere()
	{
		for (int i = 0; i < super.getOffset() + this.width; i++)
        {
        	System.out.print(" ");
        	
        }
		drawTopV();
		drawBottomV();
		
	}
	// draws the top V of the Diamond
	private void drawTopV()
	{
		int newOffset = super.getOffset() + this.width;
		System.out.println("*");
		for (int i = 1; i<this.width; i+=2)
		{
			newOffset--;
			skipSpaces(newOffset);
			System.out.print("*");
			skipSpaces(i);
			System.out.println("*");
		}
	}
	//draws the bottom V of the Diamond
	private void drawBottomV()
	{
		int newOffset = super.getOffset()+ this.width - (this.width/2) + 1;
		for(int i = this.width-4; i>=1; i-=2)
		{
			skipSpaces(newOffset);
			System.out.print("*");
			skipSpaces(i);
			System.out.println("*");
			newOffset++;
		}
		skipSpaces(newOffset);
		System.out.println("*");
	}
	//skips spaces according to the integer in the parameter
	private void skipSpaces(int i)
	{
		for(int j =1; j<=i; j++)
		{
			System.out.print(" ");
		}
		
	}

}
