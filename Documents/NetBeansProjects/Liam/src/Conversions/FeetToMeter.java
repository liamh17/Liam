package Conversions;
import java.util.Scanner;
public class FeetToMeter {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		double feet;
		double meter = 0.3048;
		
		System.out.println("Enter the feet: ");
		feet = input.nextDouble();
		
		double convert = feet * meter;
		
		System.out.println("Feet = " + feet + " Meters = " + convert);
		
		
		
	}

}
