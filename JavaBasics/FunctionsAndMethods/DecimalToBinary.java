// Program to convert Decimal into Binary

package JavaBasics.FunctionsAndMethods;

import java.util.*;

public class DecimalToBinary {

    // function to convert Decimal into Binary
    public static void DecToBin(int DecNum) {
        int MyNum = DecNum; // store the original Decimal number
        int pow = 0; // initialize power with 0
        int bin = 0; // initialize binary wiht 0
        while (DecNum > 0) {
            int rem = DecNum % 2; // formula to find remainder of any number
            bin += rem * (int) Math.pow(10, pow); // converting to binary
            DecNum /= 2; // update Decimal number
            pow++; // update power
        }
        System.out.println("Binary of " + MyNum + " = " + bin); // display output
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : "); // take decimal number from user
        int DecNum = sc.nextInt(); // store the input
        DecToBin(DecNum); // function call with arguments
        sc.close(); // close scanner object
    }
}