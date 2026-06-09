package OOP.thiskeyword;

public class Shape {

    private String name;
    private int length;
    private int width;


    public Shape() {
        this("Rectangle");
    }

    public Shape(String name) {
        this(name,0,0);
    }

    public Shape(String name,int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
}
