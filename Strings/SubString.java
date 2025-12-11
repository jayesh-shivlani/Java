package Strings;

// Program to find subString from a given String

import java.util.*;

public class SubString {

    // function to find subString
    public static String getSubString(String str, int si, int ei) { // formal parameters are string, starting index &
                                                                    // ending index

        String subStr = ""; // initialize a empty string

        // run a loop from starting index till ending index
        for (int i = si; i < ei; i++) {
            // store each character in the empty string
            subStr += str.charAt(i);
        }

        return subStr; // return the Sub String
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter String : "); // take a string from user
        String str = sc.nextLine(); // store the string

        System.out.print("Enter Starting Index : "); // take starting index from user
        int si = sc.nextInt(); // store starting index

        System.out.print("Enter Ending Index : "); // take ending index from user
        int ei = sc.nextInt(); // store ending index

        // print subString
        System.out.println("Sub String : " + getSubString(str, si, ei)); // function call with arguments string,
                                                                         // starting index & ending index
        System.out.println("Sub String Method 2 : " + str.substring(si, ei)); // substring using built in function

        sc.close(); // close scanner object
    }
}
