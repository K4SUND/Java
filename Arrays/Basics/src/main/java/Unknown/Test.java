package Unknown;

public class Test {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        a = 6;

        System.out.println(a);     // 6
        System.out.println(b);     // 5

        // non primitive - but not object -- it just the value
        String ab = "Hello";
        String ba = ab;
        ab = "Hell";
        System.out.println(ab);
        System.out.println(ba);


    }
}
