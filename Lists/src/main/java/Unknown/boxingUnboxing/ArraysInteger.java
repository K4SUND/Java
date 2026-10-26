package Unknown.boxingUnboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysInteger {

    public static void main(String[] args) {

        // manual
        Integer [] intOArray = new Integer[5];

        //auto boxing
        intOArray[0] = 40;
        System.out.println(intOArray[0]);
        System.out.println(Arrays.toString(intOArray));
        System.out.println(intOArray[0].getClass().getName());

        //auto
        Character[] charArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(charArray));

        var arrayList = integerArrayList(1,2,3,4,5);

        // List.of return immutable list -- thats why we use arrayList
        var list = List.of(1,2,3);
//        System.out.println(list.add(4));
        System.out.println(arrayList.getClass().getSimpleName());
        System.out.println(arrayList);


    }

    // return Integer from int
    private static Integer returnInteger(int i)
    {
        return i;
    }


    // return int from Integer
    private static int returnInt(Integer i)
    {
        return i;
    }




    private static ArrayList<Integer> integerArrayList(int... arguments)
    {
        // int[] arguments
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int arg:arguments)
        {

            // autoboxing
            arrayList.add(arg);
        }

        return arrayList;

    }
}
