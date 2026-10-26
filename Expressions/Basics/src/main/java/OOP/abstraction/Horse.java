package OOP.abstraction;

public class Horse extends Mammel{


    // call mammmel constructor
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getType()+ " sheds in spring");
    }

    @Override
    public void makeNoise() {

    }
}
