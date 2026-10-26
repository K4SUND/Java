package OOP.biggestChallenge;

import OOP.biggestChallenge.burgers.Burger;
import OOP.biggestChallenge.burgers.Deluxe;
import OOP.biggestChallenge.drinks.Coke;
import OOP.biggestChallenge.drinks.Drink;
import OOP.biggestChallenge.sideitems.SideItems;

public class Main {


    public static void main(String[] args) {
        MealOrder defaultMeal = new MealOrder();


        Burger burgerOne = new Burger("Classic",250);
        burgerOne.setToppingOne("1",10);
        burgerOne.setToppingTwo("2",20);
        burgerOne.setToppingThree("3",30);

        Drink pepsi = new Drink("pepsi","Small");
        SideItems cake = new SideItems("cheeseCake",200);

        MealOrder orderOne = new MealOrder(burgerOne,pepsi,cake);


        //
        Deluxe deluxeBurger = new Deluxe("deluxe",200);
        deluxeBurger.setToppingOne("TO",20);
        deluxeBurger.setToppingTwo("TT",30);
        deluxeBurger.setToppingThree("TTh",40);
        deluxeBurger.setToppingFour("TF",50);
        deluxeBurger.setToppingFive("TFive",50);

        Drink potello = new Drink("potello","Medium");
        SideItems bun = new SideItems("bun",100);

        MealOrder orderTwo = new MealOrder(deluxeBurger,potello,bun);

        defaultMeal.printList();
        orderOne.printList();
        orderTwo.printList();



    }



}
