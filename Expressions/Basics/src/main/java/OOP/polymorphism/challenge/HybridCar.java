package OOP.polymorphism.challenge;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        this(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }


    //battery
    //cylinder
    @Override
    public void startEngine() {
        System.out.println(cylinders+" cylinders starting.....");
        System.out.println("battery size is "+batterySize + " is starting....");
    }

    @Override
    protected void runEngine() {
        System.out.println(avgKmPerLitre+"Km can be travelled per litr");
    }
}
