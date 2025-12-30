package OOP.Inheritance;


// Dog - subclass
// Animal - parent/ super class
public class Dog extends Animal{

    // constructor is not coming as others ( fields, methods ) - only default constructor is coming

    // fields are there now


    // no need because it calls parents default constuctor

    /*
    public Dog() {
        super();
    }

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

     */


    // create an contructor
    public Dog(){
        // call for parent's constructor
        super("Mutt","Big",40);
    }


    // question : how to access the parent private fields
    // ---- 1. call parents methods . those can access to private fields and methods as well
    public void printField(){
//        System.out.println(size);
    }
}
