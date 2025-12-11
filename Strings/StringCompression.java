package Strings;

// Program to compress a given string by writing a count next to each repeating character in a string using StringBuilder

import java.util.*;

public class StringCompression {

    // Function to compress the string
    public static String compress(String str) { // formal parameter is a string

        StringBuilder sb = new StringBuilder(""); // initialize a empty string builder

        // traverse to each character of the string
        for (int i = 0; i < str.length(); i++) {

            Integer count = 1; // initialize a integer object with 1 (we used integer object because at last we have to add this count in our string)

            // if same character repeats than update the count
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i)); // add each character to string builder

            if (count > 1) {
                sb.append(count.toString()); // if count is > 1 then add the count next to that character
            }
        }

        return sb.toString(); // return the compressed string
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object

        System.out.print("Enter String : "); // input a string from user
        String str = sc.nextLine(); // store the string

        // print the compressed string
        System.out.println("Compressed String : " + compress(str)); // function call with argument string

        sc.close(); // close the scanner object
    }
}