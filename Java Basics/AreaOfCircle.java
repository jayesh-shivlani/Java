//Program to calculate Area of Circle

import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = (3.14f * radius * radius); // add f to specify float type of data || by default java consider it as double
        System.out.println(area);
        sc.close();
    }
}
