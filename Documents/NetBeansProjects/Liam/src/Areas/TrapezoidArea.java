package Areas;
import java.util.Scanner;
public class TrapezoidArea {
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    
    double basea;
    double baseb;
    double height;
    
    System.out.println("Enter the 1st base: ");
    basea = sc.nextDouble();
    
    System.out.println("Enter the 2nd base: ");
    baseb = sc.nextDouble();
    
    System.out.println("Enter the height: ");
    height = sc.nextDouble();
    
    double preArea = basea + baseb;
    double preArea2 = preArea / 2;
    double Area = preArea2 * height;
    
    System.out.println("The area of your trapezoid is : " + Area);
    
    
    
    
}
    
}
