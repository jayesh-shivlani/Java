package Strings;

// Program to connvert 1st letter of each word of the string to uppercase

import java.util.*;

public class ConvertToUppercase {

    // function to convert the 1st word to uppercase
    public static String toUppercase(String str) { // formal parameter is a string

        StringBuilder sb = new StringBuilder(""); // initialize a empty string builder

        sb.append(Character.toUpperCase(str.charAt(0))); // convert the 1st letter to uppercase

        for (int i = 1; i < str.length(); i++) {
            // find each word in a string and convert it to uppercase using
            // Character.toUppercase() function
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString(); // return the stringbuilder converted to string using .toString() function
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter String : "); // input a string from user
        String str = sc.nextLine(); // store the string

        // print the uppercased string
        System.out.println("Uppercase String : " + toUppercase(str)); // function call with arugment string

        sc.close(); // close the scanner object
    }
}
