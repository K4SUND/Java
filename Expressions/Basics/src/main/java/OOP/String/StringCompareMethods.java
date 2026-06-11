package OOP.String;

public class StringCompareMethods {

    public static void main(String[] args) {


        String a = "hello world".toUpperCase();
        String b = "hello world".toLowerCase();
        System.out.println(a);
        System.out.println(b);


        // equals()
        System.out.println(a.equals(b));  //false
        // equalsIgnoreCase()
        System.out.println(a.equalsIgnoreCase(b));  //true

        //case sensitive
        System.out.println(a.startsWith("he"));
        System.out.println(a.endsWith("he"));
        System.out.println(a.endsWith("ld"));
        System.out.println(a.endsWith("world"));

        System.out.println(b.startsWith("he"));
        System.out.println(b.endsWith("he"));  //false
        System.out.println(b.endsWith("ld"));
        System.out.println(b.endsWith("world"));


        System.out.println(b.contains("wo")); //true
        System.out.println(b.contains("wr"));  //false
        System.out.println(b.contains("world")); //true



        // full content
        // like equals
        System.out.println(b.contentEquals("wo"));
        System.out.println(b.contentEquals("hello world"));

    }
}
