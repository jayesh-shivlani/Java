package JavaBasics.PatternsAdvanced;

// program to print inverted & rotated half pyramid using nested loops

import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {

    // function to print the required pattern
    public static void inverted_halfPyramid(int totRows) { // formal parameters
        // outer loop --> rows
        for (int row = 1; row <= totRows; row++) {
            // inner loop
            // for spaces
            for (int spaces = 1; spaces <= totRows - row; spaces++) {
                System.out.print("  ");
            }
            // for stars
            for (int stars = 1; stars <= row; stars++) {
                System.out.print(" *");
            }
            System.out.println(); // go to next line after each completion of inner loop
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : "); // take total number of rows from user
        int totRows = sc.nextInt(); // store the input
        inverted_halfPyramid(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}
