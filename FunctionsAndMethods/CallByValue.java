package FunctionsAndMethods;

// program to swap numbers using call by value

import java.util.Scanner;

public class CallByValue {

    public static void swap(int a, int b) {
        int temp = a; // create a temp variable for swapping
        a = b;
        b = temp;
        System.out.println("After Swapping, a = " + a + " b = " + b); // Store a copy of a & b of main function, no
        // change of value in main funtion only limited
        // within this function
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : "); // input a
        int a = sc.nextInt(); // store a
        System.out.print("Enter b : "); // input b
        int b = sc.nextInt(); // store b
        System.out.println("Before Swapping, a = " + a + " b = " + b);
        swap(a, b); // function call with arguments
        sc.close(); // close scanner object
    }
}