//Type Promotion in Java

public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        int sum = b - a; // Here b & a are promoted to integer.
        System.out.println((int)b);
        System.out.println((int)a);
        System.out.println(sum);

        short c = 23;
        byte d = 10;
        int s = 12;
        int z = c + d + s; // Here byte & short are promoted to integer.
        System.out.println(z);

        int i = 10;
        float f = 20.25f;
        long l = 30;
        double dd = 40;
        double add = i + f + l + dd; // Here int, float, long are promoted to double because double is having the largest value.
        System.out.println(add);

        byte bb = 5;
        // bb = bb*2; --> Here byte is promoted to int that's why it'll show an error of type mismatched.
        bb = (byte)(bb*2); // We need to type cast int to byte.
        System.out.println(bb);
    }
}
