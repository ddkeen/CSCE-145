/*
 * David Keen
 * 12/2/19
 * CSCE 145
 * Homework 8
 */
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class MyGrade {
	
	private double homeworkSum;
	private int homeworkCount;
	private double labSum;
	private int labCount;
	private double labReportSum;
	private int labReportCount;
	private double exam1;
	private double exam2;
	private double finalExam;
	
	public MyGrade()
	{
		this.homeworkSum = 0;
		this.homeworkCount = 0;
		this.labSum = 0;
		this.labCount = 0;
		this.labReportSum =0;
		this.labReportCount = 0;
		this.exam1 = 0;
		this.exam2 =0;
		this.finalExam =0;
	}
	
	public double getHomeworkAverage()
	{
		return this.homeworkSum/this.homeworkCount;
	}
	
	public double getLabAverage()
	{
		return this.labSum/this.labCount;
	}
	
	public double getLabReportAverage()
	{
		return this.labReportSum/this.labReportCount;
	}
	
	public double getExam1()
	{
		return this.exam1;
	}
	
	public double getExam2()
	{
		return this.exam2;
	}
	
	public double getFinalExam()
	{
		return this.finalExam;
	}
	
	public void addGrade(String category, double grade) 
	{
		if(category.equalsIgnoreCase("Labs"))
		{
			this.labCount++;
			this.labSum+=grade;
		}
		
		else if(category.equalsIgnoreCase("Lab Reports"))
		{
			this.labReportCount++;
			this.labReportSum+=grade;
		}
		
		else if(category.equalsIgnoreCase("Homework"))
		{
			this.homeworkCount++;
			this.homeworkSum+=grade;
		}
		
		else if(category.equalsIgnoreCase("Exam-1"))
		{
			this.exam1+=grade;
		}
		
		else if(category.equalsIgnoreCase("Exam-2"))
		{
			this.exam2+=grade;
		}
		
		else if(category.equalsIgnoreCase("Final Exam"))
		{
			this.finalExam+=grade;
		}
		else
		{
			System.out.println("Invalid Category in the File!");
		}
		
	}
	
	public double getFinalNumberGrade()
	{
		double finalgrade = 0;
		finalgrade += getHomeworkAverage()*.2;
		finalgrade+= getLabAverage()*.1;
		finalgrade+= getLabReportAverage()*.1;
		if(getExam1()>=getExam2() || getExam1()>=getFinalExam())
		{
			finalgrade+= getExam1()*.3;
			if(getExam2()>=getFinalExam())
			{
				finalgrade+= getExam2()*.3;
			}
			else
			{
				finalgrade+= getFinalExam()*.3;
			}
		}
		else
		{
			finalgrade+=getExam2()*.3;
			finalgrade+=getFinalExam()*.3;
		}
		return Math.ceil(finalgrade);
		
	}
	
	public String getCourseLetterGrade(double numgrade)
	{
		 String grade = "";
		 if(numgrade>=90)
		 {
			 grade+= "A";
		 }
		 else if(numgrade>=86)
		 {
			 grade+= "B+";
		 }
		 else if(numgrade>=80)
		 {
			 grade+= "B";
		 }
		 else if(numgrade>=76)
		 {
			 grade+= "C+";
		 }
		 else if(numgrade>=70)
		 {
			 grade+= "C";
		 }
		 else if(numgrade>=66)
		 {
			 grade+= "D+";
		 }
		 else if(numgrade>=66)
		 {
			 grade+= "D";
		 }
		 else
		 {
			 grade+= "F";
		 }
		 return grade;
	}
	
	public void readGradesFile(String fileName)
	{
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			String category = "";
			double grade = 0;
			while(fileScanner.hasNextLine())
			{
				if(fileScanner.nextLine().equalsIgnoreCase("Labs") || fileScanner.nextLine().equalsIgnoreCase("Lab Reports") || fileScanner.nextLine().equalsIgnoreCase("Homework") || fileScanner.nextLine().equalsIgnoreCase("Exam-1") || fileScanner.nextLine().equalsIgnoreCase("Exam-2") || fileScanner.nextLine().equalsIgnoreCase("Final Exam"))
				{
					category = fileScanner.nextLine();
				}
				else
				{
					grade = Double.parseDouble(fileScanner.nextLine());
					addGrade(category,grade);
				}
			}
			
			fileScanner.close();
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void writeOutput()
	{
		System.out.println("Lab Average: " + getLabAverage());
		System.out.println("Lab Report Average: " + getLabReportAverage());
		System.out.println("Homework Average: " + getHomeworkAverage());
		System.out.println("Exam 1: " + getExam1());
		System.out.println("Exam 2: " + getExam2());
		System.out.println("Final Exam: " + getFinalExam());
		System.out.println();
		System.out.println("Final Number Grade: " + getFinalNumberGrade());
		System.out.println("Course Letter Grade: " + getCourseLetterGrade(getFinalNumberGrade()));
	}
	

}
