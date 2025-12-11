package Strings;

// Program to show StringBuilder demo
// It is used when we have to make changes in the original variable unlike string variables

public class Stringbuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder(""); // initialize a empty string builder

        for (char ch = 'a'; ch <= 'z'; ch++) {
            str.append(ch); // .append() is used to add a character at the last
        }

        System.out.println("String Builder : " + str); // print string builder
        System.out.println("Length : " + str.length()); // print length of string builder
    }
}