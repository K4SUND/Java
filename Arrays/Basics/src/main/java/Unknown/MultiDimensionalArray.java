package Unknown;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //

        // intArrayOne is outer array that consist inner array
        int[][] intArrayOne = new int[4][3];
        // 1. what is the length --- 4
        System.out.println(intArrayOne.length);

        // print and understand
        System.out.println(Arrays.toString(intArrayOne));
        System.out.println("-".repeat(20));

        // going to inside ( inner array )
        for(int[] intArray:intArrayOne){
            System.out.println(intArray+":"+Arrays.toString(intArray));
        }

        // accessing elements
        for(int i=0;i<intArrayOne.length;i++){
            // travel in outer
            var innerArray = intArrayOne[i];  // here innerArray is int[]
            for(int j=0;j<innerArray.length;j++){
                // travel in inner
                System.out.print(intArrayOne[i][j]);
//                System.out.print(innerArray[j]);

            }
            System.out.println();
        }

        intArrayOne[2][1] = 4;


        for(var outer:intArrayOne){
            for(var inner:outer){
                System.out.print(inner+" ");
            }
            System.out.println();
        }

        // method ( inbuild )
//        converting multidimensional arrays to strings.
        System.out.println(Arrays.deepToString(intArrayOne));

        int[][] intArrayNew = {{1,2,3},{1,2},{2}};
        System.out.println(Arrays.deepToString(intArrayNew));
//        intArrayNew[1] = {1,2,3,4};  can't do this
        intArrayNew[1] = new int[]{1,2,3,4};
        System.out.println(Arrays.deepToString(intArrayNew));





    }


}
