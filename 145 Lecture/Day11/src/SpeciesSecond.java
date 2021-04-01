
public class SpeciesSecond {

	private String name;
	private int population;
	private double growthRate;
	
	//constructor
	
	public SpeciesSecond()
	{
		this.name = "name unknown";
		this.population = 0;
		this.growthRate = 0.0;
	}
	
	public void writeOutput()
	{
		System.out.println("Name = " + name);
		System.out.println("Population = " + population);
		System.out.println("Growth Rate = " + growthRate);
		
	}
	//mutators
	public void setName(String xName)
	{
		this.name = xName;
	}
	
	public void setPopulation(int pop)
	{
		if (pop>=0)
		{
			this.population = pop;
		}
		else
		{
			System.out.println("An invalid value was entered");
		}
	}
	
	public void setGrowthRate(double grow)
	{
		this.growthRate = grow;
	}
	
	//accessors
	public String getName()
	{
		return this.name;
	}
	public int getPopulation()
	{
		return this.population;
	}
	public double getGrowthRate()
	{
		return this.growthRate;
	}
	
	//equals method
	public boolean equals(SpeciesSecond ss)
	{
		return ss.getName().equalsIgnoreCase(this.name)
				&& ss.getPopulation() == this.population
				&& ss.getGrowthRate() == this.growthRate;
	}
}
