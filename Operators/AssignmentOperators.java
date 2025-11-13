package Operators;

// Program to demonstrate Assignment Operators in Java
// Assignment operators are used to assign values to variables with operations

public class AssignmentOperators {

    public static void main(String args[]) {

        // Addition Assignment (+=): Adds value to variable and assigns result
        int A = 10;
        A += 10; // Equivalent to: A = A + 10
        System.out.println(A); // Output: 20

        // Subtraction Assignment (-=): Subtracts value from variable and assigns result
        int B = 20;
        B -= 10; // Equivalent to: B = B - 10
        System.out.println(B); // Output: 10

        // Multiplication Assignment (*=): Multiplies variable by value and assigns result
        int C = 5;
        C *= 5; // Equivalent to: C = C * 5
        System.out.println(C); // Output: 25

        // Division Assignment (/=): Divides variable by value and assigns result
        int D = 15;
        D /= 3; // Equivalent to: D = D / 3
        System.out.println(D); // Output: 5

        // Modulo Assignment (%=): Gets remainder and assigns to variable
        int E = 21;
        E %= 4; // Equivalent to: E = E % 4
        System.out.println(E); // Output: 1
    }
}
