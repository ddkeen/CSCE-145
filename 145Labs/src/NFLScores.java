/*
 * David Keen
 * 10/14/19
 * CSCE 145
 * Lab 12A
 */

import java.util.Scanner;
public class NFLScores 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the NFL Score Keeper!");
		System.out.println("How many game scores do you want to enter?");
		//user input to determine how long to make the array
		int numGames = key.nextInt();
		//create array
		int [] winningScores = new int[numGames];
		//for loop to put user input inside the array
		for (int i=0; i<numGames; i++)
		{
			System.out.println("Please enter the winning score of game " + (i+1) + ":");
			winningScores[i] = key.nextInt();
		}
		//create variable for lowest and highest value of the array, starting with the first value at index 0
		int highestScore = winningScores[0];
		int lowestScore = winningScores[0];
		//loop through the array to test if any values are higher or lower than the initial value. If yes, change the variable values respectively
		for (int j=0; j<winningScores.length; j++)
		{
			if (winningScores[j]>highestScore)
			{
				highestScore = winningScores[j];
			}
			if (winningScores[j]<lowestScore)
			{
				lowestScore = winningScores[j];
			}
		}
		//print highest and lowest game scores
		System.out.println("Highest Game Score: " + highestScore);
		System.out.println("Lowest Game Score: " + lowestScore);
		
	}

}
