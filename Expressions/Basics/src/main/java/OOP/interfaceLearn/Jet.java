package OOP.interfaceLearn;

import OOP.interfaceLearn.extendsInterface.enums.FlightStages;

public class Jet implements FlightEnabled,Trackable{


    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is Flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " is Tracking");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName()+" transitioning");
        return  FlightEnabled.super.transition(stage);

    }
}
