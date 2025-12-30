package Unknown;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static int[] readIntegers(){
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] intArray = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            intArray[i] = Integer.parseInt(inputArray[i].trim());
        }

        return intArray;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] inputArray = readIntegers();
        System.out.println(Arrays.toString(inputArray));
        int minimum = findMin(inputArray);
        System.out.println("minimum element is "+minimum);
    }
}


/*


1. nextInt():

Reads only the number
Stops reading at whitespace

2. nextLine() behavior (very important)

Reads everything until Enter
Does NOT stop at spaces
Spaces are treated as normal characters



 */