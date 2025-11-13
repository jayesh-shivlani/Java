package TypeOperations;

// Program to demonstrate Type Casting in Java
// Type Casting: Manually converting one data type to another (Narrowing Conversion)
// Used when converting larger data type to smaller (may cause data loss)

public class TypeCasting {

    public static void main(String args[]) {

        // Casting float to int (Narrowing)
        float a = 25.999f;
        // (int) explicitly converts float to int
        // Data loss occurs: Decimal part is truncated, only 25 remains
        int b = (int) a;
        System.out.println(b); // Output: 25

        // Casting char to int (Automatic)
        char ch = 'a';
        // char to int conversion is possible (returns ASCII value)
        int c = ch;
        System.out.println(c); // Output: 97 (ASCII value of 'a')
    }
}
