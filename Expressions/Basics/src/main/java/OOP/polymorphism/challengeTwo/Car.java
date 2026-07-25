package OOP.polymorphism.challengeTwo;

public class Car {
    // write code here

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels ;


    public Car(int cylinders, String name)
    {
        engine = true;
        wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }


    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate()
    {
        return getClass().getSimpleName()+" -> accelerate()";
    }

    public String brake()
    {
        return getClass().getSimpleName()+" -> brake()";
    }
}


