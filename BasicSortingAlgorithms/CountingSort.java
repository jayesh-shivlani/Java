package BasicSortingAlgorithms;

// Program to sort an array using Counting sort
// Effective only used when the range(max value) of given is small, quantity can be large

import java.util.*;

public class CountingSort {

    // Function to sort array using Counting sort
    public static void Counting_Sort(int arr[], int n) { // formal parameters are an array & total no of elements n

        int largest = Integer.MIN_VALUE; // initialize largest with minus infinity to find the range
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]); // using the max function to find the largest element(Range)
        }

        // frequency count
        int count[] = new int[largest + 1]; // initialize a count array to count the frequency
        for (int i = 0; i < n; i++) {
            count[arr[i]]++; // counting the frequency of elements
        }

        // sorting
        int j = 0; // initialize j with 0 to use as an index
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i; // storing the elements in ascending order in accordence of their frequency
                j++; // updating index
                count[i]--; // updating frequency
            }
        }
    }

    // Function to print the array
    public static void Print_Array(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100]; // intialize array with size 100

        System.out.print("Enter total no of elements : "); // Take total no of elements from user
        int n = sc.nextInt(); // store the input

        // Store the elements
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Counting_Sort(arr, n); // Function call with arguments array & n
        Print_Array(arr, n); // Function call with arguments array & n

        sc.close(); // close the Scanner object
    }
}
