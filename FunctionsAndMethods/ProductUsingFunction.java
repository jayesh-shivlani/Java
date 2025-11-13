package FunctionsAndMethods;

// Program to find product of two using function

import java.util.Scanner;

public class ProductUsingFunction {

    public static int product(int a, int b) { // formal parameters
        int multiply = a * b;
        return multiply;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : "); // input a
        int a = sc.nextInt(); // store a
        System.out.print("Enter b : "); // input b
        int b = sc.nextInt(); // store b
        int multiply = product(a, b); // function call with arguments
        System.out.println("a x b = " + multiply); // display ans
        sc.close(); // close scanner object
    }
}
