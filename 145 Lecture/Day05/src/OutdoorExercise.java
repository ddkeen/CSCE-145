import java.util.Scanner;
public class OutdoorExercise {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Is it rainning outside? Enter true of false:");
		
		boolean rain = key.nextBoolean();
		
		if(rain)
		{
			System.out.println("Weather is not suitable for outdoor exercise!");
		}
		
		else
		{
			System.out.println("Enter today's temperature(\u00B0F):");
		}
			int temperature = key.nextInt();
			
			//40 - 90
			//Coldest = -144
			//Hottest = +134
			if(temperature < -144 || temperature > 134)
			{
				System.out.println("Invalid temperature for planet Earth!");
				System.exit(0);
			}
			else if(temperature >= -144 && temperature < 40)
			{
				System.out.println("It's too cold outside!");
			}
			
			else if(temperature<=134 && temperature >90)
			{
				System.out.println("It's too hot outside!");
			}
			else
			{
				System.out.println("This is ideal weather for outdoor exercise!");
			}
			
	}

}
