package Unknown.linkedlist.challengeOne;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        LinkedList<Town> townList = new LinkedList<>();
        // addTowns
//        addTowns(townList);

        Town adelaide = new Town("Adelaide",1374);
        Town aliceSpring = new Town("Alice Spring",2771);
        Town brisbane = new Town("Brisbane",917);
        Town darwin = new Town("Darwin",3972);
        Town melbourne = new Town("Melbourne",877);
        Town perth = new Town("Perth",3923);

//        list.add(melbourne);
//        list.add(brisbane);
//        list.add(adelaide);
//        list.add(aliceSpring);
//        list.add(perth);
//        list.add(darwin);

        addTown(townList,adelaide);
        addTown(townList,adelaide);
        addTown(townList,darwin);
        addTown(townList,brisbane);
        addTown(townList,melbourne);

        System.out.println(townList);



        System.out.println("Available actions:");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist Places");
        System.out.println("(M)enu");
        System.out.println("(Q)uit");



        while(true)
        {

            Scanner action = new Scanner(System.in);
            String actionString = action.nextLine().toUpperCase().substring(0,1);

            switch (actionString)
            {
                case "F":
                    forward(townList);
                    break;
                case "B":
                    backward(townList);
                    break;
                case "L":
                    listPlaces(townList);
                    break;
                case "M":
                    System.out.println("M");
                    break;
                case "Q":
                    System.out.println("Quit");
                    return;
                default:
                    System.out.println("Invalid");


            }

        }


    }

    public static void addTowns(LinkedList<Town> list)
    {
        Town adelaide = new Town("Adelaide",1374);
        Town aliceSpring = new Town("Alice Spring",2771);
        Town brisbane = new Town("Brisbane",917);
        Town darwin = new Town("Darwin",3972);
        Town melbourne = new Town("Melbourne",877);
        Town perth = new Town("Perth",3923);

//        list.add(melbourne);
//        list.add(brisbane);
//        list.add(adelaide);
//        list.add(aliceSpring);
//        list.add(perth);
//        list.add(darwin);

        addTown(list,adelaide);
        addTown(list,adelaide);
        addTown(list,darwin);
        addTown(list,brisbane);
        addTown(list,melbourne);



    }

    public static void addTown(LinkedList<Town> townList,Town town)
    {


        if(townList.isEmpty())
        {
            townList.add(town);
            return;
        }

        //duplicate
        //check object ( name, distance )

        if(townList.contains(town))
        {
            System.out.println("DuplicateFound");
            return;
        }

        int index = 0;
        // start with lowest
        for(Town current : townList)
        {

            if(current.getName().equalsIgnoreCase(town.getName()))
            {
                System.out.println("DuplicateFound");
                return;
            }


            if(current.getDistanceFromSydney()>town.getDistanceFromSydney())
            {

                townList.add(index,town);
                return;
            }

            index++;
            townList.add(town);
            return;
        }
    }

    public static void forward(LinkedList<Town> list)
    {
            var listIterator = list.listIterator();
            while(listIterator.hasNext())
            {
                Town currentTown = listIterator.next();
                System.out.println("Town:"+currentTown.getName()+" DistanceFromSydney:"+currentTown.getDistanceFromSydney());
            }

    }

    public static void backward(LinkedList<Town> list)
    {
        var listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious())
        {
            Town currentTown = listIterator.previous();
            System.out.println("Town:"+currentTown.getName()+" DistanceFromSydney:"+currentTown.getDistanceFromSydney());
        }

    }

    public static void listPlaces(LinkedList<Town> list)
    {
        System.out.println(list);
    }
}
