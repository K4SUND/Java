package OOP.interfaceLearn.extendsInterface;

import OOP.interfaceLearn.Bird;
import OOP.interfaceLearn.FlightEnabled;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Bird bird = new Bird();

        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);


        // List is interface
        // this declaration is good

        List<FlightEnabled> fliersTwo = new ArrayList<>();
        fliersTwo.add(bird);


        trigger(fliers);
//        trigger(fliersTwo);    // can't pass list to arraylist argument
        // use linked list

        triggerGood(fliers);
        triggerGood(fliersTwo);

        // also can linked list
        LinkedList<FlightEnabled> fliersThree = new LinkedList<>();
        List<FlightEnabled> fliersFour = new LinkedList<>();
        fliersThree.add(bird);

        triggerGood(fliersThree);

    }

    public static void trigger(ArrayList<FlightEnabled> fliers)
    {
        for(FlightEnabled flier: fliers)
        {
            flier.fly();
        }
    }


    // use interface List ---
    public static void triggerGood(List<FlightEnabled> fliers)
    {
        for(FlightEnabled flier: fliers)
        {
            flier.fly();
        }
    }



}
