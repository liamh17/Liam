package SurfaceArea;
import java.util.Scanner;
public class SphereSurface {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)  {
        
        //4 pi r 2
         
        double pi = 3.14;
        double r;
        double four = 4;
        
        System.out.println("Enter the radius of your circle: ");
        r = sc.nextDouble();
        
        double preSurfA = four * pi;
        double preSurfB = r * r;
        double surfArea = preSurfA * preSurfB;
        
        System.out.println("The surface area of your sphere is: " + surfArea);
        
                
        
        
        
    }
    
}
