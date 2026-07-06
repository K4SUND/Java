package OOP.compositionPolymorphismEncapsulation.inheritanceEx;

public class PersonalComputer extends Product{


    // composed by other classes
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    private void loadProgram()
    {
        motherBoard.loadProgram("Power On");
        monitor.drawPixelAt(
                10,
                20,
                "Blue");

    }

    public void powerOn()
    {
        loadProgram();
    }


}
