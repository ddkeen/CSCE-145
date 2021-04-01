 import java.util.*;
import java.io.*;
public class BasicIO {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter 3 lines of text:");
		
		try 
		{
			PrintWriter output = new PrintWriter(new FileOutputStream("input.txt" , true));
			
			for(int i = 0; i<3; i++)
			{
				output.println(key.nextLine());
			}
			
			output.close();
			key.close();
			
			//read from the file
			Scanner fileScanner = new Scanner(new File("input.txt"));
			
			while(fileScanner.hasNextLine())
			{
				System.out.println(fileScanner.nextLine());
			}
			
			fileScanner.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
		

		
	}

}
