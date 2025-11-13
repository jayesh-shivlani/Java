package Loops;

// Program to show continue statement

public class ContinueStatement {

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // When condition becomes true it skip that iteration
            }
            System.out.println(i);
        }
    }
}
