
public class Undergraduate extends Student	{
	
	private int level;
	private String minor;
	
	//default constructor
	
	public Undergraduate()
	{
		super();
		this.level = 1;	//freshman
		this.minor = "no minor selected";
	}
	
	public Undergraduate(String xName, int xAge, int xID, String xMajor, double xGpa, int xLevel, String xMinor)
	{
		super(xName, xAge, xID, xMajor, xGpa);
		this.setLevel(xLevel);
		this.setMinor(xMinor);
	}
	
	public int getLevel()
	{
		return this.level;
	}
	public String getMinor()
	{
		return this.minor;
	}
	
	public void setLevel(int xLevel)
	{
		if(xLevel>= 1 && xLevel<=5)
		{
			this.level = xLevel;
		}
		else
		{
			System.out.println("Invalid value for undergraduate level!");
		}
	}
	
	public void setMinor(String xMinor)
	{
		if(xMinor.equalsIgnoreCase("Math")
				||xMinor.equalsIgnoreCase("Music Preformance")
				||xMinor.equalsIgnoreCase("Economics")
				||xMinor.equalsIgnoreCase("Computer Science")
				||xMinor.equalsIgnoreCase("History")
				||xMinor.equalsIgnoreCase("Education"));
		{
			this.minor = xMinor;
		}
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Level: " + this.level+ "\nMinor : " + this.minor);
	}

}
