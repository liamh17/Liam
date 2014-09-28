package Areas;
import java.util.Scanner;
public class ParallelogramArea {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double base;
        double height;
        
        System.out.println("Enter the base: ");
        base = sc.nextDouble();
        
        System.out.println("Enter the height ");
        height = sc.nextDouble();
        
        double Area = base * height;
        System.out.println("The area is " + Area);
        
        
    }
    
}
