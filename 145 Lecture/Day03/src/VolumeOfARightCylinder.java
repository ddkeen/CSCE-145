import java.util.Scanner;
public class VolumeOfARightCylinder {

public static final double PI = 3.14;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//pi*r^2*h
		
		System.out.println("Enter the radius (in inches) of the right cylinder");
		
		double radius = key.nextDouble();
		
		System.out.println("Enter the height (in inches)of the right cylinder");
		
		double height = key.nextDouble();
		
		double volume = height*radius*radius*PI;
		
		System.out.println("The volume of the right cylinder with radius " +radius+ " inches and height " +height+ " inches is: " + volume+ " cubic inches!");
		
		//Math.pow(a, b)
		//Math.pow(x,3)
		
	}
		

}
