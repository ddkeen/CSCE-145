/*
 * David Keen
 * 11/13/19
 * CSCE 145
 * Lab 20
 */
import java.util.Scanner;
public class BoxSorter {

	public static void main(String[] args) {
		System.out.println("Welcome to the box sorter!");
		Scanner key = new Scanner(System.in);
		System.out.println("How many boxes would you like to sort?");
		int num = key.nextInt();
		key.nextLine();
		//create the empty array
		Box yeet [] = new Box[num];
		
		System.out.println("Enter the information about boxes and I'll sort them by volume!");
		//for loop to get values to mkae the boxes
		for (int i = 0; i<yeet.length; i++)
		{
			System.out.println("Enter the label, length, width, and height (in feet) of box " +(i+1)+ ":");
			String label = key.nextLine();
			double length = key.nextDouble();
			double width = key.nextDouble();
			double height = key.nextDouble();
			key.nextLine();
			Box woof = new Box(label,length,width,height);
			yeet[i] = woof;
			
		}
		//Selection sort using nested for loops to sort based on volume
		for (int i = 0; i<yeet.length; i++)
		{
			double smallest = yeet[i].getBox();
			int minIndex = i;
			for (int j = i+1; j<yeet.length; j++)
			{
				if(yeet[j].getBox()<smallest)
				{
					smallest = yeet[j].getBox();
					minIndex =j;

				}
				if(smallest<yeet[i].getBox())
				{
					Box temp = yeet[i];
					yeet[i] = yeet[minIndex];
					yeet[minIndex] = temp;
				}
			}
		}
		//for loop to print the sorted array of boxes
		System.out.println("Sorted Boxes:");
		for (int k = 0; k<yeet.length; k++)
		{
			System.out.println(yeet[k].toString());
			
		}
	
	}

}
