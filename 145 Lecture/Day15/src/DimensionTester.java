
public class DimensionTester {

	public static void main(String[] args) {
		Scsnner key = new Scanner(System.in);
		
		System.out.println("Enter a measurement in inches: ");
		
		double inches = key.nextDouble();
		
		System.out.println(inches+" inches = "+DimensionConverter.InchesToFeet(inches)+" feet");
		
		System.out.println("Enter a meaurement in feet: ");
		
		doubkle feet = key.nextDouble();
		
		System.out.println(feet+ " feet = "+ DimensionConverter.FeetToInches(feet)+" inches");
	}

}
