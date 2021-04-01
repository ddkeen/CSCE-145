import java.util.Scanner;

/*
 * David Keen
 * 11/19/19
 * CSCE 145
 * Homework 7
 */
public class AnimalFrontEnd {
	static Scanner key;
	public static void main(String[] args) {
		key = new Scanner(System.in);//Construct the key
		
		System.out.println("Welcome to the Cat and Dog Shelter!");
		AnimalCollection animals = new AnimalCollection();//Creates a new instance of the AnimalCollection to be used
		
		boolean quit = false;
		while(!quit)//Runs until the user quits
		{
			System.out.println("Enter 1: to add a Cat or Dog\nEnter 2: to remove a Cat or Dog\nEnter 3 to quit");
			int pick = key.nextInt();
			key.nextLine();
			System.out.println();
			switch(pick)
			{
			case 1: //Add a Cat or Dog by calling on the static method makeAnAnimalDialog
				animals.addAnimal(makeAnAnimalDialog());
				break;
			case 2: //Remove a Cat or Dog
				System.out.println("What is the name of the animal you'd like to remove?");
				String name = key.nextLine();
				animals.removeAnimal(name);
				break;
			case 3:
				quit = true;
				break;
			default:
				System.out.println("Invalid input");
			}
			System.out.println();
			System.out.println("The Shelter currently");
			animals.printAnimals();
			System.out.println();
		}
		System.out.println("Goodbye!");
	}
	
	//Returns an instance of an Animal based on user input
	public static Animal makeAnAnimalDialog()
	{
		Animal woof;
		int pick = 0;
		System.out.println("Enter 1: if it is a House Cat\nEnter 2: if it is a Leopard\nEnter 3: if it is a Domestic Dog\nEnter 4: if it is a Wolf");
		pick = key.nextInt();
		key.nextLine();
		System.out.println();
		while(pick != 1 && pick != 2 && pick != 3 && pick!=4)
		{
			System.out.println("Invalid choice pick again");
			pick = key.nextInt();
			key.nextLine();
		}
		System.out.println("Enter the Animal's name");
		String xName = key.nextLine();
		System.out.println("Enter its weight");
		double xWeight = key.nextDouble();
		key.nextLine();
		
		switch(pick)
		{
		case 1://Constructing a House Cat
			System.out.println("Enter the Cat's Mood");
			String xMood = key.next();
			key.nextLine();
			System.out.println("Enter the Cat's Type");
			String xType = key.nextLine();
			woof = new HouseCat(xName, xWeight, xMood, xType);
			break;
		case 2://Constructing a Leopard
			System.out.println("Enter the Leopard's Mood");
			String xLMood = key.next();
			key.nextLine();
			System.out.println("Enter the Leopard's number of Spots");
			int xNumSpots = key.nextInt();
			key.nextLine();
			woof = new Leopard(xName, xWeight, xLMood,xNumSpots);
			break;
		case 3://Constructing a Domestic Dog
			System.out.println("Enter the Dog's Energy Level");
			int xEnergy = key.nextInt();
			key.nextLine();
			System.out.println("Enter the Dog's Type");
			String xDType = key.nextLine();
			woof = new DomesticDog(xName, xWeight, xEnergy, xDType);
			break;
		case 4://Constructing a Wolf
			System.out.println("Enter the Wolf's Energy Level");
			int xWEnergy = key.nextInt();
			key.nextLine();
			System.out.println("Enter the Wolf's Pack Leader Name");
			String xPackLeader = key.nextLine();
			woof = new Wolf(xName, xWeight, xWEnergy, xPackLeader);
			break;
			
		default:
			woof = new Animal(xName,xWeight);
		}
		
		return woof;
	}
	
	
	}


