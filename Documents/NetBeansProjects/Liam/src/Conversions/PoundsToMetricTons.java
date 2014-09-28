package Conversions;
import java.util.Scanner;

public class PoundsToMetricTons {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)  {
		
		double pound;
		
		System.out.println("Enter the pounds: ");
		pound = sc.nextDouble();
		
		double convert = pound * 0.00045359237;
		
		System.out.println("Pounds = " + pound + " Metric Tons = " + convert);
		
		
		
	}

}
