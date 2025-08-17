package Unknown;

import java.util.*;

public class TestList {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(5);
        for (int i=0;i<10;i++){
            stringList.add("/"+i+"/");

        }

        System.out.println(stringList);
        Collections.shuffle(stringList);

        List<String> subListOne = stringList.subList(0,4);
        System.out.println(subListOne);
        subListOne.sort(Comparator.naturalOrder());
        System.out.println(subListOne);

        // initial index to end
        String subString = stringList.get(0).substring(1);
        System.out.println(subString);

        subListOne.add(0,"Fuck");
        System.out.println(stringList);
        //when main list and make sublist from it. then we change sublist it also changed in main.




    }
}
