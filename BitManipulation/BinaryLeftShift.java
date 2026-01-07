package BitManipulation;

// Program to show Binary Left Shift (A << B)
// A's bits are moved B bits to left side & the remaining bits becomes 0

import java.util.Scanner;

public class BinaryLeftShift {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.print("Enter B : "); // input B from user
        int B = sc.nextInt(); // store B

        System.out.println("A << B = " + (A << B)); // print A << B

        sc.close(); // close the scanner object
    }
}