package JavaGames;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    
        //Random r = new Random();
        int numberToGuess = 14;
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        
        while(win == false) {
        
        System.out.println("Guess a # between 0 and 20: ");
        guess = input.nextInt();
        numberOfTries++;
    
    if (guess == numberToGuess) {
        win = true;
    }
       
    else if (guess < numberToGuess) {
        System.out.println("Your guess is too low");
    }
    else if (guess > numberToGuess) {
        System.out.println("Your guess is too high");
    }
}
        
        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries to get it right!");
}
}
