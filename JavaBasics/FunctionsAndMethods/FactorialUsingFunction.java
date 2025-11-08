package JavaBasics.FunctionsAndMethods;

// Program to find factorial of n using FUNCTION
// Factorial of n = 1 x 2 x 3 x ... x n

import java.util.Scanner;

public class FactorialUsingFunction {

    public static int factorial(int n) { // formal parameters
        int fact = 1; // initialize fact with 1
        for (int i = 1; i <= n; i++) {
            fact = fact * i; // logic to find factorial of any n
        }
        return fact; // returns value of factorial
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : "); // take input from the user
        int n = sc.nextInt(); // stores the input
        System.out.println("The factorial of n is : " + factorial(n)); // print the final answer of factorial by calling
        // the function wih arguments
        sc.close(); // close the scanner object
    }
}