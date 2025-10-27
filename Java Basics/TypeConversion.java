//Type Conversion in Java

public class TypeConversion {
    public static void main(String args[]) {
        
        int a = 35;
        float b = a; // type conversion can be done here as float > int in terms of size.
        System.out.println(b);

        // float c = 35.65f;
        // int d = c; ---> It will give type mismatch error because here data will be lost.
        // System.out.println(d);

        // int i = 34;
        // boolean b = i; ---> It will give type mismatch error because of type is not compatible.
        // System.out.println(b);
    }
}