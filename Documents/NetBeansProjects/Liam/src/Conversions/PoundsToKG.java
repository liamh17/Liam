package Conversions;
import java.util.Scanner;

public class PoundsToKG {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double pound;
		
		System.out.println("Enter the amount of pounds: ");
		pound = sc.nextDouble();
		
		double convert = pound * 0.453592;
		
		System.out.println("Pounds = " + pound + " KG = " + convert);		
		
	}

}
