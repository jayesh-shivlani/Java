// Program to demonstrate different ways to take input in Java
// Using Scanner class to read various data types

// Import java.util package which contains Scanner class
// A package contains multiple classes with predefined methods
import java.util.*;

public class InputInJava {
    public static void main(String args[]) {
        // Create Scanner object to read input from System.in (keyboard)
        // 'sc' is just a variable name, can use any valid identifier
        Scanner sc = new Scanner(System.in);

        // next(): Reads a single word (stops at whitespace)
        String word = sc.next();
        System.out.println(word);

        // nextLine(): Consumes the leftover newline character from previous input
        // This prevents skipping the next nextLine() call
        sc.nextLine();

        // nextLine(): Reads entire line including spaces until newline character
        String line = sc.nextLine();
        System.out.println(line);

        // nextInt(): Reads an integer value
        int number = sc.nextInt();
        System.out.println(number);

        // nextFloat(): Reads a floating-point number (decimal)
        float decimal = sc.nextFloat();
        System.out.println(decimal);

        // nextBoolean(): Reads boolean value (true or false)
        boolean check = sc.nextBoolean();
        System.out.println(check);

        // nextByte(): Reads byte value (8-bit integer: -128 to 127)
        byte b = sc.nextByte();
        System.out.println(b);

        // nextShort(): Reads short value (16-bit integer)
        short s = sc.nextShort();
        System.out.println(s);

        // nextDouble(): Reads double value (large decimal numbers)
        double d = sc.nextDouble();
        System.out.println(d);

        // nextLong(): Reads long value (64-bit integer for very large numbers)
        long l = sc.nextLong();
        System.out.println(l);

        // close(): Closes the Scanner object to free up resources and prevent memory leak
        sc.close();
    }
}