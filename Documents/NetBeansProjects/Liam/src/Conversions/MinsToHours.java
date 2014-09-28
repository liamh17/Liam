package Conversions;
import java.util.Scanner;
public class HoursToMins {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double min;
        
        System.out.println("Number of mins: ");
        min = sc.nextDouble();
        
        double convert = min / 60;
        
        System.out.println("Minutes: " + min + " Hours = " + convert );
        
        
    }
    
}
