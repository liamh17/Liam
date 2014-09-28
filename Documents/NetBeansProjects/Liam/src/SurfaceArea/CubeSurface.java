package SurfaceArea;
import java.util.Scanner;
public class CubeSurface {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double a;
        double six = 6;
        
        System.out.println("Enter the length of the side: ");
        a = sc.nextDouble();
        
        double surAreaA = a * a;
        double surArea = surAreaA * six;
        
        System.out.println("The surface area of your cube is: " + surArea);
        
        
        
    }
    
}
