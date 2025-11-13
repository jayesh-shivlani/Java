package PatternsAdvanced;

// Program to print Solid Rhombus pattern using nested loops

import java.util.Scanner;

public class SolidRhombus {
    
    // function to print solid rhombus 
    public static void SolidRhombusPattern(int totRows) { // formal parameters

        // outer loopp --> rows
        for(int row=1; row<=totRows; row++) {

            // spaces
            for(int j = 1; j<=totRows-row; j++) {
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j<=totRows; j++) {
                System.out.print("* ");
            }

            // next line after each completion of inner loop
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // take the total number of rows from user
        int totRows = sc.nextInt(); // store the input
        SolidRhombusPattern(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}