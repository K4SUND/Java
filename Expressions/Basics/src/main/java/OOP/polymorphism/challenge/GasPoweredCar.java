package OOP.polymorphism.challenge;

public class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        this(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(cylinders+" cylinders starting.....");

    }


    @Override
    protected void runEngine() {
        System.out.println(avgKmPerLitre+"Km can be travelled per litr");
    }
}


