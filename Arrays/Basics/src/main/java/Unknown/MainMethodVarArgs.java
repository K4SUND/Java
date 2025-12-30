package Unknown;

public class MainMethodVarArgs {


    /*
    // here it is passing string array
    // normal : entry point  --- can pass data on the command line

    public static void main(String[] args) {

    }


     */

    // second signature
    public static void main(String... args) {

        System.out.println("Hello");
        System.out.println();
        // split method
        String[] stringArray = "Hello World".split(" ");
        printStringArray(stringArray);

        System.out.println("_".repeat(20));

        // pass single string
        printStringArray("Kasun");
        System.out.println("_".repeat(20));

        // pass several strings
        printStringArray("K","A","S","U","N");

        // not argument
        printStringArray();


        /// variable arguments (varargs) ...

        String[] sArray = {"first","second","third","fourth","fifth"};
        // in here (join method ) it uses ...
        // so we can pass zero, one ,... array
        // ex: last argument
        System.out.println(String.join("__", sArray));


    }

    // string...
    // ... = three periods


    /*
    private static void printStringArray(String [] stringArray){
        for(String s : stringArray){
            System.out.println(s);
        }
    }

     */

    // difference  - I can pass one string as well ( without considering an array )
    private static void printStringArray(String... stringArray) {
        for (String s : stringArray) {
            System.out.println(s);
        }
    }
}
