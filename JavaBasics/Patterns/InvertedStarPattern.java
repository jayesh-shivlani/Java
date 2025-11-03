// Program to print inverted star pattern

package JavaBasics.Patterns;

public class InvertedStarPattern {
    public static void main(String[] args) {
        int TotalLine = 4; // Total number of lines of pattern
        for (int line = 1; line <= TotalLine; line++) { // Outer loop
            for (int star = 1; star <= (TotalLine - line + 1); star++) { // Inner loop
                System.out.print("* "); // What to print
            }
            System.out.println(); // next line after each inner loop completion
        }
    }
}