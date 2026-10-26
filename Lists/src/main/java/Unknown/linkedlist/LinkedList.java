package Unknown.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {


    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(10);
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        System.out.println(intList);
        //index 2th element
        System.out.println(intList.get(2));

        //remove index 2th element
        System.out.println(intList.remove(2));
        //print
        System.out.println(intList);
        //now index 2th element
        System.out.println(intList.get(2));

    }
}
