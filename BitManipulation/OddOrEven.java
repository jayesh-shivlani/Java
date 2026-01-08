package BitManipulation;

// Program to check if a number is odd or even using Bit Manipulation

import java.util.Scanner;

public class OddOrEven {

    // function to check if the number is even or odd
    public static void CheckNumber(int A) { // formal parameter is int A

        int BitMask = 1; // intialize BitMask with 1

        // for even number
        if ((A & BitMask) == 0) {
            System.out.println("A is even");
        }
        // for odd number
        else {
            System.out.println("A is odd");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        CheckNumber(A); // function call with argument int A

        sc.close(); // close the scanner object
    }
}