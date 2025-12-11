package Strings;

// Program to show CharAt() function of Strings which returns the character at the particular index of the String

import java.util.*;

public class CharAt {

    // function to print the string
    public static void printLetters(String fullName) { // formal parameter is a string

        // loop to print the string
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }

        System.out.println(); // next line after printing the string
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter First Name : "); // input first name from user
        String firstName = sc.nextLine(); // store the input

        System.out.print("Enter Last Name : "); // input last name from user
        String lastName = sc.nextLine(); // store the input

        String fullName = firstName + " " + lastName; // concatenate first & last name

        System.out.print("Full Name : ");
        printLetters(fullName); // function call with argument fullName

        sc.close(); // close the scanner object
    }
}