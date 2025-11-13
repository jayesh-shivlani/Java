package ArraysPart1;

import java.util.Scanner;

public class Arrays {

    public static void main(String args[]) {

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter physics marks : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter chemistry marks : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths marks : ");
        marks[2] = sc.nextInt();

        System.out.println("Array length : " + marks.length);

        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;

        System.out.println("Percentage : " + percentage);

        marks[2] = 100;
        System.out.println("New math marks : " + marks[2]);

        sc.close();
    }
}