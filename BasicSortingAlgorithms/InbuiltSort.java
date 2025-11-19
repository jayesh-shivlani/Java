package BasicSortingAlgorithms;

// Program to sort an given array using inbuilt functions of java
// to use the inbuild sort function we need to import Arrays or Collections Class with contain the inbuild Sort() function

import java.util.Arrays; // sorts array in ascending order
import java.util.Collections; // sorts array in descending order

public class InbuiltSort {

    // function to print array elements
    public static void PrintArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int array[] = { 5, 4, 3, 1, 2 }; // integer array

        Arrays.sort(array); // it will sort the entire array in ascending order
        PrintArray(array);

        Arrays.sort(array, 1, 4); // we add a starting & ending index incase if we want to sort a specific part of
                                                     // an array
        PrintArray(array);

        Integer a[] = { 5, 1, 3, 4, 2 }; // Integer object

        Arrays.sort(a, Collections.reverseOrder()); // it will sort the entire object in descending order, only works on
                                                    // objects, we can also add indexes for sorting specific part of the
                                                    // object

        for (int i = 0; i < array.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}