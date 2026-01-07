package BitManipulation;

// Program to show Binary 1's Complement
// ~0 --> 1 & ~1 --> 0
// Positive number is conver to a negative number & vice versa

import java.util.Scanner;

public class BinaryOnesComplement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.println("~A = " + (~A)); // print 1's complement of A

        sc.close(); // close scanner object
    }
}