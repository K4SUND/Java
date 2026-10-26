package OOP.biggestChallenge;

import OOP.biggestChallenge.burgers.Burger;
import OOP.biggestChallenge.burgers.Deluxe;
import OOP.biggestChallenge.burgers.Regular;
import OOP.biggestChallenge.drinks.Coke;
import OOP.biggestChallenge.drinks.Drink;
import OOP.biggestChallenge.sideitems.Fries;
import OOP.biggestChallenge.sideitems.SideItems;

public class MealOrder {

    Burger burger;
    Drink drink;
    SideItems sideItem;


    public MealOrder() {
        burger = new Regular("Regular", 300);
        drink = new Coke("Coke", "Small");
        sideItem = new Fries("Fries", 200);

    }

    public MealOrder(Burger burger, Drink drink, SideItems sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public void printList() {

        int price = 0;
        if (burger instanceof Deluxe deluxe) {
            deluxe.printDetails();

        } else {
            burger.printDetails();

        }
        price += burger.getBasePrice();

        if (drink instanceof Coke coke) {
            coke.printDetails();
        } else {
            drink.printDetails();
        }

        price += drink.getPrice();

        if (sideItem instanceof Fries fries) {
            fries.printDetails();
        } else {
            sideItem.printDetails();
        }
        price += sideItem.getPrice();

        //total
        System.out.println("Total Price:"+price);
    }
}
