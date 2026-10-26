package OOP.interfaceLearn.jdk9enhanchements;

import OOP.interfaceLearn.extendsInterface.OrbitEarth;
import OOP.interfaceLearn.extendsInterface.Satellite;

public class Main {

    public static void main(String[] args) {

        // toString method ---
//        OrbitEarth.log("Test"+ new Satellite());
        orbitTest(new Satellite());
    }

    private static void orbitTest(OrbitEarth orbitEarth)
    {
        orbitEarth.fly();
        orbitEarth.orbit();

    }
}
