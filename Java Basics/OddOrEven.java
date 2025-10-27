//Program to find if a number is odd or even

import java.util.*;

public class OddOrEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int A = sc.nextInt();

        if (A % 2 == 0) {
            System.out.println("even");
        }

        else {
            System.out.println("odd");
        }

        sc.close();
    }
}
