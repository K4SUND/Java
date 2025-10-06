package OOP;

//import OOP.privatecheck.CarThree;
//import OOP.privatecheck.CarTwo;

public class CarSetDefault {

//    CarThree carThree;      not accessed -> private and another package
//    CarTwo carTwo;    has acceseed

    private String make = "tesla";
    private String model = "model x";
    private String color = "gray";
    private int doors = 2;
    private boolean convertible = true;

    /*
    //Non-static field 'make' cannot be referenced from a static context
    public static String getM()
    {
        String m = make +model;
        return m;
    }

     */

    //getter methods
    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    // because of return type is boolean "is" prefix is there
    public boolean isConvertible() {
        return convertible;
    }


    //this --> the current object
    public void setModel(String model) {
        this.model = model;
    }


    //add validation
    //ex : only three manufacturers
    // 'porsche','tesla','holden'
    //can't be null

    public void setMake(String make) {
        if(make == null) make = "Unknown";
        //check the manufacturer
        //to lower case
        make = make.toLowerCase();
        switch (make){
            case "holden","porsche","tesla" -> this.make = make; // case value : ...
            default -> this.make = "Unsupported";
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(make + " " + model + " " + color + " " + doors + " " + convertible + (convertible ? " Convertible" : " Not convertible"));
    }
}


//not assign values
//but show values
//default
// non-primitive -- null
//primitive -- default values
// boolean - false
// byte,short, int, long, char - 0
// float, double - 0.0

