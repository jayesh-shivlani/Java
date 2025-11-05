// program to show function overloading using data types
package JavaBasics.FunctionsAndMethods;

import java.util.Scanner;

public class FunctionOverloading2 {

    // function to cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter int a : "); // input int a
        int a = sc.nextInt(); // store a
        System.out.print("Enter int b : "); // input int b
        int b = sc.nextInt(); // store b
        System.out.print("Enter float c : "); // input float c
        float c = sc.nextFloat(); // store c
        System.out.print("Enter float d : "); // input float d
        float d = sc.nextFloat(); // store d
        System.out.println("a + b = " + sum(a, b)); // gives a + b
        System.out.println("c + d = " + sum(c, d)); // gives c + d
        sc.close(); // close scanner object
    }
}
