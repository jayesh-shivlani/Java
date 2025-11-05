// Program to find prime number using functions
package JavaBasics.FunctionsAndMethods;

import java.util.*;

public class PrimeUsingFunction {

    // assuming n>=2
    public static boolean IsPrime(int n) {
        // corner/special case for n = 2
        if (n == 2) {
            return true;
        }

        // for n>2, no need of else here
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : "); // take input
        int n = sc.nextInt(); // store input
        System.out.println("n is Prime : " + IsPrime(n)); // function call
        sc.close(); // close scanner object
    }
}
