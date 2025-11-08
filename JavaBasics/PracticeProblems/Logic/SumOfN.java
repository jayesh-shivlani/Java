package JavaBasics.PracticeProblems.Logic;

// Program to find sum of first N natural numbers

import java.util.Scanner;

public class SumOfN {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : "); // Take input from the user
        int n = sc.nextInt(); // Store the input
        int sum = 0, i = 1; // initialize sum with 0 & i with 1
        while (i <= n) {
            sum += i; // Store sum values
            i++; // Update i
        }
        System.out.println("The sum is " + sum); // FInal sum 
        sc.close(); // CLose scanner class
    }
}
