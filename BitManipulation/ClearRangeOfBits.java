package BitManipulation;

import java.util.*;

public class ClearRangeOfBits {

    public static int ClearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Enter ith position : ");
        int i = sc.nextInt();

        System.out.print("Enter jth position : ");
        int j = sc.nextInt();

        System.out.println("new n : " + ClearBitsInRange(n, i, j));

        sc.close();
    }
}