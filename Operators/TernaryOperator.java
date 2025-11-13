package Operators;

// Program to demonstrate Ternary Operator (Conditional Operator)
// Ternary operator: condition ? valueIfTrue : valueIfFalse
// It's a shorthand for simple if-else statements

import java.util.*;

public class TernaryOperator {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter A : ");
        int A = sc.nextInt();

        // Ternary operator syntax: condition ? value_if_true : value_if_false
        // If A is divisible by 2 (even), assign "even", otherwise assign "odd"
        String type = (A % 2 == 0) ? "even" : "odd";

        // Display the result
        System.out.println(type);

        // Close the scanner
        sc.close();
    }
}
