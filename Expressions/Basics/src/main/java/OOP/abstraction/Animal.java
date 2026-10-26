package OOP.abstraction;


// abstract class
public abstract  class Animal {


    // subclasses can access
    protected String type;
    private String size;
    private double weight;


    // constructor --- subclasses call this --- can't create instances in the base class

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    // abstract methods
    // no body
    public abstract void move(String speed);
    public abstract void makeNoise();


    //concrete methods
    // usage -- use in the subclass
    // can override
//    public String getType()
//    {
//        // has body
//        return getClass().getSimpleName() + " ("+type+")";
//    }


    // can't override in subclasses --- because 'final' keyword
    public final String getType()
    {
        // has body
        return getClass().getSimpleName() + " ("+type+")";
    }


}
