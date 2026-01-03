package Unknown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {


        //array
        String[] items = {"apples", "bananas", "milk", "eggs"};
        System.out.println(Arrays.toString(items));

        List<String> itemsAsList = List.of(items);
        System.out.println(itemsAsList);

        System.out.println(itemsAsList.getClass().getName());
        System.out.println(itemsAsList.getClass().getSimpleName());

        //java.util.ImmutableCollections$ListN
        // immutable
        // nested

        //check immutable

        // can't change

//        itemsAsList.add("apples");
//        System.out.println(itemsAsList);

        //create ArrayList using the List
        ArrayList<String> arrayList = new ArrayList<>(itemsAsList);
        arrayList.add("apples");
        System.out.println(arrayList);


        ArrayList<String> arrayList2 = new ArrayList<>(
                List.of("toyota", "nissan", "honda")
        );
        System.out.println(arrayList2);


        arrayList2.addAll(arrayList);
        // arrayList add to arrayList2
        // modified - arrayList2
        System.out.println(arrayList2);


        //get method (retrieve )
        System.out.println(arrayList2.get(2));
        System.out.println(arrayList2.get(arrayList2.size() - 1));

        // searching
        // .contains
        // return true if element is there
        System.out.println(arrayList2.contains("apples"));

        //all should be there
        System.out.println(arrayList2.containsAll(List.of("apples","kasun")));
        String x = "Kasun";
        System.out.println(x.contains("as")); // sequence catching

        // last index of
        // index of
        // actual position of the element ( index )
        // if not found return -1
        // duplicates->
        // can't assure the first one or second one ( but not here )
        // indexOf -> first occurence
        // lastIndexOf -> last occurence

        arrayList2.add("toyota");
        System.out.println(arrayList2);
        System.out.println(arrayList2.indexOf("toyota"));
        System.out.println(arrayList2.lastIndexOf("toyota"));



        // remove
        // from index --> remove only that index
        arrayList2.remove(7);
        System.out.println(arrayList2);
        // from element  --- > remove first occurance
        arrayList2.remove("toyota");
        System.out.println(arrayList2);

        // more than one
        arrayList2.removeAll(List.of("nissan","honda"));
        System.out.println(arrayList2 );


        //retainAll ( retain these, remove others )
        arrayList2.retainAll(List.of("apples","eggs"));
        System.out.println(arrayList2);

        // remove all the elements (make empty list)
        arrayList2.clear();
        System.out.println(arrayList2);
        System.out.println(arrayList2.isEmpty());


        // now empty the list
        // List.of -> returns immutable list
        arrayList2.addAll(List.of("gtn","wso2","octave","syscolabs"));

        // Arrays.asList -> returns List of specified array
        arrayList2.addAll(Arrays.asList("creative software","ifs","ncinga"));

        System.out.println(arrayList2);
        System.out.println("---".repeat(5));


        // list to array
        // without no arguments -> returns object[]
        var arrayListToArray = arrayList2.toArray();
        System.out.println(Arrays.toString(arrayListToArray));
        // with type argument with size
        // return an array of type String
        // if this array is big enough, reuse it, otherwise create new one of the correct size
        var arrayListToArrayTwo = arrayList2.toArray(new String[4]);
        System.out.println(Arrays.toString(arrayListToArrayTwo));

        //returns string array and size is 10 ( because this size > actual size )
        var arrayListToArrayThree= arrayList2.toArray(new String[10]);
        System.out.println(Arrays.toString(arrayListToArrayThree));
    }
}
