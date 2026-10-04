package OOP.biggestChallenge.burgers;

public class Deluxe extends Burger{

    private String toppingFour;
    private String toppingFive;


    public Deluxe(String type, int basePrice) {
        super(type, basePrice);
    }

    @Override
    public void setToppingOne(String toppingOne, int price) {
        super.setToppingOne(toppingOne,price);

    }

    @Override
    public void setToppingTwo(String toppingTwo, int price) {
        super.setToppingTwo(toppingTwo,price);
    }

    @Override
    public void setToppingThree(String toppingThree, int price) {
        super.setToppingThree(toppingThree,price);
    }


    public void setToppingFour(String toppingFour, int price) {
        this.toppingFour = toppingFour;
        int newPrice = getBasePrice() + price;
        setBasePrice(newPrice);
    }

    public void setToppingFive(String toppingFive,int price) {
        this.toppingFive = toppingFive;
        int newPrice = getBasePrice() + price;
        setBasePrice(newPrice);
    }


    @Override
    public void printDetails()
    {
        System.out.println("Deluxe");
        System.out.println("Price:"+ getBasePrice());
        System.out.println("ToppingOne:"+ getToppingOne());
        System.out.println("ToppingTwo:"+ getToppingTwo());
        System.out.println("ToppingThree:"+ getToppingThree());
        System.out.println("ToppingFour:"+ toppingFour);
        System.out.println("ToppingFive:"+ toppingFive);
    }
}
