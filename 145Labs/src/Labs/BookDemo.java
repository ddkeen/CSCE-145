/*
 * David Keen
 * 10/23/19
 * CSCE 145
 * Lab 14
 */
public class BookDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Creating the first book object of default values:");
		Book catInHat = new Book();
		System.out.println("Printing the values of the first book object:");
		System.out.println(catInHat.toString());
		
		System.out.println("Please create a book.");
		Book mine = new Book();
		mine.readInput();
		System.out.println("The values of your first book are:");
		System.out.println(mine.toString());
		
		System.out.println("Please create another book.");
		Book yours = new Book();
		yours.readInput();
		System.out.println("The values of your second book are:");
		System.out.println(yours.toString());
		
		if(mine.equals(yours))
		{
			System.out.println("The two books you entered are the same!");
		}
		else
		{
			System.out.println("The two books you entered are different!");
		}
		
		
		
	}

}
