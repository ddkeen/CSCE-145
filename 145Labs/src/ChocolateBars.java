/*
 * David Keen
 * 9/25/19
 * Lab 08
 */
import java.util.Scanner;
public class ChocolateBars 
{
	//constant for the number of coupons needed for a free chocolate bar
	public static final int MIN_COUPONS = 6; 
	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		int dollars = key.nextInt();
		//start with zero coupons and zero bars
		int coupons = 0;
		int bars = 0;
		//while loop that simply spends all the money the user has on chocolate bars and accumulates a coupon for each bar
		while(dollars > 0)
		{
			bars++;
			coupons++;
			dollars--;
		}
		//while loop that buys an extra choc0late bar if the user has 6 or more coupons. It then takes away 6 coupons but adds another because there is one in the choolate bar that was just bought
		while (coupons >= MIN_COUPONS)
		{
			bars++;
			coupons = coupons - MIN_COUPONS;
			coupons++;
		}
		System.out.println("You can buy " +bars+ " chocolate bars and will have " +coupons+ " coupons left!" );
	}

}
