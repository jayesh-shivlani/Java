package Patterns;

// Program to print star pattern using nested loop

public class StarPattern {

    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) { // No. of lines required --> Outer loop
            for (int star = 1; star <= line; star++) { // No. of times (i) pattern repeats on nth line --> Inner loop
                System.out.print("* "); // What to print
            }
            System.out.println(); // Next line after each completion of one inner loop
        }
    }
}
