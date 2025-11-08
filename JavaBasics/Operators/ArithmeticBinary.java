package JavaBasics.Operators;

// Program to demonstrate Binary Arithmetic Operators in Java
// Binary operators work with two operands

import java.util.*;

public class ArithmeticBinary {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        System.out.println("Enter a : ");
        int a = sc.nextInt();

        // Read second number from user
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        // Perform arithmetic operations
        System.out.println("Addition = " + (a + b));           // Adds two numbers
        System.out.println("Subtraction = " + (a - b));        // Subtracts b from a
        System.out.println("Multiplication = " + (a * b));     // Multiplies two numbers
        System.out.println("Division = " + (a / b));           // Divides a by b (integer division)
        System.out.println("Modulo(Remainder) = " + (a % b));  // Returns remainder when a is divided by b

        // Close the scanner
        sc.close();
    }
}
