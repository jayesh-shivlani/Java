// Program to demonstrate Unary Arithmetic Operators in Java
// Unary operators work with a single operand

public class ArithmeticUnary {

    public static void main(String args[]) {

        // Pre-Increment (++a): Increments the value first, then returns it
        int a = 10;
        int b = ++a; // a becomes 11, then assigns 11 to b
        System.out.println("A = " + a); // Output: 11
        System.out.println("B = " + b); // Output: 11

        // Post-Increment (c++): Returns the current value first, then increments
        int c = 10;
        int d = c++; // Assigns 10 to d, then c becomes 11
        System.out.println("C = " + c); // Output: 11
        System.out.println("D = " + d); // Output: 10

        // Pre-Decrement (--e): Decrements the value first, then returns it
        int e = 10;
        int f = --e; // e becomes 9, then assigns 9 to f
        System.out.println("E = " + e); // Output: 9
        System.out.println("F = " + f); // Output: 9

        // Post-Decrement (g--): Returns the current value first, then decrements
        int g = 10;
        int h = g--; // Assigns 10 to h, then g becomes 9
        System.out.println("G = " + g); // Output: 9
        System.out.println("H = " + h); // Output: 10
    }

}
