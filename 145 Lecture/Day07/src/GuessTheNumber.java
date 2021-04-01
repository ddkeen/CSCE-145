import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
public static final int VAL = 49;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		
		int secretNum = r.nextInt(VAL)+1;
		
		//0+1 -- 49+1
		System.out.println("I will pick a number between 1 and 50. Can you guess the number? Enter your guess:");
		
		int guess = key.nextInt();
		boolean correct = false;
		
		while (correct == false)
		{
			if(guess < secretNum)
			{
				System.out.println("Your guess is too low. Pick a larger value: ");
				guess = key.nextInt();
			}
		
			else if (guess > secretNum)
			{
				System.out.println("Your guess is too high. Pick a smaller value: ");
				guess = key.nextInt();
			}
 
			else 
			{
				System.out.println("Your guess is correct!");
				correct = true;
			}
		}

}
}