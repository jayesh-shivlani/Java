package Strings;

// Program to find the largest string according to lexicographic order (in abcd whichever letter comes later that letter is considered as largest)

import java.util.*;

public class LargestString {

    // function to fing the largest string
    public static void getLargestString(String arr[]) { // formal parameter is a string

        String largestString = arr[0]; // initialize largestString assuming the 1st given string is largest

        for (int i = 0; i < arr.length; i++) {
            // compare largest string with all the other strings
            if (largestString.compareTo(arr[i]) < 0) {
                largestString = arr[i]; // update largest string
            }
        }

        System.out.println("Largest String : " + largestString); // print the largest string
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        String arr[] = new String[3]; // initialize a string array of size 3

        // input 3 strings from the user
        System.out.println("Enter 3 Strings : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine(); // store the inputs
        }

        getLargestString(arr); // function call with argument string array

        sc.close(); // close the scanner object
    }
}