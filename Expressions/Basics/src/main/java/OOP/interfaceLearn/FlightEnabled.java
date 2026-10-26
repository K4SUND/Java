package OOP.interfaceLearn;

import OOP.interfaceLearn.extendsInterface.enums.FlightStages;

public interface FlightEnabled {


    // Fields
    // implicitly --- public static final  --- constant
    public double KM_TO_MILES = 0.621371;
//    double KM_TO_MILES_2 = 0.621371;  -- correct way


    // public
    void fly();

    //protected --cant
    //private-- only with concrete methods


    // method
    default FlightStages transition(FlightStages stage)
    {
//        System.out.println("Transition is not implemented yet "+ getClass().getSimpleName());
//        return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from "+stage+" to "+nextStage);
        return nextStage;


    }


}
