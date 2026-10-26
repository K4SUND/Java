package OOP.interfaceLearn.jdk8enhancements;

import OOP.interfaceLearn.FlightEnabled;
import OOP.interfaceLearn.Jet;
import OOP.interfaceLearn.Trackable;
import OOP.interfaceLearn.extendsInterface.enums.FlightStages;

public class Main {

    public static void main(String[] args) {

        inFlight(new Jet());
    }


    private static void inFlight(FlightEnabled flightEnabled)
    {
        flightEnabled.fly();
        if(flightEnabled instanceof Trackable trackable)
        {
            trackable.track();
        }

        // new method calling
        flightEnabled.transition(FlightStages.GROUNDED);

    }
}
