package OOP.biggestChallenge.sideitems;

public class SideItems {

    private String type;
    private int price;

    public SideItems(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void printDetails()
    {
        System.out.println(type);
        System.out.println("Price:"+ price);
    }
}
