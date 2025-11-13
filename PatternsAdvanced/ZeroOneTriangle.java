package PatternsAdvanced;

// Program to print 01 Triangle pattern using nested loops

import java.util.Scanner;

public class ZeroOneTriangle {

    // function to print 01 Triangle Patter
    public static void Triangle(int totRows) {

        // outer loop --> rows
        for (int row = 1; row <= totRows; row++) {

            // inner loop --> pattern 
            for (int j = 1; j <= row; j++) {

                // 1 at even places
                if ((row + j) % 2 == 0) {
                    System.out.print("1 ");
                } 
                
                // 0 at odd places
                else {
                    System.out.print("0 ");
                }
            }

            // next line after each completion of inner loop
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : "); // take total number of rows from user
        int totRows = sc.nextInt(); // store the input
        Triangle(totRows); // function call with arguments
        sc.close(); // close the scanner object
    }
}
