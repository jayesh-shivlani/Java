//Program to show Relational operators

import java.util.*;

public class RelationalOperators {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        System.out.println("Is A equals B : " + (a == b));
        System.out.println("Is A not equals B : " + (a != b));
        System.out.println("Is A greater than B : " + (a > b));
        System.out.println("Is A less than B : " + (a < b));
        System.out.println("Is A greater than or equals to B : " + (a >= b));
        System.out.println("Is A less than or equals B : " + (a <= b));

        sc.close();
    }
}
