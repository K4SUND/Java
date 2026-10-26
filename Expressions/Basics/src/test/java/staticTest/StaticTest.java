package staticTest;

public class StaticTest {

    public static int number = 100;
    private int number2;

    public StaticTest() {
        number2 = 50;

    }

    public static void printNumber()
    {
        System.out.println(number);
//        System.out.println(number2); // non-static can't be assessed

//        printNumber2(); // non-static can't be assessed
    }

    public void printNumber2()
    {
        System.out.println(number);   // static can be assessed
        System.out.println(number2);
        printNumber();  //  static can be assessed
    }

    public static void main(String[] args) {
        printNumber();
        StaticTest staticTest = new StaticTest();
        staticTest.printNumber2();
        StaticTest.printNumber();

    }
}
