// Program to check if a student passes or fails
// Uses ternary operator for conditional assignment
// Pass criteria: Marks >= 33

import java.util.*;

public class PassOrFail {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read marks from user
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        // Ternary operator: condition ? valueIfTrue : valueIfFalse
        // If marks >= 33, assign "Pass", otherwise assign "Fail"
        String type = (marks >= 33) ? "Pass" : "Fail";

        // Display the result
        System.out.println("The student is " + type);

        // Close the scanner
        sc.close();
    }
}
