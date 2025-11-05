// Program to print N numbers

import java.util.Scanner;

public class PrintTillN {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range : ");  // Take range from the user

        int range = sc.nextInt(); // Store the range from user

        int counter = 1; // Initialize counter with 1

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++; // Update counter by 1
        }

        sc.close(); // Close the Scanner class
    }
}
