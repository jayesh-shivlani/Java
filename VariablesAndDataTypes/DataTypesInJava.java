package VariablesAndDataTypes;

// Program to demonstrate different Primitive Data Types in Java
// Java has 8 primitive data types

public class DataTypesInJava {

    public static void main(String[] args) {
        // Primitive Data Types in Java:

        // byte: 8-bit signed integer, Range: -128 to 127
        byte x = 12;

        // short: 16-bit signed integer, Range: -32,768 to 32,767
        short y = 240;

        // int: 32-bit signed integer, Range: -2^31 to 2^31-1
        int z = 111;

        // long: 64-bit signed integer, used for very large integers, use 'l' suffix
        // Range: -2^63 to 2^63-1
        long l = 12809992231l;

        // float: 32-bit floating-point number, use 'f' suffix
        float f = 10.5f;

        // double: 64-bit floating-point number, used for precise decimal values
        // use 'd' suffix -> optional
        // No suffix needed (default for decimal numbers)
        double d = 15.983782232d;

        // char: 16-bit Unicode character, stores a single character
        char ch = 'a';

        // boolean: stores true or false values only
        boolean var = true;

        // Display all data type values
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(var);
    }
}