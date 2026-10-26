package OOP.interfaceLearn.extendsInterface.records;

import OOP.interfaceLearn.FlightEnabled;

public record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" flying");
    }
}
