package BasicSortingAlgorithms;

// Program to sort an array using Insertion Sort
// Pick an element (from unsorted part) and place it in the right position in sorted part

import java.util.*;

public class InsertionSort {

    // Function to sort an array using Insertion Sort
    public static void Insertion_Sort(int arr[], int n) { // Formal parameters are an array & total no of elements n

        // Outer loop --> total no of turns = n
        for (int i = 1; i < n; i++) {

            int curr = arr[i]; // Storing the element in a temporary variable
            int prev = i - 1; // Finding out the sorted part

            // Finding the right position to insert the element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insertion of the element at the right position
            arr[prev + 1] = curr;
        }
    }

    // Function to print the Array
    public static void Print_Array(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100]; // Initialize array of size 100

        System.out.print("Enter total no of elements : "); // Take total no of elements from user
        int n = sc.nextInt(); // store the input

        // Store the elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Insertion_Sort(arr, n); // Function call with arguments array & n
        Print_Array(arr, n); // Function call with arguments array & n

        sc.close(); // close the Scanner Object
    }
}
