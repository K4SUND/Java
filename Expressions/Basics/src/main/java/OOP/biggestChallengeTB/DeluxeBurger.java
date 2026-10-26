package OOP.biggestChallengeTB;

public class DeluxeBurger extends Burger{

    private Item deluxe1;
    private Item deluxe2;


    public DeluxeBurger(String name, double price) {
        super(name, price);
    }


    public void addToppings(String one, String two, String three, String four, String five) {
        super.addToppings(one, two, three);
        deluxe1 = new Item(four,"TOPPING",0);
        deluxe2 = new Item(five,"TOPPING",0);
    }

    @Override
    public void printItemList() {
        super.printItemList();
        if(deluxe1 != null)
        {
            deluxe1.printItem();
        }
        if(deluxe2 != null)
        {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
