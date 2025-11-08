package JavaBasics.PracticeProblems.Applications;

// Program to calculate income tax based on income slabs
// Tax Slabs: <5 lakhs: 0%, 5-10 lakhs: 20%, >10 lakhs: 50%

import java.util.*;

public class IncomeTaxCalculator {

    public static void main(String agrs[]) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read income from user
        System.out.println("Enter income in lakhs : ");
        float income = sc.nextFloat();
        float tax;

        // Tax calculation based on income slabs
        // Slab 1: Income less than 5 lakhs - No tax
        if (income < 5) {
            tax = 0.0f;
        } // Slab 2: Income between 5 and 10 lakhs - 20% tax
        else if (income >= 5 && income <= 10) {
            tax = (20 * income) / 100;
        } // Slab 3: Income more than 10 lakhs - 50% tax
        else {
            tax = (50 * income) / 100;
        }

        // Display the calculated tax
        System.out.println("Tax(in lakhs) is " + tax);

        // Close the scanner
        sc.close();
    }
}
