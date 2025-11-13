package ControlFlow;

// Program to demonstrate switch statement
// Switch statement allows selection among multiple options based on a value

import java.util.*;

public class SwitchStatement {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read button number from user
        System.out.print("Enter button no. : ");
        int button = sc.nextInt();

        // Switch statement: Compares 'button' value with each case
        switch (button) {

            // Case 1: When button value is 1
            case 1:
                System.out.println("Samosa");
                break;  // break prevents fall-through to next case

            // Case 2: When button value is 2
            case 2:
                System.out.println("Burger");
                break;

            // Case 3: When button value is 3
            case 3:
                System.out.println("Cold drink");
                break;

            // Default: Executes when no case matches
            default:
                System.out.println("We wake up");

        }

        // Close the scanner
        sc.close();
    }
}
