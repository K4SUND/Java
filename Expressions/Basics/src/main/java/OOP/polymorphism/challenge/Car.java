package OOP.polymorphism.challenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting....");

    }

    public void drive() {

        System.out.println("Driving...." + this.getClass().getSimpleName());
        runEngine();
    }

    // subclasses can override
    // other classes not in the same package can't access
    protected void runEngine() {
        System.out.println("Running.....");
    }
}
