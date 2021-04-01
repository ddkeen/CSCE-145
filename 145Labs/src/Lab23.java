/*
 * David Keen
 * 12/2/19
 * CSCE 145
 * Lab 23
 */
import java.util.*;
import java.io.*;
public class Lab23 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		try 
		{
			PrintWriter output = new PrintWriter(new FileOutputStream("input.txt" , false));
			
			System.out.println("How many values would you like to store in the file?");
			int num = key.nextInt();
			int i = 1;
			
			while(i<=num)
			{
				System.out.println("Please enter value " + i +":");
				output.println(key.nextDouble());
				i++;
			}

			output.close();
			key.close();
			
			//read from the file
			Scanner fileScanner = new Scanner(new File("input.txt"));
			
			System.out.println("Reading the values in the file:");
			
			while(fileScanner.hasNextLine())
			{
				System.out.print(fileScanner.nextLine() + " ");
			}
			System.out.println();
			
			fileScanner.close();
			
			//read from file again to find minimum
			Scanner fileScanner2 = new Scanner(new File("input.txt"));
			
			ArrayList<Double> arr = new ArrayList<Double>();
			
			while(fileScanner2.hasNextDouble())
			{
				arr.add(fileScanner2.nextDouble());
			}
			
			double minimum = arr.get(0);
			for(int d = 1; d<arr.size(); d++)
			{
				if (arr.get(d)< minimum)
				{
					minimum = arr.get(d);
				}
			}
			
			System.out.println("Minimum: " + minimum);
			fileScanner2.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
