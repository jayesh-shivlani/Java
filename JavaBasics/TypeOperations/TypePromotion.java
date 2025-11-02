// Program to demonstrate Type Promotion in Java
// Type Promotion: Automatic conversion of smaller types to larger types during expressions
// Rules: byte, short, char -> int; if any operand is long -> long; if any is float -> float; if any is double -> double

public class TypePromotion {
    public static void main(String args[]) {
        
        // Example 1: char promoted to int in expressions
        char a = 'a';
        char b = 'b';
        // Both a and b are automatically promoted to int during subtraction
        int sum = b - a;
        System.out.println((int)b); // Output: 98 (ASCII of 'b')
        System.out.println((int)a); // Output: 97 (ASCII of 'a')
        System.out.println(sum);    // Output: 1

        // Example 2: byte and short promoted to int
        short c = 23;
        byte d = 10;
        int s = 12;
        // byte and short are automatically promoted to int during arithmetic operations
        int z = c + d + s;
        System.out.println(z); // Output: 45

        // Example 3: All types promoted to largest type (double)
        int i = 10;
        float f = 20.25f;
        long l = 30;
        double dd = 40;
        // All types (int, float, long) are promoted to double (largest type in expression)
        double add = i + f + l + dd;
        System.out.println(add); // Output: 100.25

        // Example 4: Type promotion requires explicit casting back
        byte bb = 5;
        // bb = bb * 2; // ERROR: bb*2 is promoted to int, cannot assign int to byte
        // Solution: Explicitly cast the result back to byte
        bb = (byte)(bb * 2);
        System.out.println(bb); // Output: 10
    }
}
