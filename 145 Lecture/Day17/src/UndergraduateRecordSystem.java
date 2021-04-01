 import java.util.*;
import java.io.*;
public class UndergraduateRecordSystem {
	
	public static final String DELIMITER = "\t";

	public static void main(String[] args) {
		

		System.out.println("Welcome to the Undergraduate record system:");
		
		Scanner key = new Scanner(System.in);
		
		boolean quit = false;
		
		while (quit == false)
		{
			System.out.println("Enter 1 to create a student record\nEnter 2 to read from a file\nEnter 0 to quit:");
			
			int input = key.nextInt();
			
			switch(input)
			{
			case 0://quit
				System.out.println("Exiting the undergraduate record system!");
				quit = true;
				break;
			case 1: // create student records
				System.out.println("Enter file name:");
				String fileName = key.next();
				
				System.out.println("Enter number of undergraduates: ");
				int numUngrads = key.nextInt();
				
				Undergraduate[] ugrads = new Undergraduate[numUngrads];
				
				for(int i = 0; i<numUngrads; i++)
				{
					//reads input according to the Undergrad's variables, I for some reason don't have the undergraduate class.
				}
			}
			
			public static void recordToFile(Undergraduate[] ugrads, String fileName, boolean append)
			
			try
			{
				PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName, append));
				
				fileWriter.println("Number of undergrauates" + DELIMITER+ ungrads.length)
			}
		}
	}

}
