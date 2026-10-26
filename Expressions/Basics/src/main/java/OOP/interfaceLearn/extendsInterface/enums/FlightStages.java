package OOP.interfaceLearn.extendsInterface.enums;

import OOP.interfaceLearn.FlightEnabled;
import OOP.interfaceLearn.Trackable;

public enum FlightStages implements Trackable {
    GROUNDED,
    LAUNCH,
    INTRANSIT

    ;

    @Override
    public void track() {
        System.out.println((this != GROUNDED)?"Monitoring "+this : "Still in ground");
    }

    public FlightStages getNextStage()
    {
        FlightStages[] stages = values();
        return stages[(ordinal()+1)%stages.length];
    }
}
