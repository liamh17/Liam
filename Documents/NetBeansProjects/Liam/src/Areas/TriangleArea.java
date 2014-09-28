package Areas;
import java.util.Scanner;

public class TriangleArea {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        double base;
        double height;
        // Variables are created
        
        System.out.print("Enter the triangle's base:");
        base = sc.nextDouble();
        // Entering the base
        
        System.out.println("Enter the triangle's height: ");
        height = sc.nextDouble();
        // Entering the height
        
        double preArea = base * height;
        // Multiplying the base times height
        
        double Area = preArea / 2;
        System.out.println("The area of your triangle is " + Area);
        // Divide by 2
        
        
    
}
    
}
