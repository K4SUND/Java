package OOP.compositionPolymorphismEncapsulation.inheritanceEx;

public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}


// no modifier : package private
// classes in the same package can use this
// accessible only inside the same package
class Monitor extends Product{

    private int size;
    private String resolution;



    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, String resolution, int size) {
        this(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
    }

    public void drawPixelAt(int x, int y, String color)
    {
        System.out.println(String.format("Draw at %d %d ; color is %s ", x,y,color));
    }
}

class MotherBoard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println(programName + " loading....");
    }
}
