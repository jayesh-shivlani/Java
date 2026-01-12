package BitManipulation;

import java.util.*;

public class CountTotalSetBits {

    public static int CountSetBits(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("No of set bits : " + CountSetBits(n));

        sc.close();
    }
}