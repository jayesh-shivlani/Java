package FunctionsAndMethods;

// Program to find Binomial Coefficient using Function
// BinCoeff = n!/(r!x(n-r)!)

import java.util.Scanner;

public class BinomialCoefficientUsingFunction {

    // it helps as a helper function
    // function to find factorial of any n
    public static int factorial(int num) { // formal parameters
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // function to find binomial coefficient of any n and r
    public static int BinomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int BinCoeff = fact_n / (fact_r * fact_nmr);
        return BinCoeff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : "); // take n from user
        int n = sc.nextInt(); // store n
        System.out.print("Enter the value of r : "); // take r from user
        int r = sc.nextInt(); // store r
        System.out.println("The Binomial Cofficient (nCr) = " + BinomialCoefficient(n, r)); // function call with arguments
        sc.close(); // Close scanner object
    }
}
