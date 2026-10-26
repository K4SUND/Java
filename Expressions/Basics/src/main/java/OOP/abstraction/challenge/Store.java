package OOP.abstraction.challenge;

import OOP.abstraction.challenge.products.Laptop;
import OOP.abstraction.challenge.products.MobilePhone;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> productsForSale = new ArrayList<>();


    public static void listProducts()
    {
        for(ProductForSale product:productsForSale)
        {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }


    public static void addItemToOrder(ArrayList<OrderItem> orders, int orderIndex, int quantity) {
            orders.add(new OrderItem(quantity,productsForSale.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> orders)
    {

        double totalSale = 0;

        for(OrderItem order:orders)
        {

            order.product().printPricedItem(order.quantity());
            totalSale += order.product().getSalesPrice(order.quantity());

        }
        System.out.printf("Total Orders: %6.2f %n",totalSale);
    }
    public static void main(String[] args) {

        System.out.println("-".repeat(30));
        System.out.println("Products");
        System.out.println("-".repeat(30));
        productsForSale.add(new Laptop("Msi",2.30,"katana g1560"));
        productsForSale.add(new Laptop("Dell",1.30,"probook"));
        productsForSale.add(new MobilePhone("Nokia",4.30,"Lumia"));
        productsForSale.add(new MobilePhone("Samsung",0.30,"Dous"));
        listProducts();

        System.out.println("-".repeat(30));
        System.out.println("Orders");


        // create orders
        var orders = new ArrayList<OrderItem>();
        addItemToOrder(orders,0,2);
        addItemToOrder(orders,1,3);
        addItemToOrder(orders,2,2);
        addItemToOrder(orders,3,1);

        printOrder(orders);
        System.out.println("-".repeat(30));

    }
}
