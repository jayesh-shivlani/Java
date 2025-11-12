package JavaBasics.ArraysPart1;

// Program to reverse an Array

import java.util.*;

public class ReverseArray {

    // Fnction to reverse the given array
    public static void Reverse_Array(int array[], int n) { // formal parameters are an array and total no of elements n
        // initialize first & last element of array with 0 & (n-1), respectively
        int first = 0, last = n - 1;
        int temp; // create a temporary variable for swapping

        while (first < last) {
            // Swapping of two numbers
            temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++; // Incremeant first
            last--; // Decremeant last
        }

        // Print the sorted array
        System.out.print("Sorted Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100]; // create a array of size 100

        System.out.print("Enter total no of elements : "); // take the total no of elements from user
        int n = sc.nextInt(); // store the input

        System.out.println("Enter elements : "); // store the elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Reverse_Array(array, n); // function call with arguments array[] & n
        sc.close(); // close the scanner object
    }
}
