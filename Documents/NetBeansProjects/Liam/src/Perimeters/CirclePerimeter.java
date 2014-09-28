package Perimeters;
import java.util.Scanner;
public class CirclePerimeter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double pi = 3.14;
        double d;
        
        System.out.println("Enter the diameter: ");
        d = sc.nextDouble();
        
        double perim = pi * d;
        System.out.println("The perimeter of your circle is: " + perim);
        
        
        
    }
    
}
