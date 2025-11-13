package PracticeProblems.Logic;

// Program to find the largest among three numbers
// Uses if-else ladder to compare three numbers

import java.util.*;

public class LargestOfThree {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read three numbers from user
        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.print("Enter C : ");
        int C = sc.nextInt();

        // Check if A is greater than both B and C
        if ((A > B) && (A > C)) {
            System.out.println("A is largest");
        } // If A is not largest, check if B is greater than C
        else if (B > C) {
            System.out.println("B is largest");
        } // If neither A nor B is largest, check if C is greater than B
        else if (C > B) {
            System.out.println("C is largest");
        } // If none of the above conditions are true, all three are equal
        else {
            System.out.println("A, B & C are equal");
        }

        // Close the scanner
        sc.close();
    }
}
