// Program to find reverse of a number

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse : "); // Take inout from user
        int number = sc.nextInt(); // Store the input
        int reverse = 0; // Initialize reverse with 0
        while(number>0) {
            int lastDigit = number % 10; // Find the last digit of number
            reverse = (reverse*10) + lastDigit; // FInd the reverse of number
            number/=10; // Update number
        }
        System.out.println("The reverse number is : " + reverse); // Final reverse of number
        sc.close(); // Close the Scanner class
    }
}
