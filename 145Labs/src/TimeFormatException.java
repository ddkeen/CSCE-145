/*
 * David Keen
 * 11/20/19
 * CSCE 145
 * Lab 22
 */
public class TimeFormatException extends Exception{
	
	public TimeFormatException()
	{
		super("EXCEPTION: This is an Incorrect Time.");
	}
	
	public TimeFormatException(String msg)
	{
		super(msg);
	}
	
	

}
