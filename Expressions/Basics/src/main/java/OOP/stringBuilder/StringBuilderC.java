package OOP.stringBuilder;

public class StringBuilderC {


    public static void main(String[] args) {

        String helloWorld = "Hello";
        StringBuilder helloWorldBuilder = new StringBuilder("Hello");


        // capacity
        // this is automatically growing
        StringBuilder s1 =new StringBuilder("a".repeat(17));
        StringBuilder s2 =new StringBuilder(26);


        //string immutable and string builder mutable
        helloWorld.concat("World");
        helloWorldBuilder.append("World");


        // methods
        StringBuilder s3 = new StringBuilder("Kasun");
        s3.deleteCharAt(4).insert(4,"N");

        s3.replace(4,5,"n");

        s3.reverse().setLength(3);


        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
        printInformation(s1);
        printInformation(s2);
        printInformation(s3);
    }

    public static void printInformation(String string)
    {
        System.out.println("String = "+string);
        System.out.println("Length = "+string.length());
    }

    public static void printInformation(StringBuilder stringBuilder)
    {
        System.out.println("String = "+stringBuilder);
        System.out.println("Length = "+stringBuilder.length());
        System.out.println("Capacity = "+stringBuilder.capacity());
    }


}
