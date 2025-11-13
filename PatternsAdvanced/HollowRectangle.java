package PatternsAdvanced;

// Program to print a hollow rectangle pattern using nested loop

import java.util.*;

public class HollowRectangle {

    // function to print hollow rectangle pattern
    public static void hollow_rectangle(int TotRows, int TotCols) { // formal parameters
        // outer loop --> rows
        for (int row = 1; row <= TotRows; row++) {
            // inner loop --> columns
            for (int col = 1; col <= TotCols; col++) {
                // boundary cell conditions
                if (row == 1 || row == TotRows || col == 1 || col == TotCols) {
                    System.out.print("* ");
                } else { // inner cells
                    System.out.print("  ");
                }
            }
            System.out.println(); // go to next line after each completion of inner loop
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total rows : "); // take total number of rows from user
        int TotRows = sc.nextInt(); // store the input
        System.out.print("Enter total columns : "); // take total number of columns from user
        int TotCols = sc.nextInt(); // store the input
        hollow_rectangle(TotRows, TotCols); // function call with arguments
        sc.close(); // close the scanner object
    }
}