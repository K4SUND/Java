package OOP.Inheritance;

public class DogWithSpecific extends Animal{

    private String earShape;
    private String tailShape;

    public DogWithSpecific() {
        super("Mutt", "M", 20);
    }

    //constructor
    //constructor chaining


    // it has to call super class constructor.
    // super(..) or default constructor

    public DogWithSpecific(String earShape, String tailShape) {

        this("T2",40,earShape,tailShape);
//        this.earShape = earShape;
//       this.tailShape = tailShape;


    }

    public DogWithSpecific(String type,double weight, String earShape, String tailShape) {

        //super must be first
        super(type, weight<15?("small"):(weight<35?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }


    //toString method

    // super. notation --
    // --  is not super()
    // -- is not this.
    // this is for calling super class methods


    @Override
    public String toString() {
        return "DogWithSpecific{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }


    // 1.
    // full change the parent function
    // makenoise
    // same method signature

    public void makeNoise(){
        System.out.println("Now full changed");

        if(type == "Mutt"){
            System.out.println("ooooooooo");
        }
        //changed to dog specific
        bark();
        System.out.println();
    }


    // 2.
    // extend
    // using override keyword -- it is notify that this method is in parent class and here it is overriden


    @Override
    public void move(String speed) {
//        super.move(speed);  // no any change - it calls to parent method

        super.move(speed);
        System.out.println("Added this line");
        if(speed=="S5"){
            run();
            bark();

        }else {
            walk();
            wagTail();
        }
        System.out.println();

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        // call to string method
        System.out.println(animal);
        System.out.println("---------");


    }




    private void bark(){
        System.out.print("Barking...");
    }
    private void walk(){
        System.out.print("Dog walking...");
    }
    private void run(){
        System.out.print("Dog running...");
    }
    private void wagTail(){
        System.out.print("Tail wagging....");
    }



    public static void main(String[] args) {
        DogWithSpecific dog = new DogWithSpecific();
        doAnimalStuff(dog,"S5");

        DogWithSpecific dog2 = new DogWithSpecific("e1","t1");
        doAnimalStuff(dog2,"S4");
    }



}
