package static_vs_instance;

public class Example {

    public static int add(int a, int b)
    {
        a = 4;
        a = 5;

        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(add(2,3));
    }

}
