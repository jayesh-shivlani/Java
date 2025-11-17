package BasicSortingAlgorithms;

// Program to sort an array using Bubble Sort
// Bubble Sort --> Large elements come to the end of array by swapping with adjacent elements

import java.util.*;

public class BubbleSort {

    // Function to sort an array using bubble sort
    public static void Bubble_Sort(int arr[], int n) { // formal parameters are an array & total no of elements n

        int swaps = 0; // Initialize swaps with 0 to check whether the given array is already sorted

        // outer loop --> No of turns = (n-1)
        for (int turn = 0; turn < n - 1; turn++) {

            // inner loop --> check adjacent elements & do swapping, check till (n-1-turn)th term
            for (int j = 0; j < n - 1 - turn; j++) {

                // check if current element is larger than adjacent element, if true then swap the elements
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++; // update the swaps by 1
                }
            }

            // if swaps remain 0 then it means array is already sorted
            if (swaps == 0) {
                System.out.println("Array already sorted...!!!");
                break; // break from the loop 
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

        Bubble_Sort(arr, n); // Function call with arguments array & n
        Print_Array(arr, n); // Function call with arguments array & n

        sc.close(); // close the Scanner object
    }
}