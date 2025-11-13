package JavaBasics;

// Program to demonstrate different ways to print output in Java
// Shows the difference between print() and println()

public class OutputInJava {

    public static void main(String[] args) {

        // print(): Displays text without adding a newline at the end
        // Next output will continue on the same line
        System.out.print("Hello World!");

        // \n: Escape sequence for newline character
        // Manually adds line breaks before and after text
        System.out.print("\nHello World!\n");

        // println(): Displays text and automatically adds a newline at the end
        // Next output will start on a new line
        System.out.println("Hello World!");
    }
}

// Note: Both println() and \n create a new line
// Semicolon (;) is the statement terminator in Java
// 'S' in String and System must be capitalized (Java is case-sensitive)
