package OOP.compositionChallenge;

public class SmartKitchen {


    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen()
    {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkTodo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishWasher() {
        dishWasher.setHasWorkTodo(true);
    }


    // hide calling
    public void setKitchenState(boolean b1, boolean b2, boolean b3) {
        brewMaster.setHasWorkTodo(b1);
        iceBox.setHasWorkToDo(b2);
        dishWasher.setHasWorkTodo(b3);
    }

    public void doKitchenWork()
    {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();

    }


}
