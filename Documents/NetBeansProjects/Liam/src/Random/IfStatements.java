package Random;
import java.util.Scanner;

public class IfStatements {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int number;
        
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        
        if (number < 2)
        System.out.println("This number is smaller then 2");
        
        else if (number == 2)
            System.out.println("This number is equal to 2");
        
        else if (number > 2)
            System.out.println("This number is greater then 2");
    
        }
}