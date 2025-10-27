//Program to find if the student is pass or fail

import java.util.*;

public class PassOrFail {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        String type = (marks >= 33) ? "Pass" : "Fail";
        System.out.println("The student is " + type);

        sc.close();
    }
}
