// Program to show break statement 
package JavaBasics.Loops;

public class BreakStatement {

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break; // break the loop when condition becomes true
            }
            System.out.println(i);
        }
        System.out.println("I'm out of Loop");
    }
}
