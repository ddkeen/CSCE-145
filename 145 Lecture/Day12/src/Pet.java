
public class Pet 
{
	
	//instance variables
	private String name;
	private String type;
	private int age;
	private double weight;
	
	//default constructor
	public Pet()
	{
		this.name = "no name yet";
		this.type = "unknown";
		this.age = 0;
		this.weight = 0;
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setType(String xType)
	{
		if(xType.equalsIgnoreCase("dog") || xType.equalsIgnoreCase("ferret") || xType.equalsIgnoreCase("chinchilla") || xType.equalsIgnoreCase("cat") || xType.equalsIgnoreCase("butterfly"));
		{
			this.type = xType;
		}
		else
		{
			System.out.println("Invalid type entered!");
		}
	}
	
	public void setAge(int xAge)
	{
		if(xAge > 0 && xAge < 150)
		{
			this.age = xAge;
		}
		else
		{
			System.out.println("Invalid value for age!");
		}
	}
	
	public void setWeight(double xWeight)
	{
		if (xWeight>0)
		{
			this.weight = xWeight;
		}
		else
		{
			System.out.println("Invalid value for weight!");
		}
	}
	public boolean equals(Pet p)
	{
		return p.getName().equalsIgnoreCase(this.name)
				&& p.getType().equalsIgnoreCase(this.type)
				&&p.getAge() == this.age
				&& p.getWeight() ==this.weight;
	}
	
	public String toString()
	{
		return "Name: " + this.name
				+"\nType: " + this.type
				+"\nAge: " + this.age
				+"\nWeight: " + this.weight;
	}
	
}
