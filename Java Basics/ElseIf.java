//Program to show else-if statements

import java.util.*;

public class ElseIf {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age in years : ");
        int age = sc.nextInt();

        if (age > 0 && age < 13) {
            System.out.println("Child");
        }

        else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        }

        else if (age >= 18) {
            System.out.println("Adult");
        }

        else {
            System.out.println("Enter correct age");
        }

        sc.close();
    }
}
