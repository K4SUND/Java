package Unknown;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;
        for (char c : "BINGO".toCharArray()) {

            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
//                System.out.println(""+c+i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);
       /*
        for (int i=0;i<15;i++)
        {
            System.out.println(bingoPool.get(i));
        }

        */

        //from 0 to 15
        //0,1,2,...14
        // here it created a new array list
        // therefore changes to firstFifteen is not affecting to the main bingoPool
        List<String> firstFifteen = new ArrayList<>(bingoPool.subList(0, 15));
        //order
        firstFifteen.sort(Comparator.naturalOrder());


        //lambda function
        //.replaceAll() -> iterate through every element in the list
        // calls the lambda function with that element
        // replaces the element with value the lambda returns

        firstFifteen.replaceAll(s -> {
            if (s.indexOf('G') == 0 || s.indexOf('O') == 0) {
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }

            return s;
        });

        System.out.println(" ");
        System.out.println("-----------");
//        System.out.println(firstFifteen);


        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));
        }
        System.out.println("-----------");


        for (int i = 0; i < 15; i++) {
            System.out.println(firstFifteen.get(i));
        }


        //create a stream any collection type
        //avoid effect to original
        //here it using stream without using new array list
        //List<String> bingoPool = new ArrayList<>(75);

        /*
        create a stream<String> from the list. stream is like flow of elements that you can process step-by-step without
        storing intermediate lists.
        .filter : keeps only elements. (where first char is G and O)
        .map    : transform each string in to new format

        ***pipeline
         */
        //terminal op is needed for other intermediate one executing
        //this is not chaining. we can store and use (terminal operation can be done after)

        System.out.println("++++++++++++++++++");
        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.println(s + " "));

        //check if there is any affect
        System.out.println("++++++++++++++++++");
        for (int i = 0; i < 15; i++) {
            System.out.println(bingoPool.get(i));
        }
        System.out.println("-----------");

        System.out.println("-------------------");

        var tempStream = bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted();

        tempStream.forEach(s -> System.out.println(s + " "));

//        tempStream.forEach(s -> System.out.println(s.toLowerCase() + " "));   can't -> stream has already been operated upon or closed




    }
}

