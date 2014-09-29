package liam;
import java.util.Scanner;
public class FeetToMM {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double feet;

        System.out.println("Enter the feet: ");
        feet = sc.nextDouble();

        double convert = feet * 25.4;

        System.out.println("Feet = " + feet + " Millimeters = " + convert);


    }

}
