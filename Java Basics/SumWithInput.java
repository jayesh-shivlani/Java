// Program to calculate sum of 2 numbers by taking input from user
// Demonstrates basic addition operation with user input

import java.util.*;

public class SumWithInput {
    public static void main(String args[]) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        int a = sc.nextInt();
        
        // Read second number from user
        int b = sc.nextInt();
        
        // Calculate sum by adding a and b
        int sum = a + b;
        
        // Display the result
        System.out.println(sum);

        // Close the scanner
        sc.close();
    }
}