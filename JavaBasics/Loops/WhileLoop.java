package JavaBasics.Loops;
// Program: While Loop Demo

// Purpose: Print "Hello World" 100 times using a while loop

public class WhileLoop {
    public static void main(String args[]) {

        // Initialize counter to 0
        int counter = 0;

        // Loop continues while counter is less than 100
        while (counter < 100) {
            System.out.println("Hello World");
            counter++; // Increase counter by 1
        }

        // Loop ends when counter reaches 100
    }
}
