//Type Casting in Java

public class TypeCasting {
    public static void main(String args[]) {
        float a = 25.999f;
        int b = (int) a; // Here data is loss when we convert 25.999 into integer, it only gives 25 as output.
        System.out.println(b);

        char ch = 'a';
        int c = ch; // conversion from char to int is possible.
        System.out.println(c);
    }
}
