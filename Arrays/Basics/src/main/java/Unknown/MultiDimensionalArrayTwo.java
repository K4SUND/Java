package Unknown;

import java.util.Arrays;

public class MultiDimensionalArrayTwo {

    public static void main(String[] args) {

        Object[] anyArray = new Object[3];

        anyArray[0] = new String[]{"a","b","c"};
        anyArray[1] = new String[][]{
                {"1","2"},
                {"3","4","5"},
                {"6","7","8","9"}
        };
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        // get each separately and see
        for(Object object:anyArray){
            // print object
            System.out.println("Type:"+object.getClass().getSimpleName());
            System.out.println("ToString:"+object);

            // here cast
            System.out.println(Arrays.deepToString((Object[])object));
        }

        anyArray[2] = "Hello";
        System.out.println(Arrays.deepToString(anyArray));

        for(Object object:anyArray){
            // print object
            System.out.println("Type:"+object.getClass().getSimpleName());
            System.out.println("ToString:"+object);

            // here cast
            //
            System.out.println(Arrays.deepToString((Object[])object));
        }
    }
}
