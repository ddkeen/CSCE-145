
public class DimensionConverter {

		public static final int FEET_TO_INCHES = 12;
		
		public static double InchesToFeet(double inches)
		{
			return inches / FEET_TO_INCHES;
		}
		
		public static double FeetToInches(double feet)
		{
			return feet *  FEET_TO_INCHES;
		}
		
		public double value(int num)
		{
			double n = Double.parseDouble(num);
			return n;
		}
		
		
}
