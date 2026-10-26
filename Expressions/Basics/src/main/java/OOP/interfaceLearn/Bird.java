package OOP.interfaceLearn;


// Bird is an animal
// Bird can ....

public class Bird extends Animal implements FlightEnabled,Trackable{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName()+" is moving");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" can fly");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" is tracking");
    }
}
