// Program to create a simple calculator using switch statement
// Performs basic arithmetic operations: +, -, *, /, %

import java.util.*;

public class Calculator {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        System.out.print("Enter A : ");
        float A = sc.nextFloat();

        // Read second number from user
        System.out.print("Enter B : ");
        float B = sc.nextFloat();

        // Read operator from user
        System.out.print("Enter operator : ");
        // charAt(0) extracts the first character from the input string
        char operator = sc.next().charAt(0);

        // Switch statement to perform operation based on operator
        switch (operator) {

            case '+': // Addition
                System.out.println(A + B);
                break;
            case '-': // Subtraction
                System.out.println(A - B);
                break;
            case '*': // Multiplication
                System.out.println(A * B);
                break;
            case '/': // Division
                System.out.println(A / B);
                break;
            case '%': // Modulo (Remainder)
                System.out.println(A % B);
                break;
            default: // Invalid operator
                System.out.println("Wrong operator");

        }

        // Close the scanner
        sc.close();

    }
}
