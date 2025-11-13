package ArraysPart1;

import java.util.Scanner;

public class ArraysFunctionArguments {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;

        for (int i = 0; i < 3; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[10];
        int nonChangeable = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics, Chemistry & Maths : ");

        for(int i=0; i<=2; i++) {
            marks[i] = sc.nextInt();
        }

        update(marks, nonChangeable);

        System.out.println(nonChangeable);
        
        for(int i=0; i<3; i++) {
            System.out.print(marks[i] + " ");
        }

        sc.close();
    }
}
