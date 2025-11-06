// Program to convert Binary into Decimal

package JavaBasics.FunctionsAndMethods;

import java.util.*;

public class BinaryToDecimal {

    // function to convert Binary into Decimal
    public static void BinToDec(int BinNum) {
        int MyNum = BinNum; // store the original Binary number
        int pow = 0; // initialize power with 0
        int dec = 0; // initialize decimal with 0
        while (BinNum > 0) {
            int LastDigit = BinNum % 10; // formula to find last digit of any number
            dec += LastDigit * (int) Math.pow(2, pow); // converting binary into decimal
            BinNum /= 10; // update the Binary number
            pow++; // update power
        }
        System.out.println("Decimal of " + MyNum + " = " + dec); // display the output
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : "); // input a binary nummber from user
        int BinNum = sc.nextInt(); // store the input
        BinToDec(BinNum); // function call with arguments
        sc.close(); // close the scanner object
    }
}
