package Loops;

// Program to keep taking input until condition is met

import java.util.Scanner;

public class BreakExample {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter number : "); // Take input
            int number = sc.nextInt(); // Store input
            System.out.println("You entered : " + number); // Display input
            if (number % 10 == 0) { // Check condition for break
                break;
            }
        } while (true); // For infinite loop
        System.out.println("Congrats you make out of the loop");
        sc.close(); // Close Scanner
    }
}
