package ArraysPart1;

// Program to find Largest & Smallest number from an array

import java.util.*;

public class LargestAndSmallestNumber {

    // Function to find the largest number of the array
    public static int LargestNumber(int numbers[], int n) { // formal parameters are array and total elements

        int largest = Integer.MIN_VALUE; // take largest value as minus infinity

        // loop for comparing all the values of array with largest
        for (int i = 0; i < n; i++) {
            // if any number larger than largest is found, store that number in largest
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    // Function to find the smallest number of the array
    public static int SmallestNumber(int numbers[], int n) { // formal parameters are array & total elements

        int smallest = Integer.MAX_VALUE; // take smallest value as plus infinity

        // loop for comparing all the values of array with smallest
        for (int i = 0; i < n; i++) {
            // if any number smaller that smallest is found, store that number in smallest
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[100]; // create an array numbers of size 100

        System.out.print("Enter total number of elements : "); // take total no of elements from user
        int n = sc.nextInt(); // store the input

        System.out.println("Enter numbers : ");

        // store numbers from user till n
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Largest Number : " + LargestNumber(numbers, n)); // print largest number
        System.out.println("Smallest Number : " + SmallestNumber(numbers, n)); // print smallest number

        sc.close(); // close scanner object
    }
}
