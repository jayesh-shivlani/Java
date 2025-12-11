package Strings;

// Program to find length of a string

import java.util.*;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : "); // input a string from user
        String str = sc.nextLine(); // store the string

        System.out.println("String length is : " + str.length()); // print the string length using StringName.length() inbuilt function

        sc.close(); // close the scanner object
    }

}