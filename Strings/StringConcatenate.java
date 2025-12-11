package Strings;

// Program to show Strings Concatenate --> joining two strings

import java.util.*;

public class StringConcatenate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name : "); // take input from user
        String firstName = sc.nextLine(); // store the input

        System.out.print("Enter Last Name : "); // take input from user
        String lastName = sc.nextLine(); // store the input

        String fullName = firstName + " " + lastName; // join the 2 inputs

        System.out.println("Full Name : " + fullName); // print full name

        sc.close(); // close the scanner object
    }
}