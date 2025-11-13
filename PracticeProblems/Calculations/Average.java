package PracticeProblems.Calculations;

// Program to calculate Average of 3 numbers
// Formula: Average = Sum of all numbers / Count of numbers

import java.util.*;

public class Average {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read three numbers from user
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Calculate sum of three numbers
        int sum = A + B + C;

        // Calculate average
        // Note: Use 3.0 instead of 3 to perform floating-point division
        // If we use 3, Java will perform integer division and truncate the decimal part
        double average = sum / 3.0;

        // Display the average
        System.out.println(average);

        // Close the scanner
        sc.close();
    }
}
