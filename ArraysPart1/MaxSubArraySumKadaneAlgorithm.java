package ArraysPart1;

import java.util.*;

public class MaxSubArraySumKadaneAlgorithm {
    
    public static void KadaneAlgorithm(int array[], int n) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            currSum += array[i];

            if(currSum < 0) {
                currSum = 0;
            }

            MaxSum = Math.max(MaxSum, currSum);
        }

        System.out.println("Max sum is : " + MaxSum);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int array[] = new int[100];

        System.out.print("Enter total no of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        KadaneAlgorithm(array, n);
        sc.close();
    }
}
