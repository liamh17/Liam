package Areas;
import java.util.Scanner;
public class RectangleArea {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        
        double w;
        double l;
        
        System.out.println("Enter the width: ");
        w = sc.nextDouble();
        
        System.out.println("Enter the height: ");
        l = sc.nextDouble();
        
        double Area = w * l;
        System.out.println("The area of your rectangle is: " + Area);
        
        System.out.println("What is your name?: ");       
        
        System.out.println("Hello " + sc.next());
        
    }
    
}
