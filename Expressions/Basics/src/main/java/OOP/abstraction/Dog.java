package OOP.abstraction;

public class Dog extends Animal{


    // constructor
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }


    // methods -- same signature
    @Override
    public void move(String speed) {
       if(speed.equals("slow"))
       {
           System.out.println(getType()+" walk");
       }else {
           System.out.println(getType()+" run");
       }
    }

    @Override
    public void makeNoise() {
        if(type == "Wolf")
        {
            System.out.println("Howling");
        }else {
            System.out.println("Woof");
        }
    }





}



