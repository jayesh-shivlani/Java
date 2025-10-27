//Program to find largest of two numbers

import java.util.*;

public class LargestOfTwo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int A = sc.nextInt();
        System.out.println("Enter B : ");
        int B = sc.nextInt();

        if(A>B)  {
            System.out.println("A is greater");
        }

        else if(A==B) {
            System.out.println("A equals B");
        }

        else {
            System.out.println("B is greater");
        }

        sc.close();
    }
}
