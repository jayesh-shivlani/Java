// Program to calculate Area of Square
// Formula: Area = side²

import java.util.*;

public class AreaOfSquare {
    public static void main(String args[]) {

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Read the length of side from user
        double side = sc.nextDouble();

        // Calculate area using formula: side * side
        double area = side * side;

        // Display the calculated area
        System.out.println(area);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
