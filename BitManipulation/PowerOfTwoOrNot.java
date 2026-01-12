package BitManipulation;

import java.util.*;

public class PowerOfTwoOrNot {

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Is the n power of 2 : " + isPowerOfTwo(n));

        sc.close();
    }
}