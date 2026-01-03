package Unknown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of("gtn", "wso2", "octave", "syscolabs"));
        ArrayList<Integer> arrayListTwo = new ArrayList<>(List.of(1, 2, 3, 4, 5));


        System.out.println(arrayList.getClass().getSimpleName());
        System.out.println(arrayList);

        // sort
        // parameter - comparator(interface)
        // it has factory methods -> naturalOrder, ...
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList); // alphatabilitically
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);

        System.out.println(arrayListTwo);
        arrayListTwo.sort(Comparator.naturalOrder());
        System.out.println(arrayListTwo);
        arrayListTwo.sort(Comparator.reverseOrder());
        System.out.println(arrayListTwo);


        String[] stringArray = {"Hello", "World", "Hello", "How", "Are", "You"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        // binary search -> should be sort first
        System.out.println(Arrays.binarySearch(stringArray, "Hello"));


    }
}
