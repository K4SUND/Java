package OOP.interfaceLearn.extendsInterface;

import OOP.interfaceLearn.extendsInterface.enums.FlightStages;

public class Satellite implements OrbitEarth{

    private FlightStages stage = FlightStages.INTRANSIT;


    @Override
    public void orbit() {
        System.out.println(getClass().getSimpleName() + " orbit achieved");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
        transition("Transition in Satellite");

    }


    public void transition(String description) {
        System.out.println(description);
        transition(stage);
        stage.track();
    }
}
