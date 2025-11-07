// Program to print Inverted Pyramid with Numbers using nested loops

package JavaBasics.PatternsAdvanced;

import java.util.Scanner;

public class InvertedPyramidWithNumbers {

    // function to print the required function
    public static void Inverted_Pyramid(int totRows) { // formal parameters
        // outer loop --> rows
        for (int row = 1; row <= totRows; row++) {
            // inner loop --> what to print
            for (int j = 1; j <= totRows - row + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // next line after each completion of inner loop
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // take total number of rows from user
        int totRows = sc.nextInt(); // store the input
        Inverted_Pyramid(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}