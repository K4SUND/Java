package Unknown;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {
        int[] intArray = new int[5];
        int[] intArrayReferenceOne = intArray;

        //print these addresses
        System.out.println(intArray);
        System.out.println(intArrayReferenceOne);
        //print arrays
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayReferenceOne));


        // change to first one
        intArray[1] = 4;
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(intArrayReferenceOne));

        // here it changed the second one also
        // arrays are objects --  therefore it change all


        // without new keyword - same thing happen
        // remember :
        // arrays are objects ( don't think much about new keyword )

        int[] intArrayTwo = {1,2,3,4};
        int[] intArrayReferenceTwo = intArrayTwo;

        intArrayTwo[2] = 6;
        System.out.println(Arrays.toString(intArrayTwo));
        System.out.println(Arrays.toString(intArrayReferenceTwo));

        // create method to pass the array and modify it and see what happens
        modifyArray(intArrayTwo);

        System.out.println(Arrays.toString(intArrayTwo));
        System.out.println(Arrays.toString(intArrayReferenceTwo));

        //myAns = 1,2,6,6 for both
        //actual =  1,2,6,6

        // so here we passed the object. (like reference )
        // actual - address is passing


    }

    private static void modifyArray(int[] array) {
        array[3] = 6;
    }

}
