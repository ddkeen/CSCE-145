import java.util.Scanner;

public class readingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a variable
				int firstNum, secondNum;
				//initializing a variable
				firstNum = 0;
				secondNum = 0;
				
				//create an object of the Scanner class
				Scanner key = new Scanner(System.in);
				
				/*compute the product of 2 numbers*/
				
				System.out.println("Enter first number:");
				double first = key.nextDouble();
				
				System.out.println("Enter an integer:");
				int second = key.nextInt();
				
				double product = first * second;
				
				System.out.println("Product = " + product);
				
				System.out.println("Enter a sentence:");
				String firstWord = key.next();
				System.out.println("First word: " + firstWord);
				
				String secondWord = key.next();
				System.out.println("Second Word: " + secondWord);
				
				String remaining = key.nextLine();
				System.out.println("Remaining Words: " + remaining);
				
				System.out.println("Did you have breakfast? Enter true or false:");
				boolean response = key.nextBoolean();
				
				System.out.println(response+ "!");
				
				System.out.println("How many video games would you like to buy?");
				int games = key.nextInt();
				
				System.out.println("You want to buy " +games+ " video games!");
				
				System.out.println("What is your favorite fruit?");
				
				String fruit = key.next();
				
				System.out.println("Fruit:" + fruit);
				
				

	}

}
