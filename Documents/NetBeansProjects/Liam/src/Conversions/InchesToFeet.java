package Conversions;
import java.util.Scanner;


public class InchesToFeet {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)  {
		
		double inches;
		
		System.out.println("Enter the inches: ");
		inches = input.nextDouble();
		
		double feet = inches/12;
		
		System.out.println("Inches = " + inches + " Feet = " + feet);
		
	
		
		
		
		
	}
	

}
