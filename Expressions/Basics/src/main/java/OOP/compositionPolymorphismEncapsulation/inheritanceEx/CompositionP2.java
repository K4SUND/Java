package OOP.compositionPolymorphismEncapsulation.inheritanceEx;

public class CompositionP2 {

    public static void main(String[] args) {

        Monitor monitor = new Monitor("ThinkPad","Lenovo","24*24",24);
        MotherBoard motherBoard = new MotherBoard(
                "Katana",
                "MSI",
                4,
                5,
                "Windows"
        );

        PersonalComputer personalComputer = new PersonalComputer ("" +
                "MSI",
                "SriLanka",
                monitor,
                motherBoard
        );

        // call composite methods
        // 1. return object
        // 2. call composite method
        personalComputer.getMonitor().drawPixelAt(
                10,
                20,
                "Blue"
        );

        personalComputer.getMotherBoard().loadProgram(
                "IntelliJId"
        );

        personalComputer.powerOn();




    }
}
