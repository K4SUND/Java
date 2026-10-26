package OOP.abstraction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // can't create instances
//        Animal dog = new Animal("Rot","L",35.5);

//        Animal dog = new Dog("Rot","L",35.5);   == polymorphism
        Dog dog = new Dog("Wolf","L",35.5);
        dog.makeNoise();
        System.out.println(dog.getClass());

        // runtime polymorphism
        doAnimalMethods(dog);


        System.out.println("-".repeat(10));
        System.out.println("Animal hierarchy using");
        System.out.println("-".repeat(10));

        // here we can use Animal as generalize
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("NormalDog","M",10.5));
        animals.add(new Fish("Goldfish","L",50.0));
        animals.add(new Fish("Normalfish","L",50.0));


        animals.add(new Horse("NormalHorse","L",55.0));

        for(Animal animal:animals)
        {
            doAnimalMethods(animal);
            if( animal instanceof Mammel currentMammel)
            {
                currentMammel.shedHair();
            }
        }

    }


    // runtime
    // polymorphism
    public static void doAnimalMethods(Animal animal)
    {
        animal.move("slow");
        animal.makeNoise();


    }
}
