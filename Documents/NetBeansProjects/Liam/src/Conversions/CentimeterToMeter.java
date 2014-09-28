package Conversions;
import java.util.Scanner;

public class CentimeterToMeter {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args)  {
	
	double centimeter;
	
	System.out.println("Enter the # of centimeters: ");
	centimeter = sc.nextDouble();
	
	double convert = centimeter * 0.01;
	
	System.out.println("Centimeters = " + centimeter + " Meters  = " + convert);
	
	
}

}
