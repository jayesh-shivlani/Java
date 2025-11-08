package JavaBasics.TypeOperations;

// Program to demonstrate Type Conversion (Widening) in Java
// Type Conversion: Automatic conversion from smaller to larger data type
// Also called Implicit Casting or Widening Conversion

public class TypeConversion {

    public static void main(String args[]) {

        // Automatic conversion from int to float (Widening)
        int a = 35;
        // Java automatically converts int to float (no data loss)
        // float is larger than int in terms of storage capacity
        float b = a;
        System.out.println(b); // Output: 35.0

        // Example 1: This will give error (commented out)
        // float c = 35.65f;
        // int d = c; // ERROR: Cannot convert float to int automatically (data loss)
        // Narrowing conversion requires explicit casting: int d = (int) c;
        // Example 2: This will give error (commented out)
        // int i = 34;
        // boolean b = i; // ERROR: int and boolean are not compatible types
        // No conversion possible between int and boolean in Java
    }
}
