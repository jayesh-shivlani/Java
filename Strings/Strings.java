package Strings;

// Program to show declaration of Strings
// Strings are IMMUTABLE

public class Strings {

    public static void main(String args[]) {

        // Character Array
        char arr[] = { 'a', 'b', 'c', 'd', 'e' };

        // Strings Method-1 : Directly
        String str1 = "abcd";

        // Strings Method-2 : Using new keyword
        String str2 = new String("xyz");

        System.out.println(arr);
        System.out.println(str1);
        System.out.println(str2);
    }
}
