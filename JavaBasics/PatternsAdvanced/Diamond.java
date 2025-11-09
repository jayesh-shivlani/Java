package JavaBasics.PatternsAdvanced;

// Program to print Diamond Pattern using nested loops

import java.util.Scanner;

public class Diamond {

    // function to print diamond pattern
    public static void DiamondPattern(int totRows) { // formal parameters
        
        // 1st half
        for (int row = 1; row <= totRows; row++) {

            // spaces
            for (int j = 1; j <= totRows - row; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= (2*row) - 1; j++) {
                System.out.print("* ");
            }

            // next line after each completion of inner loop
            System.out.println();
        }

        // 2nd half
        for (int row = totRows; row >= 1; row--) {

            // spaces
            for (int j = 1; j <= totRows - row; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <=(2*row)-1; j++) {
                System.out.print("* ");
            }

            // next line after each completion of inner loop
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // take total number of rows from user 
        int totRows = sc.nextInt(); // store the input
        DiamondPattern(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}
