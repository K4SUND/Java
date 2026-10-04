package OOP.biggestChallenge.drinks;

public class Coke extends Drink{

    public Coke(String type, String size) {
        super(type, size);

        if(size.equals("small"))
        {
            setPrice(100);
        }else{
            setPrice(200);
        }

    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void printDetails() {
        System.out.println("Coke");
        System.out.println("Price:"+ getPrice());
        System.out.println("Size:"+ getSize());
    }
}
