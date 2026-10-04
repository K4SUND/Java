package OOP.biggestChallengeTB;

public class MealOrder {

    private Burger burger;
    private Item drink;
    private Item side;


    public MealOrder() {
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerName, String drinkName, String sideName) {

        if (burgerName.equalsIgnoreCase("deluxe")) {
            burger = new DeluxeBurger(burgerName, 8.5);
        } else {
            burger = new Burger(burgerName, 150);
        }

        drink = new Item(drinkName, "drink", 10);
        side = new Item(sideName, "side", 20);

    }

    public double getTotalPrice() {

        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        } else {

            return burger.getAdjustedPrice() +
                    drink.getAdjustedPrice() +
                    side.getAdjustedPrice();

        }

    }

    public void printItemizedList() {

        burger.printItem();

        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {


            drink.printItem();
            side.printItem();

        }


        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());

    }

    public void addBurgerToppings(String one, String two, String three) {
        burger.addToppings(one, two, three);
    }

    public void addBurgerToppings(String one, String two, String three, String four, String five) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(one, two, three, four, five);
        } else {

            burger.addToppings(one, two, three);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }


}
