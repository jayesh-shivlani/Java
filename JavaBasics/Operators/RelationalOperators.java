// Program to demonstrate Relational Operators in Java
// Relational operators compare two values and return boolean result (true/false)

import java.util.*;

public class RelationalOperators {
    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read first number from user
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        
        // Read second number from user
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        // == (Equal to): Checks if two values are equal
        System.out.println("Is A equals B : " + (a == b));
        
        // != (Not equal to): Checks if two values are different
        System.out.println("Is A not equals B : " + (a != b));
        
        // > (Greater than): Checks if left value is greater than right
        System.out.println("Is A greater than B : " + (a > b));
        
        // < (Less than): Checks if left value is less than right
        System.out.println("Is A less than B : " + (a < b));
        
        // >= (Greater than or equal to): Checks if left is greater or equal
        System.out.println("Is A greater than or equals to B : " + (a >= b));
        
        // <= (Less than or equal to): Checks if left is less or equal
        System.out.println("Is A less than or equals B : " + (a <= b));

        // Close the scanner
        sc.close();
    }
}
