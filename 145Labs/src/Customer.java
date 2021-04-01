/*
 * David Keen
 * 11/4/19
 * CSCE 145
 * Lab 17
 */
public class Customer 
{
	//private instance variables
	private String customerName;
	private int customerNumber;
	private boolean mailingListStatus;
	//default constructor
	public Customer()
	{
		this.customerName = "no name given";
		this.customerNumber = 0;
		this.mailingListStatus = false;
	}
	//parameterized constructor
	public Customer(String xCustomerName, int xCustomerNumber, boolean xMailingListStatus)
	{
		this.setName(xCustomerName);
		this.setNumber(xCustomerNumber);
		this.setStatus(xMailingListStatus);
	}
	//get methods
	public String getName()
	{
		return this.customerName;
	}
	public int getNumber()
	{
		return this.customerNumber;
	}
	public boolean getStatus()
	{
		return this.mailingListStatus;
	}
	//set methods
	public void setName(String xName)
	{
		this.customerName = xName;
	}
	public void setNumber(int xNumber)
	{
		if(xNumber>=0)
		{
			this.customerNumber = xNumber;
		}
		else
		{
			System.out.println("Invalid value for customer number!");
		}
	}
	public void setStatus(boolean xStatus)
	{
		this.mailingListStatus = xStatus;
	}
	/*
	 * Precondition: all instance variables are defined
	 * Postcondition: all variables are printed onto the console
	 */
	public void writeOutput()
	{
		System.out.println("Customer Name: " + this.customerName);
		System.out.println("Customer Number: " + this.customerNumber);
		System.out.println("Customer on Mailing List: " + this.mailingListStatus);
	}
	

}
