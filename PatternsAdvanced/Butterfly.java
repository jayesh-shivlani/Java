package PatternsAdvanced;

// Program to print Diamond Pattern using nested loops

import java.util.Scanner;

public class Butterfly {

    // function to print butterfly pattern 
    public static void ButterflyPattern(int totRows) { // formal parameters
        // 1st half
        for (int row = 1; row <= totRows; row++) {

            // stars
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 1; j <= (totRows - row) * 2; j++) {
                System.out.print("  ");
            }

            // starts
            for (int j = 1; j <= row; j++) {
                System.out.print(" *");
            }
            
            // next line after each completion of inner loop
            System.out.println();
        }

        // 2nd half --> reverse the outer loop of 1st half to get the mirror image
        for (int row = totRows; row >= 1; row--) {

            // stars
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 1; j <= (totRows - row) * 2; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= row; j++) {
                System.out.print(" *");
            }

            // next line after each completion of inner loop
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // Take total number of rows from user
        int totRows = sc.nextInt(); // store the input
        ButterflyPattern(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }

}