package Unknown;

import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

//        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArray = {5,3,4,5,6};
        System.out.println(Arrays.toString(intArray));
        int[] reversedArray = reverseArray(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(reversedArray));

    }


    /*
    private static void reverseArray(int[] intArray) {
        if (intArray.length == 0) {

            return;
        } else if (intArray.length % 2 == 0) {

            // even
            for (int i = 0; i < intArray.length / 2; i++) {
                int temp = intArray[i];
                intArray[i] = intArray[intArray.length - i - 1];
                intArray[intArray.length - i - 1] = temp;
            }

        } else {


            for (int i = 0; i < (intArray.length / 2); i++) {
                int temp = intArray[i];
                intArray[i] = intArray[intArray.length - i - 1];
                intArray[intArray.length - i - 1] = temp;
            }

        }

    }

     */


    // mutating data ( change the input array like reference )
    // therefore get a copy

    private static int[] reverseArray(int[] intArray) {
        int[] copy = Arrays.copyOf(intArray, intArray.length);
        if (copy.length == 0) {

            return copy;
        } else {


            for (int i = 0; i < (copy.length / 2); i++) {
                int temp = copy[i];
                copy[i] = copy[copy.length - i - 1];
                copy[copy.length - i - 1] = temp;
            }

            return copy;

        }

    }



}
