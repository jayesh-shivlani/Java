//Program to find largest between 3 numbers

import java.util.*;

public class LargestOfThree {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int A = sc.nextInt();
        System.out.print("Enter B : ");
        int B = sc.nextInt();
        System.out.print("Enter C : ");
        int C = sc.nextInt();

        if((A>B) && (A>C)) {
            System.out.println("A is largest");
        }

        else if(B>C) {
            System.out.println("B is largest");
        }

        else if(C>B) {
            System.out.println("C is largest");
        }

        else {
            System.out.println("A, B & C are equal");
        }

        sc.close();
    }
}