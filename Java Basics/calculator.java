//Program to make a calculator using switch statement

import java.util.*;

public class Calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        float A = sc.nextFloat();
        System.out.print("Enter B : ");
        float B = sc.nextFloat();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0); // To convert string into character

        switch (operator) {

            case '+':
                System.out.println(A + B);
                break;
            case '-':
                System.out.println(A - B);
                break;
            case '*':
                System.out.println(A * B);
                break;
            case '/':
                System.out.println(A / B);
                break;
            case '%':
                System.out.println(A % B);
                break;
            default:
                System.out.println("Wrong operator");

        }

        sc.close();

    }
}
