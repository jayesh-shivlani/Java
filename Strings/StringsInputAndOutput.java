package Strings;

// Program to show input & output in Strings

import java.util.*;

public class StringsInputAndOutput {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // sc.next() --> stores a word, terminates after next line or a blank space
        System.out.print("Enter a word : "); // input a word from user
        String word = sc.next(); // store the word

        sc.nextLine(); // consume the leftover newline

        // sc.nextLine() --> stores the entire line
        System.out.print("Enter a line : "); // input a line from user
        String line = sc.nextLine(); // store the line

        // print the strings
        System.out.println("Your word is : " + word); // print the word
        System.out.println("Your line is : " + line); // print the line

        sc.close(); // close the scanner object
    }
}
