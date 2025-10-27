//A guessing game where user has to guess the right number between 1 to 100

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int random = (int) (Math.random() * 100);

            int n;
            do {
                System.out.println("Guess the no. between 1 to 100");
                n = sc.nextInt();

                if (n == random) {
                    System.out.println("Congratulations!!! you guessed the correct no.");
                    break;
                }

                else if (n > random) {
                    System.out.println("The guess is larger than the answer");
                }

                else if (n < random && n > 0) {
                    System.out.println("The guess is smaller than the answer");

                }

                else if (n < 0) {
                    System.out.println("THE END");
                    System.out.println("The correct no. was " + random);
                    break;
                }
            } while (n > 0);
        }

    }
}