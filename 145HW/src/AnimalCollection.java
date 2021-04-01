/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class AnimalCollection {
	
	private Animal[] animals;
	public static final int MAX_ANIMALS = 100;
	
	public AnimalCollection()
	{
		this.animals = new Animal[MAX_ANIMALS];
	}
	
	public void addAnimal(Animal a)
	{
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i] == null)
			{
				animals[i] = a;
				return;
			}
		}
		//If it reaches here the array is full
		System.out.println("The herd of animals is full!");
	}
	
	public void removeAnimal(String s)
	{
		for(int i=0;i<animals.length;i++)
		{
			if(animals[i] != null && animals[i].getName().equalsIgnoreCase(s))
			{
				animals[i] = null;
				return;
			}
		}
		//If it reaches here then the Animal with that name was not found
		System.out.println("The Animal was not found");
	}
	//prints all the animals
	public void printAnimals()
	{
		for(int i=0; i<animals.length; i++)
		{
			if(animals[i] != null)
			{
				System.out.println(animals[i].toString());
				System.out.println();
			}
		}
	}

}
