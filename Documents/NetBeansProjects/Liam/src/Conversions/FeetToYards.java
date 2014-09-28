package Conversions;
import java.util.Scanner;

public class FeetToYards {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double feet;
		
		System.out.println("Enter the yards: ");
		feet = sc.nextDouble();
		
		double convert = feet / 3;
		
		System.out.println("Feet = " + feet + " Yards = " + convert);
		
		
		
	}

}
