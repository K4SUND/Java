package Unknown;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayCreations {



    public static void main(String[] args) {

        // similar creating instance in classes ( new keyword )
        int[] integerArray = new int[10];
        //
        // can't assign other data types ( as same in the simple data )
        // compile errors

//        integerArray[0] = 2.45;
//        integerArray[1] = "Hello";

        double[] doubleArray = new double[10];
        doubleArray[2] = 3.45;
        System.out.println(doubleArray[2]);

        // Array initializer
        int[] intArray = new int[]{1, 2, 4, 5, 6};
        System.out.println(intArray[2]);
        // simple way - anonymous array
        int[] intArray2 = {1, 2, 3, 4, 5, 6};
        System.out.println(intArray2[2]);


        //can only used in declaration statement
        /*
        int[] intArray;
        intArray = {1,2,4,5};

        here we have to use this
        int[] intArray;
        intArray = new [] {1,2,4,5} ;

         */

    }
}