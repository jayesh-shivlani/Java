package JavaBasics.Operators;

// Program to demonstrate Logical Operators in Java
// Logical operators are used to combine multiple boolean expressions

public class LogicalOperators {

    public static void main(String agrs[]) {

        // Logical AND (&&): Returns true only if BOTH conditions are true
        // (3 > 2) is true AND (5 > 0) is true, so result is true
        System.out.println("Logical AND : " + ((3 > 2) && (5 > 0)));

        // Logical OR (||): Returns true if AT LEAST ONE condition is true
        // (3 < 2) is false BUT (5 > 0) is true, so result is true
        System.out.println("Logical OR : " + ((3 < 2) || (5 > 0)));

        // Logical NOT (!): Reverses the boolean value
        // (3 < 2) is false, so !(3 < 2) becomes true
        System.out.println("Logical NOT : " + (!(3 < 2)));
    }
}
