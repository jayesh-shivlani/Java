package Strings;

// Program to find the Shortest Path value of the given Path
// Assuming a unit distance travelled for each direction

import java.util.*;

public class ShortestPath {

    // function to find the shortest path
    public static float getShortestPath(String path) { // formal parameter is a String

        // initialize x & y with 0, Assuming them as coordinates (0,0)
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {

            // finding each direction
            char dir = path.charAt(i);

            // South
            if (dir == 'S') {
                y--;
            }
            // North
            else if (dir == 'N') {
                y++;
            }
            // West
            else if (dir == 'W') {
                x--;
            }
            // East
            else {
                x++;
            }
        }

        int x2 = x * x; // finding x square
        int y2 = y * y; // finding y square

        return (float) Math.sqrt(x2 + y2); // returning the square root of sum of the x & y squares which is the
                                           // displacemet (Shortest Path)
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Create a scanner object

        System.out.println(" N - North\n S - South\n W - West\n E - East ");

        System.out.print("Enter the path : "); // take the path from user
        String path = sc.nextLine(); // store the path

        // Print the shortest path
        System.out.println("Shortest Path : " + getShortestPath(path)); // function call with argument String

        sc.close(); // close the scanner object
    }
}
