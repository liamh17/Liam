package Random;

import java.util.Scanner;

public class OnePlusTwo {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        double one;
        double two;
                
        System.out.println("Enter a number:");
        one = sc.nextDouble();
        
        System.out.println("Enter another number:");
        two = sc.nextDouble();
        
        System.out.println("The answer is: " + (one - two));
        
        
        
    }    
}
