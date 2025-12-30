package OOP.Inheritance;

public class Main {

    public static void main(String[] args) {

        // Animal object
        Animal animal = new Animal("Generic","Huge",40);
        doAnimalStuff(animal,"S4");


        // now Dog object
        Dog dog = new Dog();
        doAnimalStuff(dog,"S8");
    }


    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);

        // call to string method
        System.out.println(animal);
        System.out.println("---------");
    }
}
