package BitManipulation;

// Program to get the ith Bit 

import java.util.Scanner;

public class GetithBit {

    // function to get the ith bit
    public static int GetIthBit(int A, int i) { // formal parameters are int A & ith position

        int BitMask = 1 << i; // initialize BitMask with 1 left shift ith position

        // the ith bit is 0
        if ((A & BitMask) == 0) {
            return 0;
        }
        // the ith bit is 1
        else {
            return 1;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter A : "); // input A from user
        int A = sc.nextInt(); // store A

        System.out.print("Enter ith position : "); // input the ith position from user
        int i = sc.nextInt(); // store the ith position

        System.out.println("Bit at ith position : " + GetIthBit(A, i)); // function call with arguments int A & ith
                                                                        // position and print the ith bit

        sc.close(); // close the scanner object
    }

}
