package BitManipulation;

// Program to update ith bit, make 0 or 1 at the ith position

import java.util.*;

public class UpdateithBit {

    // function to set the ith bit --> making the ith bit 1
    public static int SetIthBit(int n, int i) { // formal parameters are the number & ith position
        int bitMask = 1 << i; // initialize the bitMask with 1 left shift ith position
        return n | bitMask; // return the new number by setting 1 at ith position
    }

    // function to clear the ith bit --> making the ith bit 0
    public static int ClearIthBit(int n, int i) { // formal parameters are the number & ith position
        int bitMask = ~(1 << i); // intialize the bitMask with NOT of 1 left shift ith position
        return n & bitMask; // return the new number by clearing the ith position
    }

    // function to update the ith bit --> making the ith bit 1 or 0
    public static int UpdateIthBit(int n, int i, int newBit) { // formal paramrters are the number, ith position & the
                                                               // newBit (0 or 1)

        // Method-1 Simple Approach

        // if (newBit == 0) {
        // return ClearIthBit(n, i);
        // } else {
        // return SetIthBit(n, i);
        // }

        // Method-2 Advance Approach

        n = ClearIthBit(n, i); // 1st clear the ith bit
        int bitMask = newBit << i; // intialize the bitMask with newBit left shift i
        return n | bitMask; // return the new number by taking OR of n and bitMask

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input from user

        System.out.print("Enter n : "); // input n from user
        int n = sc.nextInt(); // store n

        System.out.print("Enter ith position : "); // input ith position from user
        int i = sc.nextInt(); // store i

        System.out.print("Enter new bit (0 or 1) : "); // input the newBit from user
        int newBit = sc.nextInt(); // store newBit

        System.out.println("new n : " + UpdateIthBit(n, i, newBit)); // function call with arguments number, ith
                                                                     // position & newBit

        sc.close(); // close the scanner object
    }
}