package OOP.biggestChallenge.drinks;

public class Drink {

    private String type;
    private String size;
    private int price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;

        if(size.equals("Small"))
        {
            price = 120;
        } else if (size.equals("Medium")) {
            price = 150;
        }else{
            price = 200;
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public void printDetails()
    {
        System.out.println(type);
        System.out.println("Price:"+ price);
        System.out.println("Size:"+ size);
    }
}
