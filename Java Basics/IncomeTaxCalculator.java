//Program to calculate income tax calculator

import java.util.*;

public class IncomeTaxCalculator {
    public static void main(String agrs[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter income in lakhs : ");
        float income = sc.nextFloat();
        float tax;

        if (income < 5) {
            tax = 0.0f;
        }

        else if (income >= 5 && income <= 10) {
            tax = (20 * income) / 100;
        }

        else {
            tax = (50 * income) / 100;
        }

        System.out.println("Tax(in lakhs) is " + tax);

        sc.close();
    }
}
