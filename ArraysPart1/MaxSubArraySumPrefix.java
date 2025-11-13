package ArraysPart1;

// Program to print all sub arrays of an array, find their sum & print the largest & smallest sum

import java.util.*;

public class MaxSubArraySumPrefix {

    // FUnction to find the Sub Arrays
    public static void PrintSubArrays(int array[], int n) { // Formal parameters are an array & total no of elements

        int prefixArray[] = new int[100];
        int MaxSum = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                prefixArray[i] += array[j];
            }
            
            System.out.println(prefixArray[i]);

            if(prefixArray[i] > MaxSum) {
                MaxSum = prefixArray[i];
            }
        }

        System.out.println("Max sum is : " + MaxSum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[100]; // initialize array with size 100

        System.out.print("Enter total no of elements : "); // take total no of elementf of array from user
        int n = sc.nextInt(); // store the input

        // Input elements of array
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        PrintSubArrays(array, n); // function call with arguments array & total elements
        sc.close(); // close the scanner object
    }
}
