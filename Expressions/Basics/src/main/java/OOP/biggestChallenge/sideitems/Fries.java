package OOP.biggestChallenge.sideitems;

public class Fries extends SideItems{

    public Fries(String type, int price) {
        super(type, price);
    }

    public void printDetails()
    {
        System.out.println("Fries");
        System.out.println("Price:"+ getPrice());
    }

}
