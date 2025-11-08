package JavaBasics.PracticeProblems.Logic;

// Program to print reverse of a given number

import java.util.Scanner;

public class PrintReverseNumber {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse : "); // Take input from user
        int n = sc.nextInt(); // Store input from user
        while (n > 0) {
            int lastDigit = n % 10; // to find last digit of any number do : num % 10
            System.out.print(lastDigit);
            n /= 10; // to remove last digit of any number do : num / 10
        }
        sc.close();
    }
}
