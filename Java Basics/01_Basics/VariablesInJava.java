// Program to demonstrate Variables in Java
// Variables are containers that store data values

public class VariablesInJava {
    public static void main(String[] args) {
        // Declare and initialize integer variables
        int a = 10;
        int b = 5;
        
        // Declare and initialize String variable
        String name = "Tony Stark";
        
        // Display initial values
        System.out.println(a);    // Output: 10
        System.out.println(b);    // Output: 5
        System.out.println(name); // Output: Tony Stark
        
        // Variables are mutable - their values can be changed
        a = 50;
        System.out.println(a);    // Output: 50
    }
}

// Important Terms:
// 1. Literals: Constant values assigned to variables (e.g., 10, 5, "Tony Stark")
// 2. Variables: Named storage that can hold values which can be changed
// 3. Identifiers: Names given to variables, classes, methods, etc.