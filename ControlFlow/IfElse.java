package ControlFlow;

// Program to demonstrate if-else statements
// Checks if a person is adult or not based on age

import java.util.*;

public class IfElse {

    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read age from user
        System.out.println("Enter age : ");
        int age = sc.nextInt();

        // if condition: Check if age is 18 or above
        if (age >= 18) {
            System.out.println("Adult");
        } // else block: Executes when if condition is false
        else {
            System.out.println("Not Adult");
        }

        // Close the scanner
        sc.close();
    }
}