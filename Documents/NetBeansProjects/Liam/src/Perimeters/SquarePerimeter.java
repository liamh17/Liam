package Perimeters;
import java.util.Scanner; 
public class SquarePerimeter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        double a;
        
        System.out.println("Enter the length or width: ");
        a = sc.nextDouble();
        
        double perm = a * 4;
        System.out.println("The perimeter of your square is: " + perm);
        
    }
    
}
