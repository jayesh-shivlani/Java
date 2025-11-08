package JavaBasics.PatternsAdvanced;

import java.util.Scanner;

public class ZeroOneTriangle {

    public static void Triangle(int totRows) {
        for (int row = 1; row <= totRows; row++) {
            for (int j = 1; j <= row; j++) {
                if ((row + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rows : ");
        int totRows = sc.nextInt();
        Triangle(totRows);
        sc.close();
    }
}
