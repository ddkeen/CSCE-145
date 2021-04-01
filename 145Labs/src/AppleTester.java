/*
 * David Keen
 * 10/21/19
 * CSCE 145
 */
public class AppleTester {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Apple Tester!");
		System.out.println("Here is a apple 1, the default apple:");
		Apple a1= new Apple();
		a1.writeOutput();
		
		System.out.println();
		
		Apple a2 = new Apple();
		a2.readInput();
		System.out.println("Here is apple 2:");
		a2.writeOutput();
		System.out.println();
		
		Apple a3 = new Apple();
		a3.readInput();
		System.out.println("Here is apple 3:");
		a3.writeOutput();
	}

}
