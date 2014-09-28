package Perimeters; 
import java.util.Scanner;
public class RectanglePerimeter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double a;
        double b;
        
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        
        double perimA = 2 * a;
        double perimB = 2 * b;
        double perim = perimA + perimB;
        
        System.out.println("The perimeter of your rectangle is: " + perim);
        
        
    }
    
}
