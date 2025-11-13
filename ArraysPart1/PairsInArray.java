package ArraysPart1;

// Program to print all Possible pairs in an Array

import java.util.*;

public class PairsInArray {

    // Function to find the pairs of the array
    public static void Pairs(int array[], int n) { // formal parameters are an array & total elements n

        int counter = 0; // initialize counter with 0 to count total number of pairs of array
        System.out.println("Possible pairs are : ");
        // outer loop --> Picking the elements one by one
        for (int i = 0; i < n; i++) {
            // inner loop --> Matching the element with every other element to make a pair
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ") ");
                counter++; // update counter
            }
            System.out.println(); // next line after each completion of inner loop
        }
        System.out.println("Total pairs are : " + counter); // print total no of pairs
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[100]; // initialize an array of size 100

        System.out.print("Enter total no of elements : "); // take total no of elements from an array
        int n = sc.nextInt(); // store the input

        // store the elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Pairs(array, n); // function call with arguments array & n
        sc.close(); // close the scanner object
    }
}
