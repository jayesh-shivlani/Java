package MyProjects;
/**
 * Number Guessing Game
 * 
 * Description:
 * A simple game where the player tries to guess a random number between 1 and 100.
 * The game provides hints (too high/too low) after each guess.
 * Player can quit anytime by entering a negative number.
 * 
 * Learning Concepts:
 * - Random number generation
 * - Do-while loops
 * - Conditional statements
 * - User input handling
 * - Try-with-resources
 */

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // Try-with-resources: Scanner automatically closes when done
        // This prevents resource leaks (professional practice!)
        try (Scanner sc = new Scanner(System.in)) {

            // Generate random number between 1 and 100 (inclusive)
            // Math.random() gives 0.0 to 0.999...
            // Multiply by 100 gives 0.0 to 99.999...
            // Cast to int gives 0 to 99
            // Add 1 to get 1 to 100
            int random = (int) (Math.random() * 100) + 1;

            // Variable to store user's guess
            int guess;

            // Game loop - continues until user guesses correctly or quits
            do {
                // Prompt user for input
                System.out.println("Guess the number between 1 to 100 (enter negative to quit):");
                guess = sc.nextInt();

                // Check if user guessed correctly
                if (guess == random) {
                    System.out.println("Congratulations! You guessed the correct number!");
                    break; // Exit the loop - game over (win)
                }

                // Check if guess is too high
                else if (guess > random) {
                    System.out.println("Too high! Try a smaller number.");
                }

                // Check if guess is too low (but still positive)
                else if (guess > 0) {
                    System.out.println("Too low! Try a larger number.");
                }

                // User entered negative number - wants to quit
                else {
                    System.out.println("\nGame Over! You quit.");
                    System.out.println("The correct number was: " + random);
                    break; // Exit the loop - game over (quit)
                }

            } while (guess != random); // Continue until correct guess

            // Game ends here
            System.out.println("\nThanks for playing!");
        }

    }
}