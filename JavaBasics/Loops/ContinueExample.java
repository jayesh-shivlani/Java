// Program which skip iterations when entered multiple of 10

package JavaBasics.Loops;

import java.util.Scanner;

public class ContinueExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 0; // Initialize number with 0
        System.out.println("Enter -ve value to exit"); 
        do {
            System.out.print("Enter number : "); // Take input
            number = sc.nextInt(); // Store input
            if(number%10==0) { // Condition to check multiple of 10
                System.out.println("Multiple of 10 now allowed");
                continue; // Skips that iteration if above condition is true
            }
            System.out.println("You entered : " + number); // Display input
        } while(number>0); // Condition for exiting the loop
        System.out.println("You made out of the Loop");
        sc.close(); // CLose Scanner
    }
}