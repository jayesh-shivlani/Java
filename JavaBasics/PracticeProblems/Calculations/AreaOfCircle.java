package JavaBasics.PracticeProblems.Calculations;

// Program to calculate Area of Circle
// Formula: Area = π * r²

import java.util.*;

public class AreaOfCircle {

    public static void main(String args[]) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Read radius from user
        float radius = sc.nextFloat();

        // Calculate area using formula: π * r²
        // Add 'f' suffix to specify float type (by default Java considers decimal numbers as double)
        float area = (3.14f * radius * radius);

        // Display the calculated area
        System.out.println(area);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
