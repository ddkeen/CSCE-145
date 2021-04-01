import java.util.Scanner;
import java.util.Random;

public class RandomGameChooser {
public static final int MAX =5;
	public static void main(String[] args) 
	{
		Random r = new Random();
		
		Scanner key = new Scanner(System.in);
		
		int choice = r.nextInt(MAX);
		//choice 0,1,2,3,4
		
		System.out.println("Which sport would you like to play? Let the computer decide!");
		String sport = "no sport selected";
		
		 //switch statement
		switch(choice)
		{
		
		case 0:
			sport = "Soccer";
			break;
		case 1:
			sport = "Lacrosse";
			break;
		case 2:
			sport = "Dota";
			break;
		case 3:
		 	sport = "Football";
		 	break;
		case 4:
			sport = "Basketball";
			break;
		default:
			sport = "Baseball";
		}
		System.out.println("You should play " + sport + "!!!");

	}

}
