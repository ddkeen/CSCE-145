import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner key =  new Scanner (System.in);
				
				double sum = 0, avg = 0;
				int gradeCounter = 0;
				
				String input;
				
				do 
				{
					System.out.println("Enter the grades whose average you want to calculate and enter a negative value once done:");
					
					double grade = key.nextInt();
					
					
					while(grade>0 && grade<=100)
					{
						sum += grade;
						gradeCounter++;
						
						grade = key.nextDouble();
					}
					
					if(gradeCounter >0)
					{
						avg = sum/gradeCounter;
					}
					
					System.out.println("Average = " + avg);
					
					System.out.println("Do you want to calculate another average? Enter yes or no:");
					input = key.next();
					
				}while(input.equalsIgnoreCase("yes"));
				
				System.out.println("Goodbye!");
				}
				
				
	}

