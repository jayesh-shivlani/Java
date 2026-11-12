package RecursionBasicsPart1;

import java.util.Scanner;

public class DecreasingOrder {

    public static void PrintDecreasingOrder(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        PrintDecreasingOrder(n - 1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Decreasing Order : ");
        PrintDecreasingOrder(n);

        sc.close();
    }
}