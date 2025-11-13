package PracticeProblems.Applications;

// Program to calculate bill with 18% GST
// Formula: Final Bill = Total + (18% of Total)

import java.util.*;

public class Bill {

    public static void main(String args[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read prices of items from user
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();

        // Calculate total price before tax
        float total = pen + pencil + eraser;

        // Calculate 18% GST on total
        float tax = (18 * total) / 100;

        // Calculate final bill amount (total + tax)
        float bill = total + tax;

        // Display the final bill amount
        System.out.println(bill);

        // Close the scanner
        sc.close();
    }
}
