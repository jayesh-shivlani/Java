package JavaBasics.ArraysPart1;

// Program to print all sub arrays of an array, find their sum & print the largest & smallest sum

import java.util.*;

public class SubArrays {

    // FUnction to find the Sub Arrays 
    public static void PrintSubArrays(int array[], int n) { // Formal parameters are an array & total no of elements

        int counter = 0; // initialize counter with 0 to find total no of sub arrays possible
        int largest = Integer.MIN_VALUE; // Initialize largest with minus infinity for finding largest sum
        int smallest = Integer.MAX_VALUE; // Initialize smallest wiht plus infinity for finding smallest sum

        // outer loop --> Picking elements one by one
        for (int i = 0; i < n; i++) {

            // inner loop --> matching every element with every other element to find sub arrays
            for (int j = i; j < n; j++) {
                int sum = 0; // initilize sum with 0 to find sum of each sub array
                System.out.print("{ ");

                // loop for printing sub array
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " "); // print sub array
                    sum += array[k]; // adding sub array to find sum
                }

                System.out.print("}  Sum = " + sum); // print sum of sub array
                counter++; // updating counter to find total no of pairs
                System.out.println(); // next line after printing each sub array

                // Finding largest sum
                if (sum > largest) {
                    largest = sum;
                }

                // Finding smallest sum
                if (sum < smallest) {
                    smallest = sum;
                }
            }

            System.out.println(); // next line after printing all possible sub arrays of the selected element
        }

        System.out.println("Total pairs : " + counter); // print counter
        System.out.println("Largest sum is : " + largest); // print largest sum
        System.out.println("Smallest sum is : " + smallest); // print smallest sum
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
