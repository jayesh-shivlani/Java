//Program to show Ternary operator

import java.util.*;

public class TernaryOperator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int A = sc.nextInt();

        String type = (A % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        sc.close();
    }
}
