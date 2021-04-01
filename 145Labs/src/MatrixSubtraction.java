/*
 * David Keen
 * 10/16/119
 * CSCE 145
 * Lab 12B
 */
import java.util.Scanner;
public class MatrixSubtraction 
{
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("Welcome to the matrix subtracting program!");
		
		//user input for number of rows and columns for each array
		System.out.println("Enter the number of rows of matrix 1:");
		int mat1_rows = key.nextInt();
		 
		System.out.println("Enter the number of columns of matrix 1:");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the number of rows of matrix 2:");
		int mat2_rows = key.nextInt();
		
		System.out.println("Enter the number of columns of matrix 2:");
		int mat2_cols = key.nextInt();
		
		//input validation, if the size of each matrix doesn't match, program terminates
		if (mat1_cols!=mat2_cols || mat1_rows != mat2_cols)
		{
			System.out.println("Cannot subtract the two matrices. Dimension Mismatch!");
			System.exit(0);
		}		
		//create matrix 1
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		//nested for loop to allow user to enter values for matrix 1
		for(int i = 0; i<mat1_rows; i++)
		{
			for(int j =0; j<mat1_cols; j++)
			{
				System.out.println("Enter the matrix 1 value at index ("+i+", "+j+"):");
				matrix1[i][j] = key.nextInt();
				
			}
		}
		//create matrix 2
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		//nested for loop to allow user to enter values for matrix 2
		for(int i = 0; i<mat2_rows; i++)
		{
			for(int j =0; j<mat2_cols; j++)
			{
				System.out.println("Enter the matrix 2 value at index ("+i+", "+j+"):");
				matrix2[i][j] = key.nextInt();
				
			}
		}
		//print matrix 1
		for(int i =0; i<mat1_rows; i++)
		{
			for (int j =0; j<mat1_cols; j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		//print minus sign
		System.out.println("-");
		//print matrix 2
		for(int i =0; i<mat2_rows; i++)
		{
			for (int j =0; j<mat2_cols; j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		//print equals sign
		System.out.println("=");
		//print resultant array with a for loop that subtracts each corresponding values in matrix 1 and matrix 2
		for(int i =0; i<mat2_rows; i++)
		{
			for (int j =0; j<mat2_cols; j++)
			{
				System.out.print((matrix1[i][j] - matrix2[i][j])+" ");
			}
			System.out.println();
		}
	}
}
