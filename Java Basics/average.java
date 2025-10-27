//Program to calculate Average of 3 numbers

import java.util.*;

public class Average {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;
        double average = sum / 3.0; // Here we need to write 3.0 instead of 3 otherwise it will only give the integer part 0f the calculation.
        System.out.println(average);

        sc.close();
    }
}
