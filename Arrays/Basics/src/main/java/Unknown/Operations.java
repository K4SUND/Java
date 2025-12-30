package Unknown;

import java.util.Arrays;
import java.util.Random;

public class Operations {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(4);
        System.out.println(Arrays.toString(firstArray));

        // sort
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        // fill ( fill with same element)
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 10);
        System.out.println(Arrays.toString(secondArray));

        // copy (avoid impaction to main array )
        int[] thirdArray = getRandomArray(5);
        System.out.println(Arrays.toString(thirdArray));
        // here it returns int[]
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        System.out.println();
        Arrays.sort(fourthArray);   // here it changed the fourth array only
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(fourthArray,3);
        System.out.println(Arrays.toString(smallArray));
        int[] largeArray = Arrays.copyOf(fourthArray,fourthArray.length+3); // fill with zeroes
        System.out.println(Arrays.toString(largeArray));

    }

    // get array with random numbers
    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
