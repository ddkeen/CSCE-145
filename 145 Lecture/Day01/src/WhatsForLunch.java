import java.util.Scanner;


public class WhatsForLunch {

	public static void main(String[] args) {
		// entry point
		// single line comment
		
		/*
		 * Multi-line Comment
		 */
		
		//create an object of the Scanner class
		
		Scanner key = new Scanner(System.in);
		
		//ask the user for lunch options
		
		System.out.println("What would you like to have for lunch");
		System.out.println("Enter entree:");
		
		String entree = key.nextLine();
		
		System.out.println("Enter side:");
		String side = key.nextLine();
		
		System.out.println("Enter drink:");
		String drink = key.nextLine();
		//+concatenation operator
		System.out.println("Entree: " +entree);
		System.out.println("Side:" +side);
		System.out.println("Drink: " +drink);
		
		

	}

}
