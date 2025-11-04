// Program to show working of functions
/* Syntax -- returnType name() {
 * // body
 * return statement;
 * } */

public class Functions {
    // public static is access modifier
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return; // not necessary only when return type is void
    }
    // on execution main function is executed 1st
    public static void main(String args[]) {
        printHelloWorld(); // function call
    }
}