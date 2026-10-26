package OOP.interfaceLearn;

public class Main {
    public static void main(String[] args) {
        Bird animal = new Bird();
        animal.move();
//        animal.

        Trackable getTrackMethods = animal;
        FlightEnabled getFlightEnabledMethods = animal;


        // Bird is runtime object here
        System.out.println(getTrackMethods.getClass().getSimpleName());
        System.out.println(getFlightEnabledMethods.getClass().getSimpleName());

        getTrackMethods.track();
        getFlightEnabledMethods.fly();


        // inFlight calling
        inFlight(animal);
//        inFlight(getTrackMethods);    can't
        inFlight(getFlightEnabledMethods);

        // Jet class instance pass to inFlight method
        inFlight(new Jet());

//        Truck truck = new Truck();
//        Trackable truckTrackable = truck;
        Trackable trackableTruck = new Truck();
        trackableTruck.track();



        // access Fields in interface
        double kmsTravel = 100;
        double milesTravel = kmsTravel*FlightEnabled.KM_TO_MILES;
        System.out.printf("Travelled %.2f km or %.2f miles %n",kmsTravel,milesTravel);


    }

    private static void inFlight(FlightEnabled flightEnabled)
    {
        flightEnabled.fly();
        if(flightEnabled instanceof Trackable trackable)
        {
            trackable.track();
        }

    }
}
