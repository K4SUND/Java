package OOP.abstraction;

public class Fish extends Animal{


    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow"))
        {
            System.out.println(getType()+" slow swimming");
        }else {
            System.out.println(getType()+ " fast swimming");
        }
    }

    @Override
    public void makeNoise() {
        if(type.equals("Goldfish"))
        {
            System.out.println("swish..");
        }else {
            System.out.println("splash..");
        }

    }
}
