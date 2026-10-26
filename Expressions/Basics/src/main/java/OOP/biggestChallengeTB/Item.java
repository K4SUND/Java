package OOP.biggestChallengeTB;

public class Item {


    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getPrice() - 0.5;
            case "LARGE" -> getPrice() + 0.5;
            default -> getPrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());

    }


}
