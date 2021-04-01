import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of rows of matrix 1:");
		int mat1_rows = key.nextInt();
		 
		System.out.println("Enter the number of columns of matrix 1:");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the number of rows of matrix 2:");
		int mat2_rows = key.nextInt();
		 
		if (mat1_cols!=mat2_rows)
		{
			System.out.println("Cannot multiply the two matrices. Dimension Mismatch!");
			System.exit(0);
		}
		
		System.out.println("Enter the number of columns of matrix 2:");
		int mat2_cols = key.nextInt();
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		
		for(int i = 0; i<mat1_rows; i++)
		{
			for(int j =0; j<mat1_cols; j++)
			{
				System.out.println("Enter the matrix value at index ("+i+", "+j+"):");
				matrix1[i][j] = key.nextInt();
				
			}
		}
		
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		for(int i = 0; i<mat2_rows; i++)
		{
			for(int j =0; j<mat2_cols; j++)
			{
				System.out.println("Enter the matrix value at index ("+i+", "+j+"):");
				matrix2[i][j] = key.nextInt();
				
			}
		}
		
		int [][] productMatrix = new int [mat1_rows][mat2_cols];
		
		int sum = 0;
		
		for (int i =0; i<mat1_rows; i++)
		{
			for (int j=0; j<mat2_cols; j++)
			{
				for (int k = 0; k<mat1_cols; k++)
				{
					sum+= matrix1[i][k] * matrix2[k][j];
				}
				
				productMatrix[i][j] = sum;
				sum = 0;
			}
		}
		
		//print the product matrix
		for(int i =0; i<mat1_rows; i++)
		{
			for (int j =0; j<mat2_cols; j++)
			{
				System.out.println(productMatrix[i][j]+" ");
			}
			System.out.println();
		}
				
	}

}
