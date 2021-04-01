import java.util.Scanner;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("How many numbers would you like to sort?");
		int size = key.nextInt();
		int [] myArray = new int [size];
		for(int i = 0; i<myArray.length; i++)
		{
			System.out.println("Enter the array value at index " + i+ ":");
			myArray[i]=key.nextInt();
		}
		
		//selection sort
		for(int k=0; k< myArray.length; k++)
		{
			int smallest = myArray[k];
			int minIndex = k;
			for(int i = k+1; i<myArray.length; i++)
			{
				if(myArray[i]<smallest)
				{
					smallest = myArray[i];
					minIndex=i;
				}
			}
			
			if(smallest < myArray[k])
			{
				int temp = myArray[k];
				myArray[k] = myArray[minIndex];
				myArray[minIndex] = temp;
			}
			
			//print the array
			for(int j = 0; j<myArray.length; j++)
			{
				System.out.print(myArray[j]+" ");				
			}
			System.out.println();
			
		}

	}

}

