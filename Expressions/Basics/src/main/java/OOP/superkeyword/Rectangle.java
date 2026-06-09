package OOP.superkeyword;

public class Rectangle extends Shape{


    //x,y
    private int width;
    private int height;

    // initialize x and y
    public Rectangle(int x, int y)
    {
        //constructor chain
        this(x,y,0,0);
    }

    public Rectangle(int x, int y, int width, int height)
    {
        super(x, y);
        this.width = width;
        this.height = height;
    }

}
