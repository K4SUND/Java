package OOP.biggestChallenge.burgers;

public class Burger {

    private String type;

    private int basePrice;

    private String toppingOne;
    private String toppingTwo;
    private String toppingThree;

    public Burger(String type, int basePrice) {
        this.type = type;
        this.basePrice = basePrice;
        toppingOne = "None";
        toppingTwo = "None";
        toppingThree = "None";
    }

    public void setToppingOne(String toppingOne, int price) {
        this.toppingOne = toppingOne;
        basePrice += price;
    }

    public void setToppingTwo(String toppingTwo, int price) {
        this.toppingTwo = toppingTwo;
        basePrice += price;
    }

    public void setToppingThree(String toppingThree, int price) {
        this.toppingThree = toppingThree;
        basePrice += price;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;

    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getToppingOne() {
        return toppingOne;
    }

    public String getToppingTwo() {
        return toppingTwo;
    }

    public String getToppingThree() {
        return toppingThree;
    }

    public void printDetails()
    {
        System.out.println(type);
        System.out.println("Price:"+ basePrice);
        System.out.println("ToppingOne:"+ toppingOne);
        System.out.println("ToppingTwo:"+ toppingTwo);
        System.out.println("ToppingThree:"+ toppingThree);
    }
}
