package JavaBasics.PracticeProblems.Logic;

// Program to check if a number is odd or even
// Logic: If a number is divisible by 2 (remainder = 0), it's even; otherwise odd

import java.util.*;

public class OddOrEven {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter any number : ");
        int A = sc.nextInt();

        // Check if number is even using modulo operator
        // If remainder after division by 2 is 0, number is even
        if (A % 2 == 0) {
            System.out.println("even");
        } // If remainder is not 0, number is odd
        else {
            System.out.println("odd");
        }

        // Close the scanner
        sc.close();
    }
}
