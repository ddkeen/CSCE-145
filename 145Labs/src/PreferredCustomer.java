/*
 * David Keen
 * CSCE 145
 * 11/4/19
 * Lab 17
 */
public class PreferredCustomer extends Customer
{
	//private instance varibales
	private double purchaseAmount;
	private int discountPercentage;
	//default constructor
	public PreferredCustomer()
	{
		super();
		this.discountPercentage = 0;
		this.purchaseAmount = 0.0;
	}
	//parameterized constructor
	public PreferredCustomer(String xCustomerName, int xCustomerNumber, boolean xMailingListStatus, double xPurchaseAmount)
	{
		super(xCustomerName, xCustomerNumber, xMailingListStatus);
		this.setPurchaseAmount(xPurchaseAmount);
		this.determineDiscount();
	}
	//set method
	public void setPurchaseAmount(double xPurchaseAmount)
	{
		if(xPurchaseAmount>=0)
		{
			this.purchaseAmount = xPurchaseAmount;
		}
		else
		{
			System.out.println("Invalid value for purchase amount!");
		}
	}
	//get methods
	public double getPurchaseAmount()
	{
		return this.purchaseAmount;
	}
	public int getDiscountPercentage()
	{
		return this.discountPercentage;
	}
	/*
	 * Precondition: purchase amount > 0 
	 * Postcondition: sets discount percentage to a value 0-10
	 */
	public void determineDiscount()
	{
		if(this.purchaseAmount<500)
		{
			this.discountPercentage = 0;
		}
		else if(this.purchaseAmount<1000)
		{
			this.discountPercentage = 5;
		}
		else if(this.purchaseAmount<1500)
		{
			this.discountPercentage = 7;
		}
		else if(this.purchaseAmount<2000)
		{
			this.discountPercentage = 9;
		}
		else
		{
			this.discountPercentage = 10;
		}
	}
	/*
	 * Precondition: all instance variables are defined
	 * Postcondition: all variables are printed onto the console
	 */
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Purchase Amount: $" + this.purchaseAmount);
		System.out.println("Discount: " + this.discountPercentage +"%");
	}
	
	
	
}