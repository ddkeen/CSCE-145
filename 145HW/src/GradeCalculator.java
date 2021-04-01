/*
 * David Keen
 * 12/2/19
 * CSCE 145
 * Homework 8
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Would you like to create a new file for student grades? Enter yes if you do");
		if(key.nextLine().equalsIgnoreCase("yes"))
		{
			try 
			{
				System.out.println("Please enter the new file name that you will create ");
				String fileName = key.nextLine();
				
				PrintWriter output = new PrintWriter(new FileOutputStream(fileName , false));
				
				System.out.println("How many lines will be in this file?");
				
				int lines = key.nextInt();
				key.nextLine();
				int i=0;
				
				while(i<lines)
				{
					System.out.println("Please enter: LABS, LAB REPORTS, HOMEWORK, EXAM-1, EXAM-2, FINAL EXAM or any numerical grades you would like to enter underneath each category.");
					output.println(key.nextLine());
					i++;
				}
				output.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	
			
		
		System.out.println("Please enter the file name containing student grades that you would like to analyze: ");
		
		String fileName2 = key.nextLine();
		
		MyGrade yeet = new MyGrade();
		
		yeet.readGradesFile(fileName2);
		
		yeet.writeOutput();
		
		
		
		
	}

}
