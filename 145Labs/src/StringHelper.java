/*
 * David Keen
 * 11/11/19
 * CSCE 145
 * Lab 19
 */
public class StringHelper 
{
	/**
	 * Precondition: String a and String b are both one word Strings
	 * Postcondition: Returns a String made up of both a and b, starting with the first letter in a followed by the first letter in b followed by the second letter in a and so on. If one String runs out of letters while the other still has some, the remaining letters will be appended to the end of the String
	 * @param a
	 * @param b
	 * @return String
	 */
	public static String meshStrings(String a, String b)
	{
		//string to be returned
		String woof = "";
		//len determines where to end the loop to stop an out of bounds exception
		int len = a.length();
		//rest is the letters that will be appended to the end
		String rest = "";
		//determine which String is shorter and set len accordingly
		if(b.length()<len)
		{
			len = b.length();
			rest = a.substring(len);
		}
		else
		{
			rest = b.substring(len);
		}
		//loop to add letters to woof to make a meshed string
		for(int i=0; i<len; i++)
		{
			woof = woof + a.charAt(i);
			woof = woof + b.charAt(i);
		}
		//add the appended letters
		woof = woof + rest;
		return woof;
	}
	/**
	 * Precondition: String s is one word
	 * Postcondition: Returns the same word s, but every vowel is replaced with "oodle"
	 * @param s
	 * @return String
	 */
	public static String replaceVowelsWithOodle(String s)
	{
		//String to be returned
		String yeet = "";
		//loop to go through the String s
		for(int i = 0; i<s.length(); i++)
		{
			//determine if charAt i is a vowel and add oodle or the String to yeet accordingly
			if(s.charAt(i)=='a' ||s.charAt(i)=='A' ||s.charAt(i)=='e' ||s.charAt(i)=='E' ||s.charAt(i)=='i' ||s.charAt(i)=='I' ||s.charAt(i)=='o' || s.charAt(i)=='O' ||s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				yeet = yeet + "oodle";
			}
			else
			{
				yeet = yeet + s.charAt(i);
			}
		}
		return yeet;
	}
	/**
	 * Precondition: String s is a word without any numbers or symbols, just letters
	 * PostCondition: Returns the weight of a String, each vowel weighs 2.5 kg and each consonant weights 3.4 kg
	 * @param s
	 * @return double
	 */
	public static double weight(String s)
	{
		//double to be returned
		double boop = 0;
		//loop to go through String s
		for (int i = 0; i<s.length(); i++)
		{
			//determine if charAt i is a vowel or consonant and add the appropriate weight to boop
			if(s.charAt(i)=='a' ||s.charAt(i)=='A' ||s.charAt(i)=='e' ||s.charAt(i)=='E' ||s.charAt(i)=='i' ||s.charAt(i)=='I' ||s.charAt(i)=='o' || s.charAt(i)=='O' ||s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				boop += 2.5;
			}
			else
			{
				boop += 3.4;
			}
		}
		return boop;
	}
}
