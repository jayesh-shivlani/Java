package BitManipulation;

// Program to clear the ith position bit, setting it to 0

import java.util.Scanner;

public class ClearithBit {

    // function to clear the ith bit
    public static int ClearIthBit(int A, int i) { // formal parameters are int A & ith position
        int BitMask = ~(1 << i); // initialize BitMask with not of 1 left shift ith posiiton
        return A & BitMask; // return the updated number
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input from user

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.print("Enter ith position : "); // input ith position from user
        int i = sc.nextInt(); // store i

        System.out.println("A : " + ClearIthBit(A, i)); // function call with arguments A & ith position

        sc.close(); // close the scanner object
    }
}