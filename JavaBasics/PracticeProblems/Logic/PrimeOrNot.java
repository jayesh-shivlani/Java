package JavaBasics.PracticeProblems.Logic;

// Program to check whether a number is prime or not

import java.util.*; // used for scanner & Math object

public class PrimeOrNot {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check : "); // Take input
        int number = sc.nextInt(); // store input
        boolean IsPrime = true; // initialize IsPrime with true
        if (number == 2) { // for n = 2
            System.out.println("n is prime");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) { // Check for multiples of n except 1 & n itself
                    IsPrime = false;
                }
            }
            if (IsPrime) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        sc.close(); // close scanner class
    }
}
