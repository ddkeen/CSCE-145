/*
 * David Keen
 * 10/30/19
 * CSCE 145
 * Lab 16
 */
public class Concert {
	//private instance variables
	private String name;
	private int capacity;
	private int tixSoldByPhone;
	private int tixSoldAtVenue;
	private double pricePhone;
	private double priceVenue;
	//default constructor
	public Concert()
	{
		this.name = "no name yet";
		this.capacity = 0;
		this.tixSoldByPhone = 0;
		this.tixSoldAtVenue = 0;
		this.pricePhone = 0;
		this.priceVenue = 0;
	}
	//parameterized constructor
	public Concert(String xName, int xCapacity, double xPricePhone, double xPriceVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setPriceByPhone(xPricePhone);
		this.setPriceAtVenue(xPriceVenue);
	}
	//another parameterized constructor with amount of tickets sold
	public Concert(String xName, int xCapacity, int xTixSoldByPhone, int xTixSoldAtVenue, double xPricePhone, double xPriceVenue)
	{
		this.setBandName(xName);
		this.setCapacity(xCapacity);
		this.setTixSoldByPhone(xTixSoldByPhone);
		this.setTixSoldAtVenue(xTixSoldAtVenue);
		this.setPriceByPhone(xPricePhone);
		this.setPriceAtVenue(xPriceVenue);
	}
	//get methods
	public String getBandName()
	{
		return this.name;
	}
	public int getCapacity()
	{
		return this.getCapacity();
	}
	public int getNumTicketsSoldByPhone()
	{
		return this.tixSoldByPhone;
	}
	public int getNumTicketsSoldAtVenue()
	{
		return this.tixSoldAtVenue;
	}
	public double getPricePhone()
	{
		return this.pricePhone;
	}
	public double getPriceVenue()
	{
		return this.priceVenue;
	}
	//set methods
	public void setBandName(String xName)
	{
		this.name = xName;
	}
	public void setCapacity(int xCapacity)
	{
		if(xCapacity>=0)
		{
			this.capacity =xCapacity;
		}
		else
		{
			System.out.println("Invalid value for capacity!");
		}
	}
	public void setTixSoldByPhone(int xTixSoldByPhone)
	{
		if(xTixSoldByPhone>=0 && xTixSoldByPhone<=this.capacity-this.tixSoldAtVenue)
		{
			this.tixSoldByPhone = xTixSoldByPhone;
		}
		else if(xTixSoldByPhone<0)
		{
			System.out.println("The value for tickets sold by phone cannot be negative!");
		}
		else
		{
			System.out.println("The concert has sold out!");
		}
		
	}
	public void setTixSoldAtVenue(int xTixSoldAtVenue)
	{
		if(xTixSoldAtVenue>=0 && xTixSoldAtVenue<=this.capacity-this.tixSoldByPhone)
		{
			this.tixSoldAtVenue = xTixSoldAtVenue;
		}
		else if (xTixSoldAtVenue<0)
		{
			System.out.println("Value for tickets sold at the venue cannot be negative!");
		}
		else
		{
			System.out.println("The concert has sold out!");
		}
	}
	public void setPriceByPhone(double xPricePhone)
	{
		if(xPricePhone>=0)
		{
			this.pricePhone = xPricePhone;
		}
		else
		{
			System.out.println("Invalid value for price for a ticket bought by phone!");
		}
	}
	public void setPriceAtVenue(double xPriceVenue)
	{
		if(xPriceVenue>=0)
		{
			this.priceVenue = xPriceVenue;
		}
		else
		{
			System.out.println("Invalid value for price for a ticket bought at the venue!");
		}
	}
	/**
	 * Precondition: values tixSoldAtVenue and tixSoldByPhone are both >= 0
	 * Postcondition: returns the total number of tickets sold
	 * @return int
	 */
	public int totalNumberOfTicketsSold()
	{
		return this.tixSoldAtVenue + this.tixSoldByPhone;
	}
	/**
	 * Precondition: values for tickets sold and capacity are all >=0
	 * Postcondition: returns the number of tickets remaining
	 * @return int
	 */
	public int ticketsRemaining()
	{ 
		if(this.capacity - this.totalNumberOfTicketsSold()<0)
		{
			System.out.println("The concert has sold out!");
		}
		return this.capacity - this.totalNumberOfTicketsSold();
	}
	/**
	 * Precondition: tixSoldAtVenue + tixSoldByPhone is less than the capacity
	 * Postcondition: adds the number of tickets bought to the number of tickets sold at venue
	 * @param tix
	 */
	public void buyTicketsAtVenue(int tix)
	{
		this.setTixSoldAtVenue(this.tixSoldAtVenue + tix);
	}
	/**
	 * Precondition: tixSoldAtVenue + tixSoldByPhone is less than the capacity
	 * Postcondition: adds the number of tickets bought to the number of tickets sold by phone
	 * @param tix
	 */
	public void  buyTicketsByPhone(int tix)
	{
		this.setTixSoldByPhone(this.tixSoldByPhone + tix);
	}
	/**
	 * Precondition: the price and number of tickets sold are both >=0
	 * Postcondtion: returns the total revenue by multiplying the number of tickets sold by the price for both by phone and at the venue and adding them
	 * @return double
	 */
	public double totalSales()
	{
		return this.tixSoldAtVenue*this.priceVenue + this.tixSoldByPhone*this.pricePhone;
	}

	
}
