/*
 * David Keen
 * 9/30/19
 * Lab 09
 */
import java.util.Scanner;
public class Traingle 
{
	public static void main(String[] args)
	{
		Scanner key = new Scanner(System.in);
		//user input
		System.out.println("I can make you a triangle? What would you like the height to be? Please enter an integer:");
		int height = key.nextInt();
		//input validation
		if(height<=0)
		{
			System.out.println("The height can't be less than 1! Invalid Input!");
			System.exit(0);
		}
		//create variable that starts as 1* and increases by 1 for each line of the triangle until it gets to its height value, then goes back down
		int start = 1;
		//boolean that tests weather the triangle should be increasing its height by 1 or decreasing its height by 1
		boolean hasReachedMidpoint = false;
		//loop will stop after the variable stop has reached the last line and prints 1 final *
		while(start>0)
		{
			//prints as many stars as needed for each line
			for(int i=0; i<start; i++)
			{
				System.out.print("*");
			}
			//move to the next line
			System.out.println();
			//tests if we have reached the midpoint of the triangle, if true, we change our boolean variable to true
			if(start == height)
			{
				hasReachedMidpoint = true;
			}
			//tests if we are before or after our midpoint, if before, we increment start by 1 to add a *, if after, we decrement start by 1 to take away a star
			if(!hasReachedMidpoint)
			{
				start++;
			}
			else
			{
				start--;
			}
		}
	
}
}
