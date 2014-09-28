package Conversions;
import java.util.Scanner;

public class OuncesToPounds {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double ounce;
		
		System.out.println("Enter the # of ounces: ");
		ounce = sc.nextDouble();
		
		double convert = ounce * 0.0625;
		
		System.out.println("Ounces = " + ounce + " Pounds " + convert);
		
		
		
	}

}
