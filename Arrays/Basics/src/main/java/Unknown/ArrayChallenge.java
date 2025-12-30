package Unknown;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        //create array using random integers
        int[] intArray = getArray(5);
        //print
        System.out.println(Arrays.toString(intArray));

        /*
        //sort
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

         */

        // create sort method

        int[] sortedArray = getSortedArray(intArray);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] getArray(int length) {

        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            //exclusive upper bound
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static int[] getSortedArray(int[] array) {
        // create copy
        int[] sortedArray = Arrays.copyOf(array, array.length);
        // bubble sort
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = sortedArray.length - 1; j > i; j--) {
                if (sortedArray[j] > sortedArray[j - 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j - 1];
                    sortedArray[j - 1] = temp;
                }

            }
        }

        return sortedArray;


    }
}
