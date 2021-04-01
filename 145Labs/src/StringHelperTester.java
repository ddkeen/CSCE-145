/*
 * David Keen
 * 11/11/19
 * CSCE 145
 * Lab 19
 */
import java.util.Scanner;
public class StringHelperTester {
	public static void main(String[] args) {
		
		//test the meshStrings(a,b) method
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a word to be meshed with another");
		String a = key.next();
		System.out.println("Enter aother word to be meshed with the first");
		String b = key.next();
		System.out.println("Here is your meshed String comprised of the two words");
		System.out.println(StringHelper.meshStrings(a, b));
		System.out.println();
		//test the replaceVowelWithOodle(s) method
		System.out.println("Enter a word to be made very funny");
		String c = key.next();
		System.out.println("Here is your word with every vowel replaced with oodle");
		System.out.println(StringHelper.replaceVowelsWithOodle(c));
		System.out.println();
		//test the weight(s) method
		System.out.println("Enter a word to determine its weight");
		String d = key.next();
		System.out.println("Here is the weight of your word");
		System.out.println(StringHelper.weight(d) + " kg");
		
	}

}
