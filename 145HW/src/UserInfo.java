/*David Keen
 * 8/29/19
 * CSCE 145
 * Homework 1
 */
import java.util.Scanner;
public class UserInfo {

	public static void main(String[] args) {
		//declaring String variables
		String firstName, lastName, major, minor, sport, movie;
		//declaring int variables
		int age, year;
		
		//create an object of the Scanner class so user can enter data
		Scanner key = new Scanner(System.in);
		
		//Prompt to display to the user
		System.out.println("Hey user! Tell me about yourself.");
		
		//Each prompt asks the user to enter info, the Scanner then uses that info as a value to store in a variable
		System.out.println("What's your first name?");
		firstName = key.next();
		
		System.out.println("What's your last name?");
		lastName = key.next();
		
		System.out.println("How old are you?");
		age = key.nextInt();
		
		System.out.println("What's your major? I hope it's CS or CE.");
		key.nextLine();
		major = key.nextLine();
		
		System.out.println("What's your minor? I hope it's a foreign language.");
		minor = key.nextLine();
		
		System.out.println("What's your favorite sport? It better not be lacrosse.");
		sport = key.nextLine();
		
		System.out.println("What year did you enroll at USC? Type 2019 if your a freshman.");
		year = key.nextInt();
		
		System.out.println("Finally, what's your favorite movie? Mine's Django Unchained.");
		key.nextLine();
		movie = key.nextLine();
		
		//reads back all the user input by printing all the variables
		System.out.println("Okay! Here is your bio.");
		System.out.println("Full Name: " + firstName + " " + lastName  );
		System.out.println("Age: " + age + " years old");
		System.out.println("Major: " + major);
		System.out.println("Minor: " + minor);
		System.out.println("Favorite Sport: " + sport);
		System.out.println("Enrollment Year: " + year);
		System.out.println("Favorite Movie: " + movie);
		System.out.println("Thanks bud! Have a good one!");
		
		

	}

}
