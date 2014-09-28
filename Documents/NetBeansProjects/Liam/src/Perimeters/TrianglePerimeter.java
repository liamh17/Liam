package Perimeters;
import java.util.Scanner;
public class TrianglePerimeter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        
        double perim = a + b + c;
        System.out.println("The perimeter of your triangle is: " + perim);
        
        
    }
    
}
