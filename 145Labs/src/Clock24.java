/*
 * David Keen
 * 11/20/19
 * CSCE 145
 * Lab 22
 */
public class Clock24 {
	//private instance variables
	private int hours;
	private int minutes;
	private boolean isAM;
	//default contructor
	public Clock24()
	{
		this.hours = 0;
		this.minutes = 0;
		this.isAM = true;
	}
	//parameterized constructor
	public Clock24(int xHours, int xMinutes, boolean xIsAM)
	{
		setHours(xHours);
		setMinutes(xMinutes);
		setIsAM(xIsAM);
	}
	//accessor methods
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public boolean getIsAM()
	{
		return this.isAM;
	}
	//mutator methods
	public void setHours(int xHours)
	{
		if(xHours>=0 && xHours<24)
		{
			this.hours = xHours;
		}
		else
		{
			System.out.println("Invalid value for hours");
		}
	}
	
	public void setMinutes(int xMinutes)
	{
		if(xMinutes<60 && xMinutes>=0)
		{
			this.minutes = xMinutes;
		}
		else
		{
			System.out.println("Invalid value for minutes");
		}
	}
	
	public void setIsAM(boolean xIsAM)
	{
		this.isAM =xIsAM;
	}
	/**
	 * PreCondition: variables for hours and time are valid (0-23 and 0-59)
	 * PostCondition: Instance variables are changed for setting the proper time in 12 hour format
	 * @param xHours
	 * @param xMinutes
	 * @throws TimeFormatException
	 */
	public void setTime(int xHours, int xMinutes) throws TimeFormatException
	{
		
		if(xHours<0 || xHours >23 || xMinutes<0 || xMinutes>59)
		{
			throw new TimeFormatException();
		}
		else if(xHours>=12)
		{
			this.hours = (xHours-12);
			this.minutes = xMinutes;
			this.isAM = false;
		}
		else
		{
			this.isAM = true;
		}
		
	}
	/**
	 * Precondition: the variable time is a String that represents 24 hour time(hour:minute)
	 * Postcondition: Instance variables are changed for setting the proper time in 12 hour format 
	 * @param time
	 * @throws TimeFormatException
	 */
	public void setTime(String time) throws TimeFormatException
	{
		int semi = time.indexOf(":");
		if(semi == -1)
		{
			throw new TimeFormatException();
			
		}
		String hour = time.substring(0,semi);
		String minute = time.substring(semi+1);
		try
		{
			 this.hours = Integer.parseInt(hour,10);
			 this.minutes = Integer.parseInt(minute,10);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		setTime(this.hours, this.minutes);
		
	}
	//method to print the time onto the console using the instance variables
	public void printTime()
	{
		if(this.hours==0)
		{
			this.hours = 12;
		}
		String day = "";
		if(this.isAM)
		{
		  day = "AM";
		}
		else
		{
		  day = "PM";
		}
		if(this.minutes<10)
		{
			System.out.println("The time is " + this.hours + ":" +"0"+ this.minutes + " " + day );
		}
		else
		{
			System.out.println("The time is " + this.hours + ":" + this.minutes + " " + day );
		}
	}
	

}
