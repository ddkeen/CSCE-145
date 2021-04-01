/*10/24/19
 * 
 */
public class Shopping 
{
	//private instance variables
	private String itemName;
	private double price;
	private double weight;
	private int quantity;
	//default constructor
	public Shopping()
	{
		this.itemName = "unknown";
		this.price = 0;
		this.weight = 0;
		this.quantity = 0;
	}
	
	//parameterized constructor
	public Shopping(String xItemName, double xPrice, double xWeight, int xQuantity)
	{
		this.setItemName(xItemName);
		this.setPrice(xPrice);
		this.setWeight(xWeight);
		this.setQuantity(xQuantity);
	}
	
	//copy constructor
	public Shopping(Shopping sh)
	{
		this.setItemName(sh.getItemName());
		this.setPrice(sh.getPrice());
		this.setWeight(sh.getWeight());
		this.setQuantity(sh.getQuantity());
	}
	
	//accessor methods
	public String getItemName()
	{
		return this.itemName;
	}
	public double getPrice()
	{
		return this.price;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public void setItemName(String xItemName)
	{
		this.itemName = xItemName;
	}
	//mutator methods
	public void setPrice(double xPrice)
	{
		if(xPrice>0)
		{
			this.price = xPrice;
		}
		else
		{
			System.out.println("Invalid value for price!");
		}
	}
	public void setWeight(double xWeight)
	{
		if(xWeight>0)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	public void setQuantity(int xQuantity)
	{
		if(xQuantity>0)
		{
			this.quantity = xQuantity;
		}
		else
		{
			System.out.println("Invalid value for quantity");
		}
	}
	//methods
	public String toString()
	{
		return "Item Name: " + this.itemName  + "\nPrice: "
				+this.price+ "\nWeight: " + this.weight+ "\nQuantity: " 
				+this.quantity;
	}
	public boolean equals(Shopping sh)
	{
		return this.itemName.equalsIgnoreCase(sh.getItemName())
				&& this.price==sh.getPrice()
				&& this.weight==sh.getWeight()
				&& this.quantity==sh.getQuantity();
	}
	
	public double totalPrice()
	{
		return this.price * this.quantity;
	}
	
	public double totalPrice(double xPrice)
	{
		return xPrice * this.quantity;
	}
	
	
}
