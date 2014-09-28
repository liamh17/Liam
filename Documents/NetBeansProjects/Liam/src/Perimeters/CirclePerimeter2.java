package Perimeters;
import java.util.Scanner;
public class CirclePerimeter2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double pi = 3.14;
        double r;
        
        System.out.println("Enter the radius: ");
        r = sc.nextDouble();
        
        double perim = 2 * pi * r;
        
        System.out.println("The perimeter of your circle is: " + perim);
        
    }
    
}
