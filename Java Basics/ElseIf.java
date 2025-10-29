// Program to demonstrate else-if statements
// Categorizes person based on age using multiple conditions

import java.util.*;

public class ElseIf {
    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read age from user
        System.out.println("Enter age in years : ");
        int age = sc.nextInt();

        // Check multiple conditions using if-else if ladder
        // First condition: Age between 0 and 13 (exclusive)
        if (age > 0 && age < 13) {
            System.out.println("Child");
        }

        // Second condition: Age between 13 and 18 (exclusive)
        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }

        // Third condition: Age 18 or above
        else if (age >= 18) {
            System.out.println("Adult");
        }

        // Default case: Invalid age (negative or zero)
        else {
            System.out.println("Enter correct age");
        }

        // Close the scanner
        sc.close();
    }
}
