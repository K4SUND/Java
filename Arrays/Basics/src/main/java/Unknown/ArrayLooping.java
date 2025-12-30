package Unknown;

import java.util.Arrays;

public class ArrayLooping {

    public static void main(String[] args) {

        int[] intArray = new int[5];
        int[] intArray2 = new int[]{1, 2, 3, 4};
        int[] intArray3 = {1, 2, 3, 4};
        int[] intArray4;
        int[] intArray5;
        intArray4 = new int[]{1, 2, 3};
        intArray5 = new int[4];

        // assign values
        // 4,3,2,1

        for (int i = 0; i < intArray5.length; i++) {
            intArray5[i] = intArray5.length - i;

        }

        for (int i = 0; i < intArray5.length; i++) {
            System.out.print(intArray5[i] + " ");

        }


        //using for each
        System.out.println();
        for (int element : intArray5) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(intArray5);

        // java.util.Arrays class
        System.out.println(Arrays.toString(intArray5));

        //Object class assign ( array is inherited from object ( because array is also a class ) )

        Object myObject = intArray5;
        if (myObject instanceof int[]) {
            System.out.println("int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = intArray5;
        objectArray[1] = "Hello";
        objectArray[2] = 5;

        // can have several types
        System.out.println(Arrays.toString(objectArray));


    }

}
