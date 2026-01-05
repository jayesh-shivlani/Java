package BitManipulation;

// Program to  show Binary XOR (^) operator
// GIves 1 when both bits are different, otherwise 0 

import java.util.Scanner;

public class BinaryXOR {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in); // create a scanner object to take input

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A 

        System.out.print("Enter B : "); // input B from user
        int B = sc.nextInt(); // store B

        System.out.println("A ^ B = " + (A ^ B)); // print A ^ B 

        sc.close(); // close the scanner object
    }
}
