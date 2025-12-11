package Strings;

// Program to compare Strings

public class StringCompare {

    public static void main(String args[]) {

        String str1 = "tony";
        String str2 = "tony";
        String str3 = new String("tony");

        // str2 point to str1 in memory
        if (str1 == str2) {
            System.out.println("String 1 & 2 are equal");
        } else {
            System.out.println("String 1 & 2 are not equal");
        }

        // str3 is a new string created in the memory as it was delcare using new keyword
        // "==" compares the strings on object level
        if (str1 == str3) {
            System.out.println("String 1 & 3 are equal");
        } else {
            System.out.println("String 1 & 3 are not equal");
        }

        // to compare the value of strings use "S1.equals(S2)" function
        if (str1.equals(str3)) {
            System.out.println("String 1 & 3 are equal");
        } else {
            System.out.println("String 1 & 3 are not equal");
        }
    }
}
