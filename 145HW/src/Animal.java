/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class Animal {

		private String name;
		private double weight;
		
		public Animal()
		{
			this.name = "no name yet";
			this.weight = 0;
		}
		
		public Animal(String xName, double xWeight)
		{
			setName(xName);
			setWeight(xWeight);
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public double getWeight()
		{
			return this.weight;
		}
		
		public void setName(String xName)
		{
			this.name = xName;
		}
		
		public void setWeight(double xWeight)
		{
			if(xWeight>0)
			{
				this.weight = xWeight;
			}
			else
			{
				System.out.println("Weight must be greater than zero!");
			}
		}
		
		public  String toString()
		{
			return "Name: " + this.name + "\nWeight: " + this.weight + " lbs.";
		}
		
		public boolean equals(Animal a)
		{
			return (this.name.equals(a.getName()) && this.weight == a.getWeight());
		}
}
