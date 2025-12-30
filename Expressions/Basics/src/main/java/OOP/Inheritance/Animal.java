package OOP.Inheritance;

public class Animal {

    //protected
    // 1. same package
    // 2. subclass
    protected String type;
    private String size;
    private double weight;

    // constructor - overloaded
    // imp : when we create overloaded constructor then default constructor is not creating by java
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    // so we create default constructor manualy


    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves "+speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }




}
