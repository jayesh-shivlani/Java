package VariablesAndDataTypes;

// Program to calculate product of 2 numbers by taking input from user
// Demonstrates basic multiplication operation with user input

import java.util.*;

public class ProductWithInput {

    public static void main(String args[]) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        int a = sc.nextInt();

        // Read second number from user
        int b = sc.nextInt();

        // Calculate product by multiplying a and b
        int product = a * b;

        // Display the result
        System.out.println(product);

        // Close the scanner
        sc.close();
    }
}
