
public class Student extends Person{
	
	private int studentID;
	private String major;
	private double gpa;
	
	//default constructor
	public Student()
	{
		super();
		this.studentID = 1;
		this.major = "Undeclared";
		this.gpa =1;
	}
	
	//parameterized constructor
	public Student(String xName, int xAge, int xID, String xMajor, double xGpa)
	{
		super(xName, xAge);
		this.setStudentID(xID);
		this.setGpa(xGpa);
		this.setMajor(xMajor);
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	public String getMajor()
	{
		return this.major;
	}
	public double getGpa()
	{
		return this.gpa;
	}
	public void setStudentID(int xID)
	{
		if(xID>0)
		{
			this.studentID = xID;
		}
		else
		{
			System.out.println("Invalid value for student id!");
		}
	}
	
	public void setMajor(String xMajor)
	{
		if (xMajor.equalsIgnoreCase("Computer Engineering") || xMajor.equalsIgnoreCase("Zoology"))
		{
			this.major =xMajor;
		}
		else
		{
			System.out.println("Invalid major entered!");
		}
	}
	
	public void setGpa(double xGpa)
	{
		if(xGpa>=1 && xGpa<=4)
		{
			this.gpa = xGpa;
		}
		else
		{
			System.out.println("Invalid GPA entered!");
		}
	}
	
	//method Overriding: two methods with the same signature and parameters are defined in inherited classes.
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("\nStudentID: " + this.studentID+ "\nMajor: " + this.major+ "\nGPA: " +this.gpa);
	}
	
	public boolean equals(Student s)
	{
		return super.equals(s)
				&&s.getStudentID() == this.studentID
				&& s.getMajor().equalsIgnoreCase(this.major)
				&& s.getGpa() == this.gpa;
	}

}
