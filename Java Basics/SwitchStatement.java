//Program to show switch statement

import java.util.*;

public class SwitchStatement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter button no. : ");
        int button = sc.nextInt();

        switch(button) {

            case 1 : System.out.println("Samosa");
                        break;
            case 2 : System.out.println("Burger");
                        break;
            case 3 : System.out.println("Cold drink");
                        break;
            default : System.out.println("We wake up");

        }

        sc.close();
    }
}
