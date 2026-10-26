package OOP.biggestChallengeTB;

public class Main {


    public static void main(String[] args) {

        /*
        Item coke = new Item("coke","drink",1.5);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();
        Item avocado = new Item("topping","avocado",1.5);
        avocado.printItem();

         */

        /*
        Burger burger = new Burger("regular",150);
        burger.addToppings("bacon","cheese","mayo");
        burger.printItem();

         */

        /*
        MealOrder meadOrder = new MealOrder();
//        meadOrder.printItemizedList();
        meadOrder.addBurgerToppings("bacon","cheese","mayo");
        meadOrder.setDrinkSize("large");
        meadOrder.printItemizedList();

         */

        /*

        MealOrder mealOrderTwo = new MealOrder("classic","coke","chilie");
        mealOrderTwo.addBurgerToppings("bacon","cheese","mayo");
        mealOrderTwo.setDrinkSize("large");
        mealOrderTwo.printItemizedList();


         */

        MealOrder deluxeMeal = new MealOrder("deluxe","7-Up","chili");
        deluxeMeal.addBurgerToppings("Avacado","bacon","Lattuce","chesse","mayo");
        deluxeMeal.setDrinkSize("Small");
        deluxeMeal.printItemizedList();

    }
}
