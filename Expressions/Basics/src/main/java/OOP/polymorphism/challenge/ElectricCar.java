package OOP.polymorphism.challenge;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        this(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("battery size is "+batterySize + " is starting....");
    }

    @Override
    protected void runEngine() {
        System.out.println(avgKmPerCharge+"Km can be travelled per charge");
    }
}
