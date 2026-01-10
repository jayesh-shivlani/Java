package BitManipulation;

// program to clear the last i bits, making all the last i bits to 0

import java.util.*;

public class CleariBits {

    // function to clear the last i bits
    public static int ClearIBits(int n, int i) { // formal parameters are the number & the ith position
        // int bitMask = -1 << i;
        int bitMask = (~0) << i; // initialize a bitMask with NOT of 0 and left shift it with ith position
        return n & bitMask; // return the new number by clearing the last i bits of the number by taking AND
                            // of n & bitMask
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input from user

        System.out.print("Enter n : "); // input n from user
        int n = sc.nextInt(); // store n

        System.out.print("Enter ith position : "); // input ith position from user
        int i = sc.nextInt(); // store i

        System.out.print("new n : " + ClearIBits(n, i)); // function call with arguments number & ith position

        sc.close(); // close the scanner object
    }
}