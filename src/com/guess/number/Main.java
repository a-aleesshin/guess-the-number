package com.guess.number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain;
        int numberOfTries = 0;

        do {
            int theNumber = (int) (Math.random() * 200 - 100);
            int guess = 0;
            System.out.println(theNumber);

            while (guess != theNumber) {
                System.out.println("Guess a number between -100 and 100!");
                guess = input.nextInt();
                numberOfTries++;

                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is correct. You win!!");
                    System.out.println("It only took " + numberOfTries + " tries! Good work.");
                }
            }

            System.out.println("Would you like to play again (y/n)?");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));
            System.out.println("Thank you for playing! Goodbye.");
            input.close();
    }
}
