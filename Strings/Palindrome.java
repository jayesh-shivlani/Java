package Strings;

// Program to check if a string is a palindrome

import java.util.*;

public class Palindrome {

    // function to check if a string is palindrome
    public static boolean checkPalindrome(String str) { // formal parameter is a String

        // loop to compare each starting character with the ending character till mid is reached
        for (int i = 0; i < str.length() / 2; i++) {
            // if anywhere characters are not same return false
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        // if the string is palindrome return true
        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter a string : "); // take a string input from the user
        String str = sc.nextLine(); // store the string

        System.out.println(checkPalindrome(str)); // function call with argument String

        sc.close(); // close the scanner object
    }
}