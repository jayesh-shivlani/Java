// Program to print character pattern

package JavaBasics.Patterns;

public class CharacterPattern {
    public static void main(String[] args) {
        int TotalLine = 4; // Total number of lines of pattern
        char character = 'A'; // Initialize character with A
        for (int line = 1; line <= TotalLine; line++) { // Outer loop
            for (int chars = 1; chars <= line; chars++) { // Inner loop
                System.out.print(character + " "); // what to print
                character++; // updating character
            }
            System.out.println(); // next line after each completion of inner loop
        }
    }
}