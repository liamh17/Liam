package Conversions;
import java.util.Scanner;


public class PoundsToTons {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)  {
		
		double pound;
		
		System.out.println("Enter the # of pounds: ");
		pound = sc.nextDouble();
		
		double convert = pound * 2000;
		System.out.println("Pounds = " + pound + " Tons = " + convert);
		
		
		
		
	}

}
