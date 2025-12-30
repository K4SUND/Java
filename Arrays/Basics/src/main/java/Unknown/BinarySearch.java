package Unknown;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        String[] sArray = {"kasun", "thimal", "kaveen"};
        String[] sArrayDup = {"kasun", "thimal", "kaveen", "kasun"};
        // sort by alphabetically
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
//        Arrays.binarySearch()
        // return 0 or positive if match found ( position - but not sure the first one if it has duplicates )
        if (Arrays.binarySearch(sArray, "kasun") >= 0) {
            System.out.println("kasun is found");
        }
        System.out.println((Arrays.binarySearch(sArray, "kasun")));
        System.out.println((Arrays.binarySearch(sArrayDup, "kasun")));

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        // order changed
        int[] s3 = {1, 2, 3, 5, 4};
        // add elements
        int[] s4 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are the same");
        } else {
            System.out.println("Arrays are not the same");
        }

        if (Arrays.equals(s1, s3)) {
            System.out.println("Arrays are the same");
        } else {
            System.out.println("Arrays are not the same");
        }

        if (Arrays.equals(s1, s4)) {
            System.out.println("Arrays are the same");
        } else {
            System.out.println("Arrays are not the same");
        }
    }
}
