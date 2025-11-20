package TwoDimensionalArrays;

// Program to implement 2D Arrays, search a key in 2D Array & to find smallest & largest element of 2D Array

import java.util.*;

public class TwoDArrays {

    // Function to search the given key in 2D Array
    public static boolean search(int array[][], int key) { // Formal parameters are 2D array & key

        // outer loop --> rows
        for (int row = 0; row < array.length; row++) {
            // inner loop --> columns
            for (int col = 0; col < array[0].length; col++) {
                // condition to find key in array
                if (array[row][col] == key) {
                    System.out.println("KEY FOUND");
                    System.out.println("The key is at index (" + row + "," + col + ")");
                    return true;
                }
            }
        }

        System.out.println("KEY NOT FOUND");
        return false;
    }

    // Function to print 2D Array
    public static void print(int array[][]) { // formal parameter is an 2D Array

        // outer loop --> rows
        for (int row = 0; row < array.length; row++) {
            // inner loop --> columns
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println(); // next line after each row
        }

        System.out.println();
    }

    // function to find largest element from 2D Array
    public static void largest(int array[][]) { // formal parameter is an 2D Array

        int largest = Integer.MIN_VALUE; // initialize largest with minus infinity to find largest element

        // outer loop --> rows
        for (int row = 0; row < array.length; row++) {
            // inner loop --> columns
            for (int col = 0; col < array[0].length; col++) {
                // if any element is larger than largest then store that element in largest
                if (array[row][col] > largest) {
                    largest = array[row][col];
                }
            }
        }

        System.out.println("Largest Element is : " + largest); // print the largest element found
    }

    // function to find the smallest element from 2D Array
    public static void smallest(int array[][]) { // formal parameter is an 2D Array

        int smallest = Integer.MAX_VALUE; // initialize smallest with plus infinity to find smallest element

        // outer loop --> rows
        for (int row = 0; row < array.length; row++) {
            // inner loop --> columns
            for (int col = 0; col < array[0].length; col++) {
                // if any element is smaller than smallest then store that element in smallest
                if (array[row][col] < smallest) {
                    smallest = array[row][col];
                }
            }
        }

        System.out.println("Smallest Element is : " + smallest); // print the smallest element found
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // create a scanner object to take input from user

        int array[][] = new int[3][3]; // initialize a 2D Array of 3 x 3 (total 9 elements)

        // take the input from user
        System.out.print("Enter 9 elements : ");
        // outer loop --> rows
        for (int row = 0; row < array.length; row++) {
            // inner loop --> columns
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = sc.nextInt(); // store the input
            }
        }

        System.out.print("Enter key to search : "); // take the key from the user to find
        int key = sc.nextInt(); // store the key

        print(array); // function call with argument 2D Array
        search(array, key); // function call with argument 2D Array & key to find
        largest(array); // function call with argument 2D Array
        smallest(array); // function call with argument 2D Array

        sc.close(); // close the scanner object
    }
}