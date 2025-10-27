//How to take inputs in Java

import java.util.*; // imports a package required to use the scanner class || package is something that contains so many classes within it and each class has some codes inside it.

public class InputInJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // we can use any name other then sc for scanner class

        String word = sc.next(); // saves only one word until the whitespace
        System.out.println(word);

        sc.nextLine(); // used here to catch the empty line after sc.next() to avoid exception

        String line = sc.nextLine(); // saves the entire string
        System.out.println(line);

        int number = sc.nextInt(); // saves integer value
        System.out.println(number);

        float decimal = sc.nextFloat(); // saves decimal value
        System.out.println(decimal);

        boolean check = sc.nextBoolean(); // saves true or false
        System.out.println(check);

        byte b = sc.nextByte(); // saves byte values
        System.out.println(b);

        short s = sc.nextShort(); // saves short values
        System.out.println(s);

        double d = sc.nextDouble(); // saves decimals of long type
        System.out.println(d);

        long l = sc.nextLong(); // saves integer of long type
        System.out.println(l);

        sc.close(); // use to close the scanner class
    }
}