package OOP.polymorphism.challenge;

public class Main {

    // static method
    public static void runRace(Car car)
    {
        car.startEngine();
        car.drive();
    }
    public static void main(String[] args) {

        Car carOne = new Car("Allion");
        runRace(carOne);

        Car carTwo = new GasPoweredCar("Allion",3,5);
        runRace(carTwo);

        Car carThree = new ElectricCar("Byd",10,5);
        runRace(carThree);

        Car carFour = new HybridCar("Prius",10,6,20);
        runRace(carFour);


    }
}
