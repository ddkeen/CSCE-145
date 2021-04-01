/*
 * David Keen
 * 9/24/19
 * CSCE 145
 * Homework 03
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors 
{
	public static final int ROCK = 0;
	public static final int PAPER = 1;
	public static final int SCISSORS = 2;
	//MAX is both the number of games and the number of choices in rock, paper, scissors.
	public static final int MAX = 3;
	public static void main(String[] args) 
	{
		//need a Scanner for user input and Random for cpu input
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		String play = "";
		//do loop to play the game while the user enters yes to playing again
	do
	{
		System.out.println("Let's play Rock, Paper, Scissors! We will play best of 3.");
		System.out.println();
		//reset scores to 0
		int playerScore = 0;
		int cpuScore = 0;
		//for loop to play 1 round
		for (int i =0; i<MAX; i++)
		{
			System.out.println("Please enter rock, paper, or scissors.");
			String playerChoice = key.next();
			String cpuChoice = "";
			//randomly generates 0,1,or 2
			int cpuRandom = r.nextInt(MAX);
			//if random value is 0, throw rock
			if(cpuRandom == ROCK)
			{
				cpuChoice = "Rock";
			}
			//if random value is 1, throw paper
			else if (cpuRandom == PAPER)
			{
				cpuChoice = "Paper";
			}
			//if random value is 2, throw scissors
			else if (cpuRandom == SCISSORS)
			{
			    cpuChoice = "Scissors";
			}
			//both throw same value
			if (cpuChoice.equalsIgnoreCase(playerChoice))
			{
				System.out.println("You and the CPU both threw the same thing! This round is a tie.");
			}
			else if (cpuChoice.equalsIgnoreCase("rock") && playerChoice.equalsIgnoreCase("paper"))
			{
				System.out.println("Paper covers Rock! Player 1 scores a point!");
				playerScore++;
			}
			else if (cpuChoice.equalsIgnoreCase("rock") && playerChoice.equalsIgnoreCase("scissors"))
			{
				System.out.println("Rock crushes Scissors! CPU scores a point!");
				cpuScore++;
			}
			else if (cpuChoice.equalsIgnoreCase("paper") && playerChoice.equalsIgnoreCase("rock"))
			{
				System.out.println("Paper covers Rock! CPU scores a point!");
				cpuScore++;
			}
			else if (cpuChoice.equalsIgnoreCase("paper") && playerChoice.equalsIgnoreCase("scissors"))
			{
				System.out.println("Scissors cuts Paper! Player 1 scores a point!");
				playerScore++;
			}
			else if (cpuChoice.equalsIgnoreCase("scissors") && playerChoice.equalsIgnoreCase("rock"))
			{
				System.out.println("Rock crushes Scissors! Player 1 scores a point!");
				playerScore++;
			}
			else if (cpuChoice.equalsIgnoreCase("scissors") && playerChoice.equalsIgnoreCase("paper"))
			{
				System.out.println("Scissors cuts Paper! CPU scores a point!");
				cpuScore++;
			}
			//user enters invalid input
			else
			{
				System.out.println("You entered neither rock, paper, nor scissors! CPU scores a point!");
				cpuScore++;
			}
		}
		//calculate final score
		System.out.println("Here is the final score after three rounds: You: " + playerScore + " points. CPU: " + cpuScore + " points." );
		if(cpuScore>playerScore)
		{
			System.out.println("CPU Wins!!!");
		}
		else if(cpuScore<playerScore)
		{
			System.out.println("You Win!!!");
		}
		else
		{
			System.out.println("This game ends in a tie :(");
		}
		//prompt user to play again
		System.out.println("Would you like to play again? Enter yes if you do.");
		play = key.next();
	}
	//loop repeats as long as player responds "yes"
	while(play.equalsIgnoreCase("yes"));
	//end of program
	System.out.println("Thanks for playing! Goodbye!");
	}

}
