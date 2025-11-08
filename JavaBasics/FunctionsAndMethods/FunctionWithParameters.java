package JavaBasics.FunctionsAndMethods;

// Program to show function with parameters
/* syntax -- returnType name(type para1, type para2) {
   //do something
   return statement;
   }*/

import java.util.Scanner;

public class FunctionWithParameters {

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum; // sum in main & sum in calculatesum function are different variables
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : "); // Take input 1 from user
        int a = sc.nextInt(); // store input 1 from user
        System.out.print("Enter value of b : "); // Take inout 2 from user
        int b = sc.nextInt(); // store input 2 from user
        int sum = calculateSum(a, b); // arguments or actual parameters
        System.out.println("The sum is " + sum);
        sc.close(); // close scanner object
    }
}
