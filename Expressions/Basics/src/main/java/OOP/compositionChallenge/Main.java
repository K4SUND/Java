package OOP.compositionChallenge;

public class Main {
    public static void main(String[] args) {

        /*
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
        DishWasher dishWasher = new DishWasher(false);
        Refrigerator refrigerator = new Refrigerator(false);


        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker,dishWasher, refrigerator);
        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIceBox().orderFood();

         */

        SmartKitchen smartKitchen1 = new SmartKitchen();

        // set true
        smartKitchen1.getBrewMaster().setHasWorkTodo(true);
        smartKitchen1.getDishWasher().setHasWorkTodo(true);
        smartKitchen1.getIceBox().setHasWorkToDo(true);

        smartKitchen1.getBrewMaster().brewCoffee();
        smartKitchen1.getDishWasher().doDishes();
        smartKitchen1.getIceBox().orderFood();


        // hide details
        SmartKitchen smartKitchen2 = new SmartKitchen();
        smartKitchen2.setKitchenState(true,true,false);
        smartKitchen2.doKitchenWork();


    }
}
