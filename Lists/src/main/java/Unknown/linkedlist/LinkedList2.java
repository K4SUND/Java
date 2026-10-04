package Unknown.linkedlist;

import javax.crypto.spec.PSource;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

    public static void main(String[] args) {


        /*
//        LinkedList<String> visits = new LinkedList<>();
        var visits = new LinkedList<String>();
        visits.add("Kandy");
        visits.add("Gampaha");

        // not override, add everything
        visits.add(0,"Veyangoda");
        visits.add(0,"Veyangoda2");
        System.out.println(visits);

        //update the linked list
        addFirstAndLast(visits);
        System.out.println(visits);
        System.out.println("--------------");

        //[Stack add, OKF, Kasun, Veyangoda2, Veyangoda, Kandy, Gampaha, KD, QK, OKL]
        removeElements(visits);
        System.out.println(visits);

         */

//        printTest();

//        retrieve();

//        iteratorLearn();

        listIteratorLearn();
    }


    //add elements
    public static void addFirstAndLast(LinkedList<String> linkedList) {
        linkedList.addFirst("Kasun");
        linkedList.addLast("KD");

        //queue
        linkedList.offer("QK");
        linkedList.offerFirst("OKF");
        linkedList.offerLast("OKL");

        //stack
        linkedList.push("Stack add");
    }

    //remove elements
    public static void removeElements(LinkedList<String> linkedList) {
//        [Stack add, OKF, Kasun, Veyangoda2, Veyangoda, Kandy, Gampaha, KD, QK, OKL]
        var r1 = linkedList.remove(); // remove first and return it
        System.out.println(r1);

        var r2 = linkedList.removeFirst();
        System.out.println(r2);

        var r3 = linkedList.removeLast();
        System.out.println(r3);

        //queue
        var r4 = linkedList.poll();
        System.out.println(r4);

        //stack
        var r5 = linkedList.pop();
        System.out.println(r5);
    }

    public static void printTest() {
        LinkedList<String> testList = new LinkedList<>();
        testList.add("Hello");
        testList.add("World");

        System.out.println(testList);
    }

    public static void retrieve() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Messi");
        list.add("Ronaldo");
        list.add("Ozil");
        list.add("Neymar");
        list.add("Ronaldo");
        System.out.println(list);
        System.out.println(list.indexOf("Ronaldo"));  // first appearance
        System.out.println(list.lastIndexOf("Ronaldo"));  // first appearance

        // queue
        System.out.println(list.element()); // first IFO

        //stack
        // top points to front
        System.out.println(list.peek());  // first
        System.out.println(list.peekFirst());  // first
        System.out.println(list.peekLast());  // last
        System.out.println("Index 0:" + list.get(0));

        System.out.println("Start:" + list.getFirst());

        /*
        // for
        for(int i=1;i<list.size();i++)
        {
            System.out.println(list.get(i-1)+"-->"+list.get(i));
        }

         */

        /*


//for each
        //
        String previousPlayer = list.getFirst();

        for(String player:list)
        {
            System.out.println(previousPlayer+"-->"+player);
            previousPlayer = player;
        }

         */

        // listIterator

        String previousPlayer = list.getFirst();
//        ListIterator<String> listIterator = list.listIterator();
        ListIterator<String> listIterator = list.listIterator(1);

        while (listIterator.hasNext())
        {

            // .next() ---- advances the cursor position
            String currentPlayer = listIterator.next();
            System.out.println(previousPlayer+"-->"+currentPlayer);
            previousPlayer = currentPlayer;
        }


        System.out.println("End:" + list.getLast());
    }


    public static void iteratorLearn()
    {

        LinkedList<String> list = new LinkedList<>();
        list.add("KDH");
        list.add("HILUX");
        list.add("MONTERO");
        list.add("PREMIO");
        // iterator instance
        var iterator = list.iterator();
        while (iterator.hasNext())
        {
            if(iterator.next().equals("HILUX"))
            {
                iterator.remove();
//                list.remove();    // crash ---- while iterating list can't be modified without using iterator instance
            }

        }
        System.out.println(list);
    }


    public static void listIteratorLearn()
    {

        LinkedList<String> list = new LinkedList<>();
        list.add("KDH");
        list.add("HILUX");
        list.add("MONTERO");
        list.add("PREMIO");
        // iterator instance
        var iterator = list.listIterator();
        while (iterator.hasNext())
        {
            if(iterator.next().equals("HILUX"))
            {
//                iterator.remove();

                //add
                iterator.add("REVO");
            }

        }
        System.out.println(list);

        // backwards
        while (iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }


        System.out.println("-----------");
        System.out.println(list); // [KDH, HILUX, REVO, MONTERO, PREMIO]
        var iterator2 = list.listIterator(2); // in the middle between 1 and 2 [KDH, HILUX, **** , REVO, MONTERO, PREMIO]
        System.out.println(iterator2.next());
        System.out.println(iterator2.previous());
    }

}


// in linked list
// stack op -- top is in front  ( push,pop )
// add, offer -- add to last
// remove, poll  -- remove from first ( same as pop )