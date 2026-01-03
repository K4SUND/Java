package Unknown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysAndArrayListConversions {


    public static void main(String[] args) {
        String[] originalArray = new String[]{"first", "second", "third"};
        var originalList = Arrays.asList(originalArray);
        // change to this List --> also change to array --> so resizable?
//        originalList.add("fourth"); --> can't do this
        originalList.set(0, "FOURTH");
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);


        // array changes ---> back to list --> yes
        originalArray[1] = "SECOND";
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);


        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));
        System.out.println(originalList);


        /*
        not compile time errors
        runtime errors are there


                // change to this List --> also change to array --> so resizable?
//        originalList.add("fourth"); --> can't do this


        // also can't remove
        originalList.remove(0);
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray));


         */


        //
        String[] newArray = new String[]{"one", "two", "three"};
        ArrayList<String > newList = new ArrayList<>(List.of(newArray));
        System.out.println(Arrays.toString(newArray));
        System.out.println(newList);
        //change to array --> doesn't change the list

        Arrays.sort(newArray);
        System.out.println("Sorted Array:"+Arrays.toString(newArray));
        System.out.println("List :"+newList);

        ArrayList<String> newArrayList = new ArrayList<>(List.of("one", "two", "three"));
        //create array
        String[]  newArrayFromTheArrayList = newArrayList.toArray(new String[5]);
        System.out.println(Arrays.toString(newArrayFromTheArrayList));

        // do change to newArrayList and see  --> doesn't mirrored
        newArrayList.remove(2);
        System.out.println("After removing:(List):"+newArrayList);
        System.out.println("After removing:(Array):"+Arrays.toString(newArrayFromTheArrayList));
        String[]  newArrayFromTheArrayListTwo = newArrayList.toArray(new String[2]);
        System.out.println(Arrays.toString(newArrayFromTheArrayListTwo));
    }
}
