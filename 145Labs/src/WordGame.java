/*
 * David Keen
 * 9/23/19
 * Lab 07
 */
import java.util.Scanner;
public class WordGame {

	public static void main(String[] args) 
	{
		//user input
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your word to see if it is special or not:");
		String word = key.next();
		//create an new String that is the same as the user's input but with the first letter at the end
		String special = word.substring(1) + word.substring(0,1);
		System.out.println("Here is your word with its first letter moved to the end: " +special);
		//declare empty String to put special word in but backwards
		String backward = "";
		//for loop that adds one character at a time to the String starting from the end of the special String
		for (int i = special.length() - 1; i>=0; i--)
		{
			backward += special.charAt(i);
		}
		System.out.println("Here is your word with its first letter moved to the end and spelled backwards: " +backward);
		//tests if new word is the same as the original word
		if (backward.equalsIgnoreCase(word))
		{
			System.out.println("Sucess!!! You entered a special word!");
		}
		else
		{
			System.out.println("Failure! You entered an ordinary word!");
		}
				
	}
}
