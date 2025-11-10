package JavaBasics.ArraysPart1;

// Program to show Binary Search in Array

public class BInarySearch {

    // function for Binary Search
    public static int BinSearch(int numbers[], int key) { // formal parameters are array & key

        // initialize start with 0 & end with (n-1)
        int start = 0, end = numbers.length - 1;

        // keep dividing the array until key is found
        while (start <= end) { 
            // find mid value
            int mid = (start + end) / 2;

            // Found
            if (numbers[mid] == key) {
                return mid;
            }

            // Rigth/2nd Half Check
            if (numbers[mid] < key) {
                start = mid + 1; // Update start value
            } 
            
            // Left/1st Half Check
            else {
                end = mid - 1; // Update end value
            }
        }

        return -1; // in case key is not found in the entire array 
    }

    public static void main(String args[]) {
        // Create a sorted array
        int numbers[] = { 2, 4, 6, 10, 12, 14 };
        int key = 10; // key to find

        System.out.println("index of key is : " + BinSearch(numbers, key)); // print the index where key exist
    }
}
