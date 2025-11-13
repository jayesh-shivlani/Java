package PracticeProblems.Logic;

// Program to find the largest of two numbers
// Compares two numbers and determines which is greater

import java.util.*;

public class LargestOfTwo {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        System.out.println("Enter A : ");
        int A = sc.nextInt();

        // Read second number from user
        System.out.println("Enter B : ");
        int B = sc.nextInt();

        // Check if A is greater than B
        if (A > B) {
            System.out.println("A is greater");
        } // Check if A and B are equal
        else if (A == B) {
            System.out.println("A equals B");
        } // If neither above is true, B must be greater
        else {
            System.out.println("B is greater");
        }

        // Close the scanner
        sc.close();
    }
}
