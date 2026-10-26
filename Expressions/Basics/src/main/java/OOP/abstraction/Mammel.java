package OOP.abstraction;


// abstract class that inherits from abstract class
public abstract class Mammel extends Animal {


    public Mammel(String type, String size, double weight) {
        super(type, size, weight);
    }


    // implement one abstract method in parent -- it is okay becasue abstract classes can have concrete methods
    @Override
    public void move(String speed) {
        System.out.println(getType() + " "+ (speed.equals("slow")?"walk":"runs"));
    }

    // another abstract method
    public abstract void shedHair();
}
