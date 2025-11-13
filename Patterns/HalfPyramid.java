package Patterns;

// Program to write Half Pyramid

public class HalfPyramid {

    public static void main(String[] args) {
        int TotalLine = 4; // Total no of line of pattern
        for (int line = 1; line <= TotalLine; line++) { // outer loop
            for (int number = 1; number <= line; number++) { // inner loop
                System.out.print(number + " "); // What to print
            }
            System.out.println(); // next line after each completion of inner loop
        }
    }
}
