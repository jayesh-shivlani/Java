// Program to print all the prime numbers within a given range from user

package JavaBasics.FunctionsAndMethods;

import java.util.*;

public class PrimesInRange {

    public static boolean IsPrime(int n) { // helper function
        // corner case
        if (n == 2) {
            return true;
        }

        // user sqrt(n) for optimized code
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void Range(int n) { // formal parameters

        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " "); // print the prime numbers
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range n : "); // input range from user
        int n = sc.nextInt(); // store the range
        Range(n); // function call with arguments
        sc.close(); // close scanner object
    }
}
