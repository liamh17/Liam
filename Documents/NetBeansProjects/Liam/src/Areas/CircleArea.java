package Areas;
import java.util.Scanner;
public class CircleArea {
    static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    
    double pi = 3.14;
    double radius;
    
    System.out.println("Enter the radius: ");
    radius = sc.nextDouble();
    
    double squared = radius * radius;
    double Area = squared * pi;
    
    System.out.println("The area of your circle is: " + Area);
    
}
    
}
