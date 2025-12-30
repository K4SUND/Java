package Unknown;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemOne {

    public static void main(String[] args) {
        int[] intArray = getIntegers(4);
        int[] sortedArray = sortIntegers(intArray);
        printArray(sortedArray);
    }
    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {

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
