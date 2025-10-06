package OOP;

//import OOP.privatecheck.CarThree;
//import OOP.privatecheck.CarTwo;

public class CarJavaDefault {

//    CarThree carThree;      not accessed -> private and another package
//    CarTwo carTwo;    has acceseed

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar(){
        System.out.println(make + " " + model + " " + color + " " + doors + " "+ convertible +  (convertible?" Convertible":" Not convertible"));
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

