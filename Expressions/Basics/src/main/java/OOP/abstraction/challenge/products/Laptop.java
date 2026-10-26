package OOP.abstraction.challenge.products;

import OOP.abstraction.challenge.ProductForSale;

public class Laptop extends ProductForSale {

    public Laptop(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This "+type+" is a branded one");
        System.out.printf("The price is %6.2f %n",price);
        System.out.println(description);
    }
}
