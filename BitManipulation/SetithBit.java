package BitManipulation;

// Program to set ith bit, making ith bit 1

import java.util.Scanner;

public class SetithBit {

    // function to set the ith bit
    public static int SetIthBit(int A, int i) { // formal parameters are int A & ith position

        int BitMask = 1 << i; // initialize BitMask with 1 left shift ith position

        return A | BitMask; // return the number by setting the ith bit as 1
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.print("Enter ith position : "); // input the ith position from user
        int i = sc.nextInt(); // store the ith position

        System.out.println("A : " + SetIthBit(A, i)); // function call with arguments int A & ith
                                                      // position and print the ith bit

        sc.close(); // close the scanner object
    }
}
