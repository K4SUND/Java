package OOP.biggestChallengeTB;

public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "Burger", price);
    }

    @Override
    public double getAdjustedPrice() {
        return super.getPrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());

    }

    @Override
    public String getName() {
        return super.getName() + " Burger";
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;

        };
    }

    public void addToppings(String one, String two, String three) {
        this.extra1 = new Item(one, "TOPPING", getExtraPrice(one));
        this.extra2 = new Item(two, "TOPPING", getExtraPrice(two));
        this.extra3 = new Item(three, "TOPPING", getExtraPrice(three));

    }

    public void printItemList() {
        printItem("BASE BURGER", getPrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }


    }

    @Override
    public void printItem() {
        printItemList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
