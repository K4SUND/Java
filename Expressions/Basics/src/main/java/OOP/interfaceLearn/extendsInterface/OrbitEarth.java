package OOP.interfaceLearn.extendsInterface;

import OOP.interfaceLearn.FlightEnabled;
import OOP.interfaceLearn.extendsInterface.enums.FlightStages;

import java.util.Date;

public interface OrbitEarth extends FlightEnabled {

    void orbit();


    // static method
    static void log(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }

    // private static ---only access by concrete methods inside the interface
    private static void privateLog(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;

        // can call to a private static
        privateLog(description);
    }


    // can override from the parent interface
    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages next = FlightEnabled.super.transition(stage);
        logStage(next, "Transition to " + next);
        return next;
    }
}
