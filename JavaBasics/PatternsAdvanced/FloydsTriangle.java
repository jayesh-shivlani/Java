// Program to print Floyd's Triangle using nested loops

package JavaBasics.PatternsAdvanced;

import java.util.Scanner;

public class FloydsTriangle {
    // Function to print the required pattern
    public static void Floyd_Triangle(int totRows) { // formal parameters
        int counter = 1; // initialize counter with 1
        // outer loop --> rows
        for (int row = 1; row <= totRows; row++) {
            // inner loop --> what to print
            for (int j = 1; j <= row; j++) {
                System.out.print(counter + " ");
                counter++; // update counter
            }
            System.out.println(); // next line after each completion of inner loop
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total numbers of rows : "); // take total number of rows from user
        int totRows = sc.nextInt(); // store the input
        Floyd_Triangle(totRows); // function call with arguments
        sc.close(); // close scanner object
    }

}