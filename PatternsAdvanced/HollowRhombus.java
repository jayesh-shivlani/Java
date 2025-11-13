package PatternsAdvanced;

// Program to print Hollow rhombus using nested loops

import java.util.Scanner;

public class HollowRhombus {
    
    // function to print hollow rhombus
    public static void HollowRhombusPattern(int totRows) { // formal parameters

        // outer loop --> rows
        for(int row=1; row<=totRows; row++) {

            // spaces
            for(int j=1; j<=totRows-row; j++) {
                System.out.print("  ");
            }

            // Hollow Rectangle logic
            for(int j=1; j<=totRows; j++) {

                // stars at boundary
                if(row==1 || row==totRows || j==1 || j==totRows ){
                    System.out.print("* ");
                } 

                // spaces at other cells
                else {
                    System.out.print("  ");
                }
            }

            // next line after each completion of inner loop
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // take the total number of rows from user
        int totRows = sc.nextInt(); // store the input
        HollowRhombusPattern(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}
