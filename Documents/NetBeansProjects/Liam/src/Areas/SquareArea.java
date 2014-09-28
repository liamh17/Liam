package Areas;
import java.util.Scanner;
public class SquareArea {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        
        double a;
        
        System.out.println("Enter the length of a side: ");
        a = sc.nextDouble();
        
        double Area = a * a;
        
        System.out.println("The area of your square is: " + Area);
        
        
        
    }
    
}
