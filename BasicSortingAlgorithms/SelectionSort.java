package BasicSortingAlgorithms;

// Program to sort an array using Selection Sort
// Selection Sort --> Pick the smallest (From Unsorted), put it at the beginning

import java.util.*;

public class SelectionSort {

    // Function to sort an array using Selection Sort
    public static void Selection_Sort(int arr[], int n) { // Formal Parameters are an array & total no of elements n

        // outer loop --> No of turns = (n-1)
        for (int i = 0; i < n - 1; i++) {

            int minPos = i; // Initialize minPos with i, assuming the smallest element is at ith position

            // inner loop --> to find the smallest element position
            for (int j = i + 1; j < n; j++) {

                // Condition to find the smallest element of given array, if true update the
                // minPos
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // After finding the position of smallest element, push it directly at the
            // beginning by using swapping
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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

        Selection_Sort(arr, n); // Function call with arguments array & n
        Print_Array(arr, n); // Function call with arguments array & n

        sc.close(); // close the Scanner Object
    }
}
