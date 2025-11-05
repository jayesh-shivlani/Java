// Program to  show Function overloading using no. of parameters
package JavaBasics.FunctionsAndMethods;

import java.util.Scanner;

public class FunctionOverloading1 {

    // function to add 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to add 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : "); // input a
        int a = sc.nextInt(); // store a
        System.out.print("Enter b : "); // input b
        int b = sc.nextInt(); // store b
        System.out.print("Enter c : "); // input c
        int c = sc.nextInt(); // store c
        System.out.println("a + b = " + sum(a, b)); // gives a + b
        System.out.println("b + c = " + sum(b, c)); // gives b + c
        System.out.println("a + c = " + sum(a, c)); // gives a + c
        System.out.println("a + b + c = " + sum(a, b, c)); // gives a + b + c
        sc.close(); // close scanner object
    }
}
