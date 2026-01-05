package BitManipulation;

// Program to show Binary AND (&) Operator
// It only gives output 1 when all the inputs are 1, else 0

import java.util.Scanner;

public class BinaryAND {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Create a scanner object to take input from user

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.print("Enter B : "); // input B from user
        int B = sc.nextInt(); // store B

        System.out.println("A & B = " + (A & B)); // print A & B

        sc.close(); // close the scanner obkect
    }
}