//Program to show Unary Arithmetic operators

public class ArithmeticUnary {
    public static void main(String args[]) {

        int a = 10; 
        int b = ++a; // Pre-Increment
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int c = 10;
        int d = c++; // Post-Increment
        System.out.println("C = " + c);
        System.out.println("D = " + d);

        int e = 10;
        int f = --e; // Pre-Decrement
        System.out.println("E = " + e);
        System.out.println("F = " + f);

        int g = 10;
        int h = g--; // Post-Decrement
        System.out.println("G = " + g);
        System.out.println("H = " + h);
    }
    
}
